/**

import java.sql.ResultSet;
import java.util.Properties;

public class MTH_PR_YearlyQuota extends X_TH_PR_YearlyQuota{

	private static final long serialVersionUID = -1L;

	public MTH_PR_YearlyQuota(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MTH_PR_YearlyQuota(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}