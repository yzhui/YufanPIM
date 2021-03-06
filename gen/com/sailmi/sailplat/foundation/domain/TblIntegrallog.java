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
 * TblIntegrallog generated by hbm2java
 */
@Entity
@Table(name = "tbl_integrallog", catalog = "sailplat")
public class TblIntegrallog implements java.io.Serializable {

	private Long id;
	private TblUser tblUserByIntegralUserId;
	private TblUser tblUserByOperateUserId;
	private Date addTime;
	private boolean deleteStatus;
	private String content;
	private int integral;
	private String type;

	public TblIntegrallog() {
	}

	public TblIntegrallog(boolean deleteStatus, int integral) {
		this.deleteStatus = deleteStatus;
		this.integral = integral;
	}

	public TblIntegrallog(TblUser tblUserByIntegralUserId, TblUser tblUserByOperateUserId, Date addTime,
			boolean deleteStatus, String content, int integral, String type) {
		this.tblUserByIntegralUserId = tblUserByIntegralUserId;
		this.tblUserByOperateUserId = tblUserByOperateUserId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.content = content;
		this.integral = integral;
		this.type = type;
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
	@JoinColumn(name = "integral_user_id")
	public TblUser getTblUserByIntegralUserId() {
		return this.tblUserByIntegralUserId;
	}

	public void setTblUserByIntegralUserId(TblUser tblUserByIntegralUserId) {
		this.tblUserByIntegralUserId = tblUserByIntegralUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "operate_user_id")
	public TblUser getTblUserByOperateUserId() {
		return this.tblUserByOperateUserId;
	}

	public void setTblUserByOperateUserId(TblUser tblUserByOperateUserId) {
		this.tblUserByOperateUserId = tblUserByOperateUserId;
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

	@Column(name = "integral", nullable = false)
	public int getIntegral() {
		return this.integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
