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
/** Generated Model - DO NOT CHANGE */
package org.klsfa.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TH_PR_YearlyQuota_Det
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
public class X_TH_PR_YearlyQuota_Det extends PO implements I_TH_PR_YearlyQuota_Det, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220901L;

    /** Standard Constructor */
    public X_TH_PR_YearlyQuota_Det (Properties ctx, int TH_PR_YearlyQuota_Det_ID, String trxName)
    {
      super (ctx, TH_PR_YearlyQuota_Det_ID, trxName);
      /** if (TH_PR_YearlyQuota_Det_ID == 0)
        {
			setTH_PR_YearlyQuota_Det_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TH_PR_YearlyQuota_Det (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_TH_PR_YearlyQuota_Det[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amt 
		Amount
	  */
	public void setAmt (BigDecimal Amt)
	{
		set_Value (COLUMNNAME_Amt, Amt);
	}

	/** Get Amount.
		@return Amount
	  */
	public BigDecimal getAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TH_PR_YearlyQuota_Det.
		@param TH_PR_YearlyQuota_Det_ID TH_PR_YearlyQuota_Det	  */
	public void setTH_PR_YearlyQuota_Det_ID (int TH_PR_YearlyQuota_Det_ID)
	{
		if (TH_PR_YearlyQuota_Det_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TH_PR_YearlyQuota_Det_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TH_PR_YearlyQuota_Det_ID, Integer.valueOf(TH_PR_YearlyQuota_Det_ID));
	}

	/** Get TH_PR_YearlyQuota_Det.
		@return TH_PR_YearlyQuota_Det	  */
	public int getTH_PR_YearlyQuota_Det_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TH_PR_YearlyQuota_Det_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TH_PR_YearlyQuota_Det_UU.
		@param TH_PR_YearlyQuota_Det_UU TH_PR_YearlyQuota_Det_UU	  */
	public void setTH_PR_YearlyQuota_Det_UU (String TH_PR_YearlyQuota_Det_UU)
	{
		set_Value (COLUMNNAME_TH_PR_YearlyQuota_Det_UU, TH_PR_YearlyQuota_Det_UU);
	}

	/** Get TH_PR_YearlyQuota_Det_UU.
		@return TH_PR_YearlyQuota_Det_UU	  */
	public String getTH_PR_YearlyQuota_Det_UU () 
	{
		return (String)get_Value(COLUMNNAME_TH_PR_YearlyQuota_Det_UU);
	}

	public I_TH_PR_YearlyQuota getTH_PR_YearlyQuota() throws RuntimeException
    {
		return (I_TH_PR_YearlyQuota)MTable.get(getCtx(), I_TH_PR_YearlyQuota.Table_Name)
			.getPO(getTH_PR_YearlyQuota_ID(), get_TrxName());	}

	/** Set TH_PR_YearlyQuota.
		@param TH_PR_YearlyQuota_ID TH_PR_YearlyQuota	  */
	public void setTH_PR_YearlyQuota_ID (int TH_PR_YearlyQuota_ID)
	{
		if (TH_PR_YearlyQuota_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TH_PR_YearlyQuota_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TH_PR_YearlyQuota_ID, Integer.valueOf(TH_PR_YearlyQuota_ID));
	}

	/** Get TH_PR_YearlyQuota.
		@return TH_PR_YearlyQuota	  */
	public int getTH_PR_YearlyQuota_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TH_PR_YearlyQuota_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Bid Recap = 10000001 */
	public static final String TYPE_OF_BIDDING_BidRecap = "10000001";
	/** Bid Waiver = 10000002 */
	public static final String TYPE_OF_BIDDING_BidWaiver = "10000002";
	/** Set Type_of_Bidding.
		@param Type_of_Bidding Type_of_Bidding	  */
	public void setType_of_Bidding (String Type_of_Bidding)
	{

		set_Value (COLUMNNAME_Type_of_Bidding, Type_of_Bidding);
	}

	/** Get Type_of_Bidding.
		@return Type_of_Bidding	  */
	public String getType_of_Bidding () 
	{
		return (String)get_Value(COLUMNNAME_Type_of_Bidding);
	}
}