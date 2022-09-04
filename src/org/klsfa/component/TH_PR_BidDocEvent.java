/*** Licensed under the KARMA v.1 Law of Sharing. As others have shared freely to you, so shall you share freely back to us.* If you shall try to cheat and find a loophole in this license, then KARMA will exact your share,* and your worldly gain shall come to naught and those who share shall gain eventually above you.* In compliance with previous GPLv2.0 works of Jorg Janke, Low Heng Sin, Carlos Ruiz and contributors.* This Module Creator is an idea put together and coded by Redhuan D. Oon (red1@red1.org)*/package org.klsfa.component;
import org.klsfa.model.MTH_PR_Bid;import org.klsfa.model.MTH_PR_YearlyQuota;import org.klsfa.model.MTH_PR_YearlyQuota_Det;import java.math.BigDecimal;import java.sql.Timestamp;import java.util.List;import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;import org.adempiere.exceptions.AdempiereException;import org.compiere.model.MConversionRate;import org.compiere.model.MPeriod;import org.compiere.model.MYear;
import org.compiere.model.PO;import org.compiere.model.Query;
import org.compiere.util.CLogger;import org.compiere.util.Env;
import org.osgi.service.event.Event;

public class TH_PR_BidDocEvent extends AbstractEventHandler {
 	private static CLogger log = CLogger.getCLogger(TH_PR_BidDocEvent.class);
		private String trxName = "";
		private PO po = null;

	@Override 
	protected void initialize() { 
		registerTableEvent(IEventTopics.DOC_BEFORE_COMPLETE, MTH_PR_Bid.Table_Name);
		log.info("TH_PR_Bid<PLUGIN> .. IS NOW INITIALIZED");
		}

	@Override 
	protected void doHandleEvent(Event event){
		String type = event.getTopic();
		if (type.equals(IEventTopics.AFTER_LOGIN)) {
	}
 		else {
			setPo(getPO(event));
			setTrxName(po.get_TrxName());
			log.info(" topic="+event.getTopic()+" po="+po);
			if (po instanceof MTH_PR_Bid){
				if (IEventTopics.DOC_BEFORE_COMPLETE == type){
					MTH_PR_Bid prBid = (MTH_PR_Bid)po;
					log.fine("MTH_PR_Bid changed: "+prBid.get_ID());					
					//Actual vs Quota TH_PR_YearlyQuota / det					//same Org, same FiscalYear, same Bid					BigDecimal actual = prBid.getTotalAmt();					String typebid = prBid.getType_of_Bidding();					int org = prBid.getAD_Org_ID();					prBid.getC_Currency_ID();					prBid.getCreated();					//MPeriod fiscalyear = MPeriod.get(prBid.getC_Period_ID());					String fiscalyear = "";					BigDecimal quota = Env.ZERO;									//getAmt from detail of Header MTH_PR_YearlyQuota = Org / Fiscal Year / BidType									//get detail total amount				//change to local currency THB				//get Quota from TH_PR_YEarlyQuotaDetail header same Org/Year/BidType					actual = MConversionRate.convert(Env.getCtx(), actual, prBid.getC_Currency_ID(),0, prBid.getAD_Client_ID(), prBid.getAD_Org_ID());										//get DateDoc to calculate Calendar Period Year to compare Fiscal Year					Timestamp yeardate = prBid.getDateDoc();					MPeriod fiscal = MPeriod.get(Env.getCtx(), yeardate, org,trxName); 					if (fiscal==null) 						throw new AdempiereException("No Document Date");					MTH_PR_YearlyQuota yearQuota = new Query(Env.getCtx(), MTH_PR_YearlyQuota.Table_Name,							 MTH_PR_YearlyQuota.COLUMNNAME_FiscalYear+"=?", trxName)							.setParameters(fiscal.getC_Year().getFiscalYear()).first();					if (yearQuota==null) {						throw new AdempiereException("No Fiscal Year for Quota"); 					}																	List<MTH_PR_YearlyQuota_Det> details = new Query(Env.getCtx(), MTH_PR_YearlyQuota_Det.Table_Name, 							MTH_PR_YearlyQuota_Det.COLUMNNAME_Type_of_Bidding+"=? AND "							+MTH_PR_YearlyQuota_Det.COLUMNNAME_AD_Org_ID+"=?", trxName)							.setParameters(typebid,org).list();					for (MTH_PR_YearlyQuota_Det detail:details) {						quota = quota.add(detail.getAmt());					}										if (actual.compareTo(quota)>0) {						prBid.setDocStatus(MTH_PR_Bid.STATUS_Invalid);						throw new AdempiereException(actual+" Amount More Than Quota = "+quota);					} else {						prBid.setDocStatus(MTH_PR_Bid.STATUS_Completed);					}			}
		}
	  }
 }

	private void setPo(PO eventPO) {
		 po = eventPO;
	}

	private void setTrxName(String get_TrxName) {
 	trxName = get_TrxName;
		}
}
