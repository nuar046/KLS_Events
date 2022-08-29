package org.klsfa.component;
import java.util.List;import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;import org.compiere.model.MAsset;
import org.compiere.model.PO;import org.compiere.model.Query;
import org.compiere.util.CLogger;import org.compiere.util.Env;
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
				// **DO SOMETHING** ;				// get org_id from KLS_FA_Transfer				// get Bpartner_id from KLS_FA_Transfer				// get location_id from KLS_FA_Transfer				// get asset_id from KLS_FA_TransferLine				// update org_id, Bpartner_id, location_id in A_Asset				MKLS_FA_Transfer fat = (MKLS_FA_Transfer) po ;				int orgid = fat.getAD_Org_ID();				int bpartnerid = fat.getC_BPartnerSR_ID();				int locationid = fat.getM_LocatorTo_ID();				List<MKLS_FA_Transfer_Dt> fatlines = new Query(Env.getCtx(),MKLS_FA_Transfer_Dt.Table_Name,MKLS_FA_Transfer.COLUMNNAME_KLS_FA_Transfer_ID+"=?",trxName)						.setParameters(fat.get_ID()).list();				// what did we get?  fatlines				for (MKLS_FA_Transfer_Dt fatline:fatlines) {					int assetid =fatline.getA_Asset_ID();					MAsset ass = new MAsset(Env.getCtx(),assetid,trxName);					ass.setAD_Org_ID(orgid);					ass.setC_BPartner_ID(bpartnerid);					ass.setM_Locator_ID(locationid);					ass.saveEx(trxName);				}
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
