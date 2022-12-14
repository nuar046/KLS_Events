/*** Licensed under the KARMA v.1 Law of Sharing. As others have shared freely to you, so shall you share freely back to us.* If you shall try to cheat and find a loophole in this license, then KARMA will exact your share,* and your worldly gain shall come to naught and those who share shall gain eventually above you.* In compliance with previous GPLv2.0 works of Jorg Janke, Low Heng Sin, Carlos Ruiz and contributors.* This Module Creator is an idea put together and coded by Redhuan D. Oon (red1@red1.org)*/package org.klsfa.component;
import org.klsfa.model.MTH_PR_YearlyQuota;
import java.sql.ResultSet;
import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class TH_PR_YearlyQuotaModelFactory implements IModelFactory {
	@Override 	public Class<?> getClass(String tableName) {
		 if (tableName.equals(MTH_PR_YearlyQuota.Table_Name)){
			 return MTH_PR_YearlyQuota.class;
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, int Record_ID, String trxName) {
		 if (tableName.equals(MTH_PR_YearlyQuota.Table_Name)) {
		     return new MTH_PR_YearlyQuota(Env.getCtx(), Record_ID, trxName);
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, ResultSet rs, String trxName) {
		 if (tableName.equals(MTH_PR_YearlyQuota.Table_Name)) {
		     return new MTH_PR_YearlyQuota(Env.getCtx(), rs, trxName);
		   }
 		 return null;
	}
}
