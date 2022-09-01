/**
import org.klsfa.model.MTH_PR_YearlyQuota_Det;
import java.sql.ResultSet;
import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class TH_PR_YearlyQuota_DetModelFactory implements IModelFactory {
	@Override 	public Class<?> getClass(String tableName) {
		 if (tableName.equals(MTH_PR_YearlyQuota_Det.Table_Name)){
			 return MTH_PR_YearlyQuota_Det.class;
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, int Record_ID, String trxName) {
		 if (tableName.equals(MTH_PR_YearlyQuota_Det.Table_Name)) {
		     return new MTH_PR_YearlyQuota_Det(Env.getCtx(), Record_ID, trxName);
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, ResultSet rs, String trxName) {
		 if (tableName.equals(MTH_PR_YearlyQuota_Det.Table_Name)) {
		     return new MTH_PR_YearlyQuota_Det(Env.getCtx(), rs, trxName);
		   }
 		 return null;
	}
}