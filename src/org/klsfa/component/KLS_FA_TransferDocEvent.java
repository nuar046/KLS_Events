package org.klsfa.component;
import java.util.List;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.klsfa.model.MKLS_FA_Transfer;
import org.klsfa.model.MKLS_FA_Transfer_Dt;
import org.osgi.service.event.Event;

public class KLS_FA_TransferDocEvent extends AbstractEventHandler {
 	private static CLogger log = CLogger.getCLogger(KLS_FA_TransferDocEvent.class);
		private String trxName = "";
		private PO po = null;

	@Override 
	protected void initialize() { 
		registerTableEvent(IEventTopics.DOC_BEFORE_COMPLETE, MKLS_FA_Transfer.Table_Name);
		log.info("KLS_FA_Transfer<PLUGIN> .. IS NOW INITIALIZED");
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
		if (po instanceof MKLS_FA_Transfer){
			if (IEventTopics.DOC_BEFORE_COMPLETE == type){
				MKLS_FA_Transfer modelpo = (MKLS_FA_Transfer)po;
				log.fine("MKLS_FA_Transfer changed: "+modelpo.get_ID());
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