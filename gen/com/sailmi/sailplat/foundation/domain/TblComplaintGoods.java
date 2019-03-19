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
 * TblComplaintGoods generated by hbm2java
 */
@Entity
@Table(name = "tbl_complaint_goods", catalog = "sailplat")
public class TblComplaintGoods implements java.io.Serializable {

	private Long id;
	private TblComplaint tblComplaint;
	private TblGoods tblGoods;
	private Date addTime;
	private boolean deleteStatus;
	private String content;

	public TblComplaintGoods() {
	}

	public TblComplaintGoods(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblComplaintGoods(TblComplaint tblComplaint, TblGoods tblGoods, Date addTime, boolean deleteStatus,
			String content) {
		this.tblComplaint = tblComplaint;
		this.tblGoods = tblGoods;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.content = content;
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
	@JoinColumn(name = "complaint_id")
	public TblComplaint getTblComplaint() {
		return this.tblComplaint;
	}

	public void setTblComplaint(TblComplaint tblComplaint) {
		this.tblComplaint = tblComplaint;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goods_id")
	public TblGoods getTblGoods() {
		return this.tblGoods;
	}

	public void setTblGoods(TblGoods tblGoods) {
		this.tblGoods = tblGoods;
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

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
