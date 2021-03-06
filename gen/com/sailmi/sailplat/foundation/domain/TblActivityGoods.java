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
 * TblActivityGoods generated by hbm2java
 */
@Entity
@Table(name = "tbl_activity_goods", catalog = "sailplat")
public class TblActivityGoods implements java.io.Serializable {

	private Long id;
	private TblActivity tblActivity;
	private TblGoods tblGoods;
	private TblUser tblUser;
	private Date addTime;
	private boolean deleteStatus;
	private int agStatus;
	private BigDecimal agPrice;

	public TblActivityGoods() {
	}

	public TblActivityGoods(boolean deleteStatus, int agStatus) {
		this.deleteStatus = deleteStatus;
		this.agStatus = agStatus;
	}

	public TblActivityGoods(TblActivity tblActivity, TblGoods tblGoods, TblUser tblUser, Date addTime,
			boolean deleteStatus, int agStatus, BigDecimal agPrice) {
		this.tblActivity = tblActivity;
		this.tblGoods = tblGoods;
		this.tblUser = tblUser;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.agStatus = agStatus;
		this.agPrice = agPrice;
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
	@JoinColumn(name = "act_id")
	public TblActivity getTblActivity() {
		return this.tblActivity;
	}

	public void setTblActivity(TblActivity tblActivity) {
		this.tblActivity = tblActivity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ag_goods_id")
	public TblGoods getTblGoods() {
		return this.tblGoods;
	}

	public void setTblGoods(TblGoods tblGoods) {
		this.tblGoods = tblGoods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ag_admin_id")
	public TblUser getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(TblUser tblUser) {
		this.tblUser = tblUser;
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

	@Column(name = "ag_status", nullable = false)
	public int getAgStatus() {
		return this.agStatus;
	}

	public void setAgStatus(int agStatus) {
		this.agStatus = agStatus;
	}

	@Column(name = "ag_price", precision = 12)
	public BigDecimal getAgPrice() {
		return this.agPrice;
	}

	public void setAgPrice(BigDecimal agPrice) {
		this.agPrice = agPrice;
	}

}
