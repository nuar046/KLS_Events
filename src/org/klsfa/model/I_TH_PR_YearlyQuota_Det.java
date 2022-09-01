/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.klsfa.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for TH_PR_YearlyQuota_Det
 *  @author iDempiere (generated) 
 *  @version Release 10
 */
@SuppressWarnings("all")
public interface I_TH_PR_YearlyQuota_Det 
{

    /** TableName=TH_PR_YearlyQuota_Det */
    public static final String Table_Name = "TH_PR_YearlyQuota_Det";

    /** AD_Table_ID=1000026 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Amt */
    public static final String COLUMNNAME_Amt = "Amt";

	/** Set Amount.
	  * Amount
	  */
	public void setAmt (BigDecimal Amt);

	/** Get Amount.
	  * Amount
	  */
	public BigDecimal getAmt();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name TH_PR_YearlyQuota_Det_ID */
    public static final String COLUMNNAME_TH_PR_YearlyQuota_Det_ID = "TH_PR_YearlyQuota_Det_ID";

	/** Set TH_PR_YearlyQuota_Det	  */
	public void setTH_PR_YearlyQuota_Det_ID (int TH_PR_YearlyQuota_Det_ID);

	/** Get TH_PR_YearlyQuota_Det	  */
	public int getTH_PR_YearlyQuota_Det_ID();

    /** Column name TH_PR_YearlyQuota_Det_UU */
    public static final String COLUMNNAME_TH_PR_YearlyQuota_Det_UU = "TH_PR_YearlyQuota_Det_UU";

	/** Set TH_PR_YearlyQuota_Det_UU	  */
	public void setTH_PR_YearlyQuota_Det_UU (String TH_PR_YearlyQuota_Det_UU);

	/** Get TH_PR_YearlyQuota_Det_UU	  */
	public String getTH_PR_YearlyQuota_Det_UU();

    /** Column name TH_PR_YearlyQuota_ID */
    public static final String COLUMNNAME_TH_PR_YearlyQuota_ID = "TH_PR_YearlyQuota_ID";

	/** Set TH_PR_YearlyQuota	  */
	public void setTH_PR_YearlyQuota_ID (int TH_PR_YearlyQuota_ID);

	/** Get TH_PR_YearlyQuota	  */
	public int getTH_PR_YearlyQuota_ID();

	public I_TH_PR_YearlyQuota getTH_PR_YearlyQuota() throws RuntimeException;

    /** Column name Type_of_Bidding */
    public static final String COLUMNNAME_Type_of_Bidding = "Type_of_Bidding";

	/** Set Type_of_Bidding	  */
	public void setType_of_Bidding (String Type_of_Bidding);

	/** Get Type_of_Bidding	  */
	public String getType_of_Bidding();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
