package org.klsfa.component;
import java.util.List;import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;import org.compiere.model.MAsset;
import org.compiere.model.MAssetAddition;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MSequence;
import org.compiere.model.PO;import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.DB;import org.compiere.util.Env;
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
		registerTableEvent(IEventTopics.DOC_AFTER_COMPLETE, MInvoice.Table_Name);
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
		if (po instanceof MInvoice){
			//https://siameseninja.atlassian.net/jira/software/projects/MT/boards/1?selectedIssue=MT-13
			//to apply Value DocumentSequence if exists
			MSequence sequence = new Query(Env.getCtx(),MSequence.Table_Name,MSequence.COLUMNNAME_Name+"=? AND "+MSequence.COLUMNNAME_AD_Client_ID+"=?", null)
					.setParameters("DocumentNo_"+MAsset.Table_Name,po.getAD_Client_ID()).first();
			if (sequence==null)
				return;
			if (sequence.getPrefix().isBlank() || sequence.getPrefix().isEmpty())
				return;
			MInvoice invoice = (MInvoice)po;
			//check Invoice Vendor, Create Asset in Line
			if (invoice.isSOTrx())
				return;
			//check attached AssetAddition(s) for each InvoiceLine product
			List<MAssetAddition> adds = new Query(Env.getCtx(), MAssetAddition.Table_Name,MAssetAddition.COLUMNNAME_C_Invoice_ID+"=?",trxName)
					.setParameters(invoice.get_ID()).list();
			if (adds==null)
				return;
			//fetch Asset(s)
			for (MAssetAddition add:adds) { 
				MAsset asset = (MAsset) add.getA_Asset();
				//fetch related invoiceline
				MInvoiceLine invline = (MInvoiceLine) add.getC_InvoiceLine();
				if (!invline.isA_CreateAsset())
					return;
				//if somehow value is not same or possibly null then it is not our case
				if (!asset.getValue().equals(asset.getName()))
					return;
				//set Activation Date if empty
				if (asset.getAssetActivationDate()==null || asset.getAssetActivationDate().equals(""))
					asset.setAssetActivationDate(invoice.getDateInvoiced());
				String value = DB.getDocumentNo (asset.getAD_Client_ID(), MAsset.Table_Name, trxName, asset);
				asset.set_ValueNoCheck(MAsset.COLUMNNAME_Value, value);
				asset.saveEx(trxName);
			}
			
			
		}

		else if (po instanceof MKLS_FA_Transfer){
 
				MKLS_FA_Transfer modelpo = (MKLS_FA_Transfer)po;
				log.fine("MKLS_FA_Transfer changed: "+modelpo.get_ID());
				// **DO SOMETHING** ;				// get org_id from KLS_FA_Transfer				// get Bpartner_id from KLS_FA_Transfer				// get location_id from KLS_FA_Transfer				// get asset_id from KLS_FA_TransferLine				// update org_id, Bpartner_id, location_id in A_Asset				MKLS_FA_Transfer fat = (MKLS_FA_Transfer) po ;				int orgid = fat.getAD_Org_ID();				int bpartnerid = fat.getC_BPartnerSR_ID();				int locationid = fat.getM_LocatorTo_ID();				List<MKLS_FA_Transfer_Dt> fatlines = new Query(Env.getCtx(),MKLS_FA_Transfer_Dt.Table_Name,MKLS_FA_Transfer.COLUMNNAME_KLS_FA_Transfer_ID+"=?",trxName)						.setParameters(fat.get_ID()).list();				// what did we get?  fatlines				for (MKLS_FA_Transfer_Dt fatline:fatlines) {					int assetid =fatline.getA_Asset_ID();					MAsset ass = new MAsset(Env.getCtx(),assetid,trxName);					ass.setAD_Org_ID(orgid);					ass.setC_BPartner_ID(bpartnerid);					ass.setM_Locator_ID(locationid);					ass.saveEx(trxName);				}
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
