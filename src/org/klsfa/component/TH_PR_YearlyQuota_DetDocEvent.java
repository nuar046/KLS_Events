/**
import org.klsfa.model.MTH_PR_YearlyQuota_Det;
import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

public class TH_PR_YearlyQuota_DetDocEvent extends AbstractEventHandler {
 	private static CLogger log = CLogger.getCLogger(TH_PR_YearlyQuota_DetDocEvent.class);
		private String trxName = "";
		private PO po = null;

	@Override 
	protected void initialize() { 
		registerTableEvent(IEventTopics.PO_AFTER_CHANGE, MTH_PR_YearlyQuota_Det.Table_Name);
		log.info("TH_PR_YearlyQuota_Det<PLUGIN> .. IS NOW INITIALIZED");
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
		if (po instanceof MTH_PR_YearlyQuota_Det){
			if (IEventTopics.PO_AFTER_CHANGE == type){
				MTH_PR_YearlyQuota_Det modelpo = (MTH_PR_YearlyQuota_Det)po;
	log.fine("MTH_PR_YearlyQuota_Det changed: "+modelpo.get_ID());
	// **DO SOMETHING** ;
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