/**

import java.sql.ResultSet;
import java.util.Properties;

public class MTH_PR_YearlyQuota_Det extends X_TH_PR_YearlyQuota_Det{

	private static final long serialVersionUID = -1L;

	public MTH_PR_YearlyQuota_Det(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MTH_PR_YearlyQuota_Det(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}