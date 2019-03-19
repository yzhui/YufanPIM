package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblGoodsReturnitem generated by hbm2java
 */
@Entity
@Table(name = "tbl_goods_returnitem", catalog = "sailplat")
public class TblGoodsReturnitem implements java.io.Serializable {

	private Long id;
	private TblGoods tblGoods;
	private TblGoodsReturn tblGoodsReturn;
	private Date addTime;
	private boolean deleteStatus;
	private int count;
	private String specInfo;
	private Set<TblReturnGsp> tblReturnGsps = new HashSet<TblReturnGsp>(0);

	public TblGoodsReturnitem() {
	}

	public TblGoodsReturnitem(boolean deleteStatus, int count) {
		this.deleteStatus = deleteStatus;
		this.count = count;
	}

	public TblGoodsReturnitem(TblGoods tblGoods, TblGoodsReturn tblGoodsReturn, Date addTime, boolean deleteStatus,
			int count, String specInfo, Set<TblReturnGsp> tblReturnGsps) {
		this.tblGoods = tblGoods;
		this.tblGoodsReturn = tblGoodsReturn;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.count = count;
		this.specInfo = specInfo;
		this.tblReturnGsps = tblReturnGsps;
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
	@JoinColumn(name = "goods_id")
	public TblGoods getTblGoods() {
		return this.tblGoods;
	}

	public void setTblGoods(TblGoods tblGoods) {
		this.tblGoods = tblGoods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gr_id")
	public TblGoodsReturn getTblGoodsReturn() {
		return this.tblGoodsReturn;
	}

	public void setTblGoodsReturn(TblGoodsReturn tblGoodsReturn) {
		this.tblGoodsReturn = tblGoodsReturn;
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

	@Column(name = "count", nullable = false)
	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Column(name = "spec_info")
	public String getSpecInfo() {
		return this.specInfo;
	}

	public void setSpecInfo(String specInfo) {
		this.specInfo = specInfo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsReturnitem")
	public Set<TblReturnGsp> getTblReturnGsps() {
		return this.tblReturnGsps;
	}

	public void setTblReturnGsps(Set<TblReturnGsp> tblReturnGsps) {
		this.tblReturnGsps = tblReturnGsps;
	}

}
