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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for TH_PR_YearlyQuota
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
public class X_TH_PR_YearlyQuota extends PO implements I_TH_PR_YearlyQuota, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220901L;

    /** Standard Constructor */
    public X_TH_PR_YearlyQuota (Properties ctx, int TH_PR_YearlyQuota_ID, String trxName)
    {
      super (ctx, TH_PR_YearlyQuota_ID, trxName);
      /** if (TH_PR_YearlyQuota_ID == 0)
        {
			setTH_PR_YearlyQuota_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TH_PR_YearlyQuota (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TH_PR_YearlyQuota[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Year.
		@param FiscalYear 
		The Fiscal Year
	  */
	public void setFiscalYear (String FiscalYear)
	{
		set_Value (COLUMNNAME_FiscalYear, FiscalYear);
	}

	/** Get Year.
		@return The Fiscal Year
	  */
	public String getFiscalYear () 
	{
		return (String)get_Value(COLUMNNAME_FiscalYear);
	}

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

	/** Set TH_PR_YearlyQuota_UU.
		@param TH_PR_YearlyQuota_UU TH_PR_YearlyQuota_UU	  */
	public void setTH_PR_YearlyQuota_UU (String TH_PR_YearlyQuota_UU)
	{
		set_Value (COLUMNNAME_TH_PR_YearlyQuota_UU, TH_PR_YearlyQuota_UU);
	}

	/** Get TH_PR_YearlyQuota_UU.
		@return TH_PR_YearlyQuota_UU	  */
	public String getTH_PR_YearlyQuota_UU () 
	{
		return (String)get_Value(COLUMNNAME_TH_PR_YearlyQuota_UU);
	}
}