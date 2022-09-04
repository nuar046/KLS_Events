/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.klsfa.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TH_PR_Bid
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
public class X_TH_PR_Bid extends PO implements I_TH_PR_Bid, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220903L;

    /** Standard Constructor */
    public X_TH_PR_Bid (Properties ctx, int TH_PR_Bid_ID, String trxName)
    {
      super (ctx, TH_PR_Bid_ID, trxName);
      /** if (TH_PR_Bid_ID == 0)
        {
			setC_Currency_ID (0);
// @C_Currency_ID@
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setIsApproved (false);
			setIsOverrideCurrencyRate (false);
// N
			setIsPrinted (false);
			setIsSelfService (false);
			setProcessed (false);
			setTH_PR_Bid_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TH_PR_Bid (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_TH_PR_Bid[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Organization Sourcing.
		@param AD_OrgSource_ID 
		Organizational entity within client
	  */
	public void setAD_OrgSource_ID (int AD_OrgSource_ID)
	{
		if (AD_OrgSource_ID < 1) 
			set_Value (COLUMNNAME_AD_OrgSource_ID, null);
		else 
			set_Value (COLUMNNAME_AD_OrgSource_ID, Integer.valueOf(AD_OrgSource_ID));
	}

	/** Get Organization Sourcing.
		@return Organizational entity within client
	  */
	public int getAD_OrgSource_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgSource_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartnerSR() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartnerSR_ID(), get_TrxName());	}

	/** Set BPartner (Agent).
		@param C_BPartnerSR_ID 
		Business Partner (Agent or Sales Rep)
	  */
	public void setC_BPartnerSR_ID (int C_BPartnerSR_ID)
	{
		if (C_BPartnerSR_ID < 1) 
			set_Value (COLUMNNAME_C_BPartnerSR_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartnerSR_ID, Integer.valueOf(C_BPartnerSR_ID));
	}

	/** Get BPartner (Agent).
		@return Business Partner (Agent or Sales Rep)
	  */
	public int getC_BPartnerSR_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerSR_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartnerVen1() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartnerVen1_ID(), get_TrxName());	}

	/** Set Business Partner vendor1.
		@param C_BPartnerVen1_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartnerVen1_ID (int C_BPartnerVen1_ID)
	{
		if (C_BPartnerVen1_ID < 1) 
			set_Value (COLUMNNAME_C_BPartnerVen1_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartnerVen1_ID, Integer.valueOf(C_BPartnerVen1_ID));
	}

	/** Get Business Partner vendor1.
		@return Identifies a Business Partner
	  */
	public int getC_BPartnerVen1_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerVen1_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException
    {
		return (org.compiere.model.I_C_Project)MTable.get(getCtx(), org.compiere.model.I_C_Project.Table_Name)
			.getPO(getC_Project_ID(), get_TrxName());	}

	/** Set Project.
		@param C_Project_ID 
		Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID)
	{
		if (C_Project_ID < 1) 
			set_Value (COLUMNNAME_C_Project_ID, null);
		else 
			set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
	}

	/** Get Project.
		@return Financial Project
	  */
	public int getC_Project_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Rate.
		@param CurrencyRate 
		Currency Conversion Rate
	  */
	public void setCurrencyRate (BigDecimal CurrencyRate)
	{
		set_Value (COLUMNNAME_CurrencyRate, CurrencyRate);
	}

	/** Get Rate.
		@return Currency Conversion Rate
	  */
	public BigDecimal getCurrencyRate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrencyRate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Document Date.
		@param DateDoc 
		Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Description2.
		@param Description2 Description2	  */
	public void setDescription2 (String Description2)
	{
		set_Value (COLUMNNAME_Description2, Description2);
	}

	/** Get Description2.
		@return Description2	  */
	public String getDescription2 () 
	{
		return (String)get_Value(COLUMNNAME_Description2);
	}

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** <None> = -- */
	public static final String DOCACTION_None = "--";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Set Document Action.
		@param DocAction 
		The targeted status of the document
	  */
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction () 
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Override Currency Conversion Rate.
		@param IsOverrideCurrencyRate 
		Override Currency Conversion Rate
	  */
	public void setIsOverrideCurrencyRate (boolean IsOverrideCurrencyRate)
	{
		set_Value (COLUMNNAME_IsOverrideCurrencyRate, Boolean.valueOf(IsOverrideCurrencyRate));
	}

	/** Get Override Currency Conversion Rate.
		@return Override Currency Conversion Rate
	  */
	public boolean isOverrideCurrencyRate () 
	{
		Object oo = get_Value(COLUMNNAME_IsOverrideCurrencyRate);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Printed.
		@param IsPrinted 
		Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted)
	{
		set_ValueNoCheck (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
	}

	/** Get Printed.
		@return Indicates if this document / line is printed
	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_IsPrinted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Self-Service.
		@param IsSelfService 
		This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public void setIsSelfService (boolean IsSelfService)
	{
		set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
	}

	/** Get Self-Service.
		@return This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public boolean isSelfService () 
	{
		Object oo = get_Value(COLUMNNAME_IsSelfService);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set OtherRequired.
		@param OtherRequired 
		Other Special Requirements (if any)
	  */
	public void setOtherRequired (String OtherRequired)
	{
		set_Value (COLUMNNAME_OtherRequired, OtherRequired);
	}

	/** Get OtherRequired.
		@return Other Special Requirements (if any)
	  */
	public String getOtherRequired () 
	{
		return (String)get_Value(COLUMNNAME_OtherRequired);
	}

	/** Set Phone.
		@param Phone 
		Identifies a telephone number
	  */
	public void setPhone (String Phone)
	{
		set_ValueNoCheck (COLUMNNAME_Phone, Phone);
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone () 
	{
		return (String)get_Value(COLUMNNAME_Phone);
	}

	/** Set Price.
		@param Price 
		Price
	  */
	public void setPrice (BigDecimal Price)
	{
		set_Value (COLUMNNAME_Price, Price);
	}

	/** Get Price.
		@return Price
	  */
	public BigDecimal getPrice () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Price);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Purchase Requisition Received = 01 */
	public static final String PRICING_REVIEW_PurchaseRequisitionReceived = "01";
	/** Market Research = 02 */
	public static final String PRICING_REVIEW_MarketResearch = "02";
	/** Current Price List = 03 */
	public static final String PRICING_REVIEW_CurrentPriceList = "03";
	/** Comparison of similar products = 04 */
	public static final String PRICING_REVIEW_ComparisonOfSimilarProducts = "04";
	/** Comparison with independent estimate = 05 */
	public static final String PRICING_REVIEW_ComparisonWithIndependentEstimate = "05";
	/** Other (Please rectfy) : Vendor connection           = 06 */
	public static final String PRICING_REVIEW_OtherPleaseRectfyVendorConnection = "06";
	/** Set Pricing_Review.
		@param Pricing_Review Pricing_Review	  */
	public void setPricing_Review (String Pricing_Review)
	{

		set_Value (COLUMNNAME_Pricing_Review, Pricing_Review);
	}

	/** Get Pricing_Review.
		@return Pricing_Review	  */
	public String getPricing_Review () 
	{
		return (String)get_Value(COLUMNNAME_Pricing_Review);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed On.
		@param ProcessedOn 
		The date+time (expressed in decimal format) when the document has been processed
	  */
	public void setProcessedOn (BigDecimal ProcessedOn)
	{
		set_Value (COLUMNNAME_ProcessedOn, ProcessedOn);
	}

	/** Get Processed On.
		@return The date+time (expressed in decimal format) when the document has been processed
	  */
	public BigDecimal getProcessedOn () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ProcessedOn);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Bid Waiver/Recap approved = 1 */
	public static final String PROCURE_PUR_BidWaiverRecapApproved = "1";
	/** Bid Waiver/Recap disapproved = 2 */
	public static final String PROCURE_PUR_BidWaiverRecapDisapproved = "2";
	/** Set Procure_Pur.
		@param Procure_Pur Procure_Pur	  */
	public void setProcure_Pur (String Procure_Pur)
	{

		set_Value (COLUMNNAME_Procure_Pur, Procure_Pur);
	}

	/** Get Procure_Pur.
		@return Procure_Pur	  */
	public String getProcure_Pur () 
	{
		return (String)get_Value(COLUMNNAME_Procure_Pur);
	}

	/** Set Require_Specific.
		@param Require_Specific 
		Quality/ Review Requirements or Other Goods/ Services Specification
	  */
	public void setRequire_Specific (String Require_Specific)
	{
		set_Value (COLUMNNAME_Require_Specific, Require_Specific);
	}

	/** Get Require_Specific.
		@return Quality/ Review Requirements or Other Goods/ Services Specification
	  */
	public String getRequire_Specific () 
	{
		return (String)get_Value(COLUMNNAME_Require_Specific);
	}

	/** Compatibility for instructional purposes = Compatibility for instructional purposes */
	public static final String SOURCING_SU_CompatibilityForInstructionalPurposes = "Compatibility for instructional purposes";
	/** Compatibility for research = Compatibility for research */
	public static final String SOURCING_SU_CompatibilityForResearch = "Compatibility for research";
	/** Cooperation with other KLS organisation = Cooperation with other KLS organisation */
	public static final String SOURCING_SU_CooperationWithOtherKLSOrganisation = "Cooperation with other KLS organisation";
	/** Cost is public or government regulated = Cost is public or government regulated */
	public static final String SOURCING_SU_CostIsPublicOrGovernmentRegulated = "Cost is public or government regulated";
	/** De facto waiver = De facto waiver */
	public static final String SOURCING_SU_DeFactoWaiver = "De facto waiver";
	/** Desired Item for educ., training, or devel. Work = Desired Item for educ., training, or devel. Work */
	public static final String SOURCING_SU_DesiredItemForEducTrainingOrDevelWork = "Desired Item for educ., training, or devel. Work";
	/** Economic Concerning/ Condition/ Situation = Economic Concerning/ Condition/ Situation */
	public static final String SOURCING_SU_EconomicConcerningConditionSituation = "Economic Concerning/ Condition/ Situation";
	/** Exemption by the KLS Top Management/ SMT/ Executives = Exemption by the KLS Top Management/ SMT/ Executives */
	public static final String SOURCING_SU_ExemptionByTheKLSTopManagementSMTExecutives = "Exemption by the KLS Top Management/ SMT/ Executives";
	/** Exigency, urgency, emergency, Immediate need = Exigency, urgency, emergency, Immediate need */
	public static final String SOURCING_SU_ExigencyUrgencyEmergencyImmediateNeed = "Exigency, urgency, emergency, Immediate need";
	/** Favortire Vendors/ Service Providers List during period = Favortire Vendors/ Service Providers List during period */
	public static final String SOURCING_SU_FavortireVendorsServiceProvidersListDuringPeriod = "Favortire Vendors/ Service Providers List during period";
	/** Formal procurement would cost more/be inefficient/disruptive = Formal procurement would cost more/be inefficient/disruptive */
	public static final String SOURCING_SU_FormalProcurementWouldCostMoreBeInefficientDisruptive = "Formal procurement would cost more/be inefficient/disruptive";
	/** Formal solicitation will not give satisfactory results = Formal solicitation will not give satisfactory results */
	public static final String SOURCING_SU_FormalSolicitationWillNotGiveSatisfactoryResults = "Formal solicitation will not give satisfactory results";
	/** Inadequate Competition = Inadequate Competition */
	public static final String SOURCING_SU_InadequateCompetition = "Inadequate Competition";
	/** Intrinsic Value = Intrinsic Value */
	public static final String SOURCING_SU_IntrinsicValue = "Intrinsic Value";
	/** Long Term Agreements (LTAs) = Long Term Agreements (LTAs) */
	public static final String SOURCING_SU_LongTermAgreementsLTAs = "Long Term Agreements (LTAs)";
	/** Low value item = Low value item */
	public static final String SOURCING_SU_LowValueItem = "Low value item";
	/** No competitive market place = No competitive market place */
	public static final String SOURCING_SU_NoCompetitiveMarketPlace = "No competitive market place";
	/** On-Going Special Campaign/ Project/ Implementation = On-Going Special Campaign/ Project/ Implementation */
	public static final String SOURCING_SU_On_GoingSpecialCampaignProjectImplementation = "On-Going Special Campaign/ Project/ Implementation";
	/** Piggy backing on recent competition = Piggy backing on recent competition */
	public static final String SOURCING_SU_PiggyBackingOnRecentCompetition = "Piggy backing on recent competition";
	/** Prices and rates are official fixed = Prices and rates are official fixed */
	public static final String SOURCING_SU_PricesAndRatesAreOfficialFixed = "Prices and rates are official fixed";
	/** Procurement from Government entity = Procurement from Government entity */
	public static final String SOURCING_SU_ProcurementFromGovernmentEntity = "Procurement from Government entity";
	/** Professional services that cannot be objectively evaluated = Professional services that cannot be objectively evaluated */
	public static final String SOURCING_SU_ProfessionalServicesThatCannotBeObjectivelyEvaluated = "Professional services that cannot be objectively evaluated";
	/** Purchase or lease of real property = Purchase or lease of real property */
	public static final String SOURCING_SU_PurchaseOrLeaseOfRealProperty = "Purchase or lease of real property";
	/** Purchases of insurance or bonds = Purchases of insurance or bonds */
	public static final String SOURCING_SU_PurchasesOfInsuranceOrBonds = "Purchases of insurance or bonds";
	/** Reasonable/qualified or unique source = Reasonable/qualified or unique source */
	public static final String SOURCING_SU_ReasonableQualifiedOrUniqueSource = "Reasonable/qualified or unique source";
	/** Recent competition failed = Recent competition failed */
	public static final String SOURCING_SU_RecentCompetitionFailed = "Recent competition failed";
	/** Recent formal competition(within last 12 months)-RFP or ITB = Recent formal competition(within last 12 months)-RFP or ITB */
	public static final String SOURCING_SU_RecentFormalCompetitionWithinLast12Months_RFPOrITB = "Recent formal competition(within last 12 months)-RFP or ITB";
	/** Repair/replacement parts for non-competitive equipment = Repair/replacement parts for non-competitive equipment */
	public static final String SOURCING_SU_RepairReplacementPartsForNon_CompetitiveEquipment = "Repair/replacement parts for non-competitive equipment";
	/** Special Facilities/ Sources = Special Facilities/ Sources */
	public static final String SOURCING_SU_SpecialFacilitiesSources = "Special Facilities/ Sources";
	/** Special Market Conditions = Special Market Conditions */
	public static final String SOURCING_SU_SpecialMarketConditions = "Special Market Conditions";
	/** Standardization of KLS requirement = Standardization of KLS requirement */
	public static final String SOURCING_SU_StandardizationOfKLSRequirement = "Standardization of KLS requirement";
	/** Standardization of supplies = Standardization of supplies */
	public static final String SOURCING_SU_StandardizationOfSupplies = "Standardization of supplies";
	/** Substantial Time Pressure = Substantial Time Pressure */
	public static final String SOURCING_SU_SubstantialTimePressure = "Substantial Time Pressure";
	/** Technical and Specialized Consulting Services = Technical and Specialized Consulting Services */
	public static final String SOURCING_SU_TechnicalAndSpecializedConsultingServices = "Technical and Specialized Consulting Services";
	/** Time is critical = Time is critical */
	public static final String SOURCING_SU_TimeIsCritical = "Time is critical";
	/** Uniqueness = Uniqueness */
	public static final String SOURCING_SU_Uniqueness = "Uniqueness";
	/** Continuation of an existing contract  = Continuation of an existing contract  */
	public static final String SOURCING_SU_ContinuationOfAnExistingContract = "Continuation of an existing contract ";
	/** Existing product/ services using, Current Used Items = Existing product/ services using, Current Used Items */
	public static final String SOURCING_SU_ExistingProductServicesUsingCurrentUsedItems = "Existing product/ services using, Current Used Items";
	/** Follow to Bay's recommendation/ Standard = Follow to Bay's recommendation/ Standard */
	public static final String SOURCING_SU_FollowToBaySRecommendationStandard = "Follow to Bay's recommendation/ Standard";
	/** No commercially available substitute = No commercially available substitute */
	public static final String SOURCING_SU_NoCommerciallyAvailableSubstitute = "No commercially available substitute";
	/** No comparable competitive product = No comparable competitive product */
	public static final String SOURCING_SU_NoComparableCompetitiveProduct = "No comparable competitive product";
	/** Only one supplier can supply compliant goods/services = Only one supplier can supply compliant goods/services */
	public static final String SOURCING_SU_OnlyOneSupplierCanSupplyCompliantGoodsServices = "Only one supplier can supply compliant goods/services";
	/** Sole source of supply = Sole source of supply */
	public static final String SOURCING_SU_SoleSourceOfSupply = "Sole source of supply";
	/** Set Sourcing_SU.
		@param Sourcing_SU Sourcing_SU	  */
	public void setSourcing_SU (String Sourcing_SU)
	{

		set_Value (COLUMNNAME_Sourcing_SU, Sourcing_SU);
	}

	/** Get Sourcing_SU.
		@return Sourcing_SU	  */
	public String getSourcing_SU () 
	{
		return (String)get_Value(COLUMNNAME_Sourcing_SU);
	}

	/** Set Bid Recap.
		@param TH_PR_Bid_ID Bid Recap	  */
	public void setTH_PR_Bid_ID (int TH_PR_Bid_ID)
	{
		if (TH_PR_Bid_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TH_PR_Bid_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TH_PR_Bid_ID, Integer.valueOf(TH_PR_Bid_ID));
	}

	/** Get Bid Recap.
		@return Bid Recap	  */
	public int getTH_PR_Bid_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TH_PR_Bid_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TH_PR_Bid_UU.
		@param TH_PR_Bid_UU TH_PR_Bid_UU	  */
	public void setTH_PR_Bid_UU (String TH_PR_Bid_UU)
	{
		set_Value (COLUMNNAME_TH_PR_Bid_UU, TH_PR_Bid_UU);
	}

	/** Get TH_PR_Bid_UU.
		@return TH_PR_Bid_UU	  */
	public String getTH_PR_Bid_UU () 
	{
		return (String)get_Value(COLUMNNAME_TH_PR_Bid_UU);
	}

	/** Set Sourcing Requisition Form.
		@param TH_PR_Sourcing_ID Sourcing Requisition Form	  */
	public void setTH_PR_Sourcing_ID (int TH_PR_Sourcing_ID)
	{
		if (TH_PR_Sourcing_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TH_PR_Sourcing_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TH_PR_Sourcing_ID, Integer.valueOf(TH_PR_Sourcing_ID));
	}

	/** Get Sourcing Requisition Form.
		@return Sourcing Requisition Form	  */
	public int getTH_PR_Sourcing_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TH_PR_Sourcing_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total Amount.
		@param TotalAmt 
		Total Amount
	  */
	public void setTotalAmt (BigDecimal TotalAmt)
	{
		set_ValueNoCheck (COLUMNNAME_TotalAmt, TotalAmt);
	}

	/** Get Total Amount.
		@return Total Amount
	  */
	public BigDecimal getTotalAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Bid Recap = 10000001 */
	public static final String TYPE_OF_BIDDING_BidRecap = "10000001";
	/** Bid Waiver = 10000002 */
	public static final String TYPE_OF_BIDDING_BidWaiver = "10000002";
	/** Set Type_of_Bidding.
		@param Type_of_Bidding Type_of_Bidding	  */
	public void setType_of_Bidding (String Type_of_Bidding)
	{

		set_Value (COLUMNNAME_Type_of_Bidding, Type_of_Bidding);
	}

	/** Get Type_of_Bidding.
		@return Type_of_Bidding	  */
	public String getType_of_Bidding () 
	{
		return (String)get_Value(COLUMNNAME_Type_of_Bidding);
	}
}