/**
import java.sql.ResultSet;
import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class KLS_FA_TransferModelFactory implements IModelFactory {
	@Override 	public Class<?> getClass(String tableName) {
		 if (tableName.equals(MKLS_FA_Transfer.Table_Name)){
			 return MKLS_FA_Transfer.class;
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, int Record_ID, String trxName) {
		 if (tableName.equals(MKLS_FA_Transfer.Table_Name)) {
		     return new MKLS_FA_Transfer(Env.getCtx(), Record_ID, trxName);
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, ResultSet rs, String trxName) {
		 if (tableName.equals(MKLS_FA_Transfer.Table_Name)) {
		     return new MKLS_FA_Transfer(Env.getCtx(), rs, trxName);
		   }
 		 return null;
	}
}