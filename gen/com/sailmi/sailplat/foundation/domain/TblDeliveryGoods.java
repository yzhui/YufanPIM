package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

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
 * TblDeliveryGoods generated by hbm2java
 */
@Entity
@Table(name = "tbl_delivery_goods", catalog = "sailplat")
public class TblDeliveryGoods implements java.io.Serializable {

	private Long id;
	private TblGoods tblGoodsByDDeliveryGoodsId;
	private TblGoods tblGoodsByDGoodsId;
	private TblUser tblUser;
	private Date addTime;
	private boolean deleteStatus;
	private int DStatus;
	private Date DBeginTime;
	private Date DEndTime;
	private Date DAuditTime;
	private Date DRefuseTime;

	public TblDeliveryGoods() {
	}

	public TblDeliveryGoods(boolean deleteStatus, int DStatus) {
		this.deleteStatus = deleteStatus;
		this.DStatus = DStatus;
	}

	public TblDeliveryGoods(TblGoods tblGoodsByDDeliveryGoodsId, TblGoods tblGoodsByDGoodsId, TblUser tblUser,
			Date addTime, boolean deleteStatus, int DStatus, Date DBeginTime, Date DEndTime, Date DAuditTime,
			Date DRefuseTime) {
		this.tblGoodsByDDeliveryGoodsId = tblGoodsByDDeliveryGoodsId;
		this.tblGoodsByDGoodsId = tblGoodsByDGoodsId;
		this.tblUser = tblUser;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.DStatus = DStatus;
		this.DBeginTime = DBeginTime;
		this.DEndTime = DEndTime;
		this.DAuditTime = DAuditTime;
		this.DRefuseTime = DRefuseTime;
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
	@JoinColumn(name = "d_delivery_goods_id")
	public TblGoods getTblGoodsByDDeliveryGoodsId() {
		return this.tblGoodsByDDeliveryGoodsId;
	}

	public void setTblGoodsByDDeliveryGoodsId(TblGoods tblGoodsByDDeliveryGoodsId) {
		this.tblGoodsByDDeliveryGoodsId = tblGoodsByDDeliveryGoodsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "d_goods_id")
	public TblGoods getTblGoodsByDGoodsId() {
		return this.tblGoodsByDGoodsId;
	}

	public void setTblGoodsByDGoodsId(TblGoods tblGoodsByDGoodsId) {
		this.tblGoodsByDGoodsId = tblGoodsByDGoodsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "d_admin_user_id")
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

	@Column(name = "d_status", nullable = false)
	public int getDStatus() {
		return this.DStatus;
	}

	public void setDStatus(int DStatus) {
		this.DStatus = DStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "d_begin_time", length = 10)
	public Date getDBeginTime() {
		return this.DBeginTime;
	}

	public void setDBeginTime(Date DBeginTime) {
		this.DBeginTime = DBeginTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "d_end_time", length = 10)
	public Date getDEndTime() {
		return this.DEndTime;
	}

	public void setDEndTime(Date DEndTime) {
		this.DEndTime = DEndTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "d_audit_time", length = 19)
	public Date getDAuditTime() {
		return this.DAuditTime;
	}

	public void setDAuditTime(Date DAuditTime) {
		this.DAuditTime = DAuditTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "d_refuse_time", length = 19)
	public Date getDRefuseTime() {
		return this.DRefuseTime;
	}

	public void setDRefuseTime(Date DRefuseTime) {
		this.DRefuseTime = DRefuseTime;
	}

}
