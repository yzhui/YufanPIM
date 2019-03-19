package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblPredepositCash generated by hbm2java
 */
@Entity
@Table(name = "tbl_predeposit_cash", catalog = "sailplat")
public class TblPredepositCash implements java.io.Serializable {

	private Long id;
	private TblUser tblUserByCashAdminId;
	private TblUser tblUserByCashUserId;
	private Date addTime;
	private boolean deleteStatus;
	private String cashAccount;
	private String cashAdminInfo;
	private BigDecimal cashAmount;
	private String cashBank;
	private String cashInfo;
	private int cashPayStatus;
	private String cashPayment;
	private String cashSn;
	private int cashStatus;
	private String cashUserName;

	public TblPredepositCash() {
	}

	public TblPredepositCash(boolean deleteStatus, int cashPayStatus, int cashStatus) {
		this.deleteStatus = deleteStatus;
		this.cashPayStatus = cashPayStatus;
		this.cashStatus = cashStatus;
	}

	public TblPredepositCash(TblUser tblUserByCashAdminId, TblUser tblUserByCashUserId, Date addTime,
			boolean deleteStatus, String cashAccount, String cashAdminInfo, BigDecimal cashAmount, String cashBank,
			String cashInfo, int cashPayStatus, String cashPayment, String cashSn, int cashStatus,
			String cashUserName) {
		this.tblUserByCashAdminId = tblUserByCashAdminId;
		this.tblUserByCashUserId = tblUserByCashUserId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.cashAccount = cashAccount;
		this.cashAdminInfo = cashAdminInfo;
		this.cashAmount = cashAmount;
		this.cashBank = cashBank;
		this.cashInfo = cashInfo;
		this.cashPayStatus = cashPayStatus;
		this.cashPayment = cashPayment;
		this.cashSn = cashSn;
		this.cashStatus = cashStatus;
		this.cashUserName = cashUserName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cash_admin_id")
	public TblUser getTblUserByCashAdminId() {
		return this.tblUserByCashAdminId;
	}

	public void setTblUserByCashAdminId(TblUser tblUserByCashAdminId) {
		this.tblUserByCashAdminId = tblUserByCashAdminId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cash_user_id")
	public TblUser getTblUserByCashUserId() {
		return this.tblUserByCashUserId;
	}

	public void setTblUserByCashUserId(TblUser tblUserByCashUserId) {
		this.tblUserByCashUserId = tblUserByCashUserId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "addTime", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "deleteStatus", nullable = false)
	public boolean isDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	@Column(name = "cash_account")
	public String getCashAccount() {
		return this.cashAccount;
	}

	public void setCashAccount(String cashAccount) {
		this.cashAccount = cashAccount;
	}

	@Column(name = "cash_admin_info")
	public String getCashAdminInfo() {
		return this.cashAdminInfo;
	}

	public void setCashAdminInfo(String cashAdminInfo) {
		this.cashAdminInfo = cashAdminInfo;
	}

	@Column(name = "cash_amount", precision = 12)
	public BigDecimal getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	@Column(name = "cash_bank")
	public String getCashBank() {
		return this.cashBank;
	}

	public void setCashBank(String cashBank) {
		this.cashBank = cashBank;
	}

	@Column(name = "cash_info")
	public String getCashInfo() {
		return this.cashInfo;
	}

	public void setCashInfo(String cashInfo) {
		this.cashInfo = cashInfo;
	}

	@Column(name = "cash_pay_status", nullable = false)
	public int getCashPayStatus() {
		return this.cashPayStatus;
	}

	public void setCashPayStatus(int cashPayStatus) {
		this.cashPayStatus = cashPayStatus;
	}

	@Column(name = "cash_payment")
	public String getCashPayment() {
		return this.cashPayment;
	}

	public void setCashPayment(String cashPayment) {
		this.cashPayment = cashPayment;
	}

	@Column(name = "cash_sn")
	public String getCashSn() {
		return this.cashSn;
	}

	public void setCashSn(String cashSn) {
		this.cashSn = cashSn;
	}

	@Column(name = "cash_status", nullable = false)
	public int getCashStatus() {
		return this.cashStatus;
	}

	public void setCashStatus(int cashStatus) {
		this.cashStatus = cashStatus;
	}

	@Column(name = "cash_userName")
	public String getCashUserName() {
		return this.cashUserName;
	}

	public void setCashUserName(String cashUserName) {
		this.cashUserName = cashUserName;
	}

}
