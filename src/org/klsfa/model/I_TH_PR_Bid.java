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

/** Generated Interface for TH_PR_Bid
 *  @author iDempiere (generated) 
 *  @version Release 10
 */
@SuppressWarnings("all")
public interface I_TH_PR_Bid 
{

    /** TableName=TH_PR_Bid */
    public static final String Table_Name = "TH_PR_Bid";

    /** AD_Table_ID=1000011 */
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

    /** Column name AD_OrgSource_ID */
    public static final String COLUMNNAME_AD_OrgSource_ID = "AD_OrgSource_ID";

	/** Set Organization Sourcing.
	  * Organizational entity within client
	  */
	public void setAD_OrgSource_ID (int AD_OrgSource_ID);

	/** Get Organization Sourcing.
	  * Organizational entity within client
	  */
	public int getAD_OrgSource_ID();

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name C_BPartnerSR_ID */
    public static final String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";

	/** Set BPartner (Agent).
	  * Business Partner (Agent or Sales Rep)
	  */
	public void setC_BPartnerSR_ID (int C_BPartnerSR_ID);

	/** Get BPartner (Agent).
	  * Business Partner (Agent or Sales Rep)
	  */
	public int getC_BPartnerSR_ID();

	public org.compiere.model.I_C_BPartner getC_BPartnerSR() throws RuntimeException;

    /** Column name C_BPartnerVen1_ID */
    public static final String COLUMNNAME_C_BPartnerVen1_ID = "C_BPartnerVen1_ID";

	/** Set Business Partner vendor1.
	  * Identifies a Business Partner
	  */
	public void setC_BPartnerVen1_ID (int C_BPartnerVen1_ID);

	/** Get Business Partner vendor1.
	  * Identifies a Business Partner
	  */
	public int getC_BPartnerVen1_ID();

	public org.compiere.model.I_C_BPartner getC_BPartnerVen1() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_Project_ID */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

	/** Set Project.
	  * Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID);

	/** Get Project.
	  * Financial Project
	  */
	public int getC_Project_ID();

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException;

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

    /** Column name CurrencyRate */
    public static final String COLUMNNAME_CurrencyRate = "CurrencyRate";

	/** Set Rate.
	  * Currency Conversion Rate
	  */
	public void setCurrencyRate (BigDecimal CurrencyRate);

	/** Get Rate.
	  * Currency Conversion Rate
	  */
	public BigDecimal getCurrencyRate();

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Description2 */
    public static final String COLUMNNAME_Description2 = "Description2";

	/** Set Description2	  */
	public void setDescription2 (String Description2);

	/** Get Description2	  */
	public String getDescription2();

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

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

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

    /** Column name IsOverrideCurrencyRate */
    public static final String COLUMNNAME_IsOverrideCurrencyRate = "IsOverrideCurrencyRate";

	/** Set Override Currency Conversion Rate.
	  * Override Currency Conversion Rate
	  */
	public void setIsOverrideCurrencyRate (boolean IsOverrideCurrencyRate);

	/** Get Override Currency Conversion Rate.
	  * Override Currency Conversion Rate
	  */
	public boolean isOverrideCurrencyRate();

    /** Column name IsPrinted */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";

	/** Set Printed.
	  * Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted);

	/** Get Printed.
	  * Indicates if this document / line is printed
	  */
	public boolean isPrinted();

    /** Column name IsSelfService */
    public static final String COLUMNNAME_IsSelfService = "IsSelfService";

	/** Set Self-Service.
	  * This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public void setIsSelfService (boolean IsSelfService);

	/** Get Self-Service.
	  * This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public boolean isSelfService();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name OtherRequired */
    public static final String COLUMNNAME_OtherRequired = "OtherRequired";

	/** Set OtherRequired.
	  * Other Special Requirements (if any)
	  */
	public void setOtherRequired (String OtherRequired);

	/** Get OtherRequired.
	  * Other Special Requirements (if any)
	  */
	public String getOtherRequired();

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name Price */
    public static final String COLUMNNAME_Price = "Price";

	/** Set Price.
	  * Price
	  */
	public void setPrice (BigDecimal Price);

	/** Get Price.
	  * Price
	  */
	public BigDecimal getPrice();

    /** Column name Pricing_Review */
    public static final String COLUMNNAME_Pricing_Review = "Pricing_Review";

	/** Set Pricing_Review	  */
	public void setPricing_Review (String Pricing_Review);

	/** Get Pricing_Review	  */
	public String getPricing_Review();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name ProcessedOn */
    public static final String COLUMNNAME_ProcessedOn = "ProcessedOn";

	/** Set Processed On.
	  * The date+time (expressed in decimal format) when the document has been processed
	  */
	public void setProcessedOn (BigDecimal ProcessedOn);

	/** Get Processed On.
	  * The date+time (expressed in decimal format) when the document has been processed
	  */
	public BigDecimal getProcessedOn();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name Procure_Pur */
    public static final String COLUMNNAME_Procure_Pur = "Procure_Pur";

	/** Set Procure_Pur	  */
	public void setProcure_Pur (String Procure_Pur);

	/** Get Procure_Pur	  */
	public String getProcure_Pur();

    /** Column name Require_Specific */
    public static final String COLUMNNAME_Require_Specific = "Require_Specific";

	/** Set Require_Specific.
	  * Quality/ Review Requirements or Other Goods/ Services Specification
	  */
	public void setRequire_Specific (String Require_Specific);

	/** Get Require_Specific.
	  * Quality/ Review Requirements or Other Goods/ Services Specification
	  */
	public String getRequire_Specific();

    /** Column name Sourcing_SU */
    public static final String COLUMNNAME_Sourcing_SU = "Sourcing_SU";

	/** Set Sourcing_SU	  */
	public void setSourcing_SU (String Sourcing_SU);

	/** Get Sourcing_SU	  */
	public String getSourcing_SU();

    /** Column name TH_PR_Bid_ID */
    public static final String COLUMNNAME_TH_PR_Bid_ID = "TH_PR_Bid_ID";

	/** Set Bid Recap	  */
	public void setTH_PR_Bid_ID (int TH_PR_Bid_ID);

	/** Get Bid Recap	  */
	public int getTH_PR_Bid_ID();

    /** Column name TH_PR_Bid_UU */
    public static final String COLUMNNAME_TH_PR_Bid_UU = "TH_PR_Bid_UU";

	/** Set TH_PR_Bid_UU	  */
	public void setTH_PR_Bid_UU (String TH_PR_Bid_UU);

	/** Get TH_PR_Bid_UU	  */
	public String getTH_PR_Bid_UU();

    /** Column name TH_PR_Sourcing_ID */
    public static final String COLUMNNAME_TH_PR_Sourcing_ID = "TH_PR_Sourcing_ID";

	/** Set Sourcing Requisition Form	  */
	public void setTH_PR_Sourcing_ID (int TH_PR_Sourcing_ID);

	/** Get Sourcing Requisition Form	  */
	public int getTH_PR_Sourcing_ID();

    /** Column name TotalAmt */
    public static final String COLUMNNAME_TotalAmt = "TotalAmt";

	/** Set Total Amount.
	  * Total Amount
	  */
	public void setTotalAmt (BigDecimal TotalAmt);

	/** Get Total Amount.
	  * Total Amount
	  */
	public BigDecimal getTotalAmt();

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
