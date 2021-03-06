package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblStoreStat generated by hbm2java
 */
@Entity
@Table(name = "tbl_store_stat", catalog = "sailplat")
public class TblStoreStat implements java.io.Serializable {

	private Long id;
	private Date addTime;
	private boolean deleteStatus;
	private int allGoods;
	private int allStore;
	private int allUser;
	private Date nextTime;
	private BigDecimal orderAmount;
	private int storeUpdate;
	private int weekComplaint;
	private int weekGoods;
	private int weekOrder;
	private int weekReport;
	private int weekStore;
	private int weekUser;

	public TblStoreStat() {
	}

	public TblStoreStat(boolean deleteStatus, int allGoods, int allStore, int allUser, int storeUpdate,
			int weekComplaint, int weekGoods, int weekOrder, int weekReport, int weekStore, int weekUser) {
		this.deleteStatus = deleteStatus;
		this.allGoods = allGoods;
		this.allStore = allStore;
		this.allUser = allUser;
		this.storeUpdate = storeUpdate;
		this.weekComplaint = weekComplaint;
		this.weekGoods = weekGoods;
		this.weekOrder = weekOrder;
		this.weekReport = weekReport;
		this.weekStore = weekStore;
		this.weekUser = weekUser;
	}

	public TblStoreStat(Date addTime, boolean deleteStatus, int allGoods, int allStore, int allUser, Date nextTime,
			BigDecimal orderAmount, int storeUpdate, int weekComplaint, int weekGoods, int weekOrder, int weekReport,
			int weekStore, int weekUser) {
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.allGoods = allGoods;
		this.allStore = allStore;
		this.allUser = allUser;
		this.nextTime = nextTime;
		this.orderAmount = orderAmount;
		this.storeUpdate = storeUpdate;
		this.weekComplaint = weekComplaint;
		this.weekGoods = weekGoods;
		this.weekOrder = weekOrder;
		this.weekReport = weekReport;
		this.weekStore = weekStore;
		this.weekUser = weekUser;
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

	@Column(name = "all_goods", nullable = false)
	public int getAllGoods() {
		return this.allGoods;
	}

	public void setAllGoods(int allGoods) {
		this.allGoods = allGoods;
	}

	@Column(name = "all_store", nullable = false)
	public int getAllStore() {
		return this.allStore;
	}

	public void setAllStore(int allStore) {
		this.allStore = allStore;
	}

	@Column(name = "all_user", nullable = false)
	public int getAllUser() {
		return this.allUser;
	}

	public void setAllUser(int allUser) {
		this.allUser = allUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "next_time", length = 19)
	public Date getNextTime() {
		return this.nextTime;
	}

	public void setNextTime(Date nextTime) {
		this.nextTime = nextTime;
	}

	@Column(name = "order_amount", precision = 12)
	public BigDecimal getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Column(name = "store_update", nullable = false)
	public int getStoreUpdate() {
		return this.storeUpdate;
	}

	public void setStoreUpdate(int storeUpdate) {
		this.storeUpdate = storeUpdate;
	}

	@Column(name = "week_complaint", nullable = false)
	public int getWeekComplaint() {
		return this.weekComplaint;
	}

	public void setWeekComplaint(int weekComplaint) {
		this.weekComplaint = weekComplaint;
	}

	@Column(name = "week_goods", nullable = false)
	public int getWeekGoods() {
		return this.weekGoods;
	}

	public void setWeekGoods(int weekGoods) {
		this.weekGoods = weekGoods;
	}

	@Column(name = "week_order", nullable = false)
	public int getWeekOrder() {
		return this.weekOrder;
	}

	public void setWeekOrder(int weekOrder) {
		this.weekOrder = weekOrder;
	}

	@Column(name = "week_report", nullable = false)
	public int getWeekReport() {
		return this.weekReport;
	}

	public void setWeekReport(int weekReport) {
		this.weekReport = weekReport;
	}

	@Column(name = "week_store", nullable = false)
	public int getWeekStore() {
		return this.weekStore;
	}

	public void setWeekStore(int weekStore) {
		this.weekStore = weekStore;
	}

	@Column(name = "week_user", nullable = false)
	public int getWeekUser() {
		return this.weekUser;
	}

	public void setWeekUser(int weekUser) {
		this.weekUser = weekUser;
	}

}
