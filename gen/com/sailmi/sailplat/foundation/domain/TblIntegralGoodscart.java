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
 * TblIntegralGoodscart generated by hbm2java
 */
@Entity
@Table(name = "tbl_integral_goodscart", catalog = "sailplat")
public class TblIntegralGoodscart implements java.io.Serializable {

	private Long id;
	private TblIntegralGoods tblIntegralGoods;
	private TblIntegralGoodsorder tblIntegralGoodsorder;
	private Date addTime;
	private boolean deleteStatus;
	private int count;
	private int integral;
	private BigDecimal transFee;

	public TblIntegralGoodscart() {
	}

	public TblIntegralGoodscart(boolean deleteStatus, int count, int integral) {
		this.deleteStatus = deleteStatus;
		this.count = count;
		this.integral = integral;
	}

	public TblIntegralGoodscart(TblIntegralGoods tblIntegralGoods, TblIntegralGoodsorder tblIntegralGoodsorder,
			Date addTime, boolean deleteStatus, int count, int integral, BigDecimal transFee) {
		this.tblIntegralGoods = tblIntegralGoods;
		this.tblIntegralGoodsorder = tblIntegralGoodsorder;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.count = count;
		this.integral = integral;
		this.transFee = transFee;
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
	public TblIntegralGoods getTblIntegralGoods() {
		return this.tblIntegralGoods;
	}

	public void setTblIntegralGoods(TblIntegralGoods tblIntegralGoods) {
		this.tblIntegralGoods = tblIntegralGoods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public TblIntegralGoodsorder getTblIntegralGoodsorder() {
		return this.tblIntegralGoodsorder;
	}

	public void setTblIntegralGoodsorder(TblIntegralGoodsorder tblIntegralGoodsorder) {
		this.tblIntegralGoodsorder = tblIntegralGoodsorder;
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

	@Column(name = "integral", nullable = false)
	public int getIntegral() {
		return this.integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	@Column(name = "trans_fee", precision = 12)
	public BigDecimal getTransFee() {
		return this.transFee;
	}

	public void setTransFee(BigDecimal transFee) {
		this.transFee = transFee;
	}

}