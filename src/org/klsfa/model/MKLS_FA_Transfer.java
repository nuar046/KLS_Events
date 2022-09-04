package org.klsfa.model;


import java.io.File;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.Msg;


/**
 * 	KLS_FA_Transfer Model
 *
 *	@author red1org@gmail.com  <<-- pls change for original code owner
 *	@version $Id: MKLS_FA_Transfer. 
 */
public class MKLS_FA_Transfer extends X_KLS_FA_Transfer implements DocAction {

	public MKLS_FA_Transfer(Properties ctx, int id, String trxName) {
		super(ctx, id, trxName);

		// TODO Auto-generated constructor stub
	}

	
	public MKLS_FA_Transfer(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);

		// TODO Auto-generated constructor stub
	}
	
	/**	Process Message 			*/
	private String		m_processMsg = null;

	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;


	@Override
	public boolean processIt(String action) throws Exception {
		m_processMsg = null;

		DocumentEngine engine = new DocumentEngine (this, getDocStatus());

		return engine.processIt (action, getDocAction());

	}


	@Override
	public boolean unlockIt() {
		if (log.isLoggable(Level.INFO)) log.info("unlockIt - " + toString());

		setProcessed(false);

		return true;

	}


	@Override
	public boolean invalidateIt() {
		if (log.isLoggable(Level.INFO)) log.info("invalidateIt - " + toString());

		setDocAction(DOCACTION_Prepare);

		return true;
 
	}


	@Override
	public String prepareIt() {
		if (log.isLoggable(Level.INFO)) log.info(toString());

		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);

		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);

		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;


		m_justPrepared = true;

		if (!DOCACTION_Complete.equals(getDocAction()))
			setDocAction(DOCACTION_Complete);

		return DocAction.STATUS_InProgress;
 
	}


	@Override
	public boolean approveIt() { 
		if (log.isLoggable(Level.INFO)) log.info("approveIt - " + toString());

			setIsApproved(true);

		return true;

	}


	@Override
	public boolean rejectIt() {
		if (log.isLoggable(Level.INFO)) log.info("rejectIt - " + toString());

			setIsApproved(false);

		return true;

	}


	@Override
	public String completeIt() {
		//	Re-Check
		if (!m_justPrepared)
		{
			String status = prepareIt();

			m_justPrepared = false;

			if (!DocAction.STATUS_InProgress.equals(status))
				return status;

		}

		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);

		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		
		//	Implicit Approval
		if (!isApproved())
			approveIt();

		if (log.isLoggable(Level.INFO)) log.info("completeIt - " + toString());


		//	User Validation
		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);

		if (valid != null)
		{
			m_processMsg = valid;

			return DocAction.STATUS_Invalid;

		}
		//
		setProcessed(true); 
		return STATUS_Completed;

	}


	@Override
	public boolean voidIt() {
		if (log.isLoggable(Level.INFO)) log.info("voidIt - " + toString());


		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);

		if (m_processMsg != null)
			return false;

		
		if (!closeIt())
			return false;

		
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);

		if (m_processMsg != null)
			return false;

		
		return true;

	}


	@Override
	public boolean closeIt() {
		if (log.isLoggable(Level.INFO)) log.info("closeIt - " + toString());

		// Before Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_CLOSE);

		if (m_processMsg != null)
			return false;

		// After Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE);

		if (m_processMsg != null)
			return false;


		return true;

	}


	@Override
	public boolean reverseCorrectIt() {
		if (log.isLoggable(Level.INFO)) log.info("reverseCorrectIt - " + toString());

		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);

		if (m_processMsg != null)
			return false;

		
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);

		if (m_processMsg != null)
			return false;

		
		return false;

	}


	@Override
	public boolean reverseAccrualIt() {
		if (log.isLoggable(Level.INFO)) log.info("reverseAccrualIt - " + toString());

		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);

		if (m_processMsg != null)
			return false;

		
		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);

		if (m_processMsg != null)
			return false;
		
		
		return false;

	}


	@Override
	public boolean reActivateIt() {
		if (log.isLoggable(Level.INFO)) log.info("reActivateIt - " + toString());

		// Before reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);

		if (m_processMsg != null)
			return false;
	
		
		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);

		if (m_processMsg != null)
			return false;

		
		setProcessed(false);

		return false;

	}


	@Override
	public String getSummary() {
		StringBuilder sb = new StringBuilder();

		sb.append(getDocumentNo());

		//	: Total Lines = 123.00 (#1)
		sb.append(": ");

		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());

		return sb.toString();

	}



	@Override
	public String getDocumentInfo() {
		return Msg.getElement(getCtx(), "S_TimeExpense_ID") + " " + getDocumentNo();
 
	}


	@Override
	public File createPDF() {
		// TODO Auto-generated method stub
		return null;

	}


	@Override
	public String getProcessMsg() {
		return m_processMsg;

	}


	@Override
	public int getDoc_User_ID() {
		return getCreatedBy();

	} 

	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return null;

	}


}

