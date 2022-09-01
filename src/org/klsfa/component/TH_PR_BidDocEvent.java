/**
import org.klsfa.model.MTH_PR_Bid;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
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
					//Actual vs Quota TH_PR_YearlyQuota / det
			}
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