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
 * TblComplaint generated by hbm2java
 */
@Entity
@Table(name = "tbl_complaint", catalog = "sailplat")
public class TblComplaint implements java.io.Serializable {

	private Long id;
	private TblAccessory tblAccessoryByFromAcc2Id;
	private TblAccessory tblAccessoryByToAcc2Id;
	private TblAccessory tblAccessoryByToAcc1Id;
	private TblAccessory tblAccessoryByToAcc3Id;
	private TblAccessory tblAccessoryByFromAcc1Id;
	private TblAccessory tblAccessoryByFromAcc3Id;
	private TblComplaintSubject tblComplaintSubject;
	private TblOrderform tblOrderform;
	private TblUser tblUserByToUserId;
	private TblUser tblUserByFromUserId;
	private TblUser tblUserByHandleUserId;
	private Date addTime;
	private boolean deleteStatus;
	private Date appealTime;
	private String fromUserContent;
	private String handleContent;
	private Date handleTime;
	private int status;
	private String talkContent;
	private String toUserContent;
	private String type;
	private Set<TblComplaintGoods> tblComplaintGoodses = new HashSet<TblComplaintGoods>(0);

	public TblComplaint() {
	}

	public TblComplaint(boolean deleteStatus, int status) {
		this.deleteStatus = deleteStatus;
		this.status = status;
	}

	public TblComplaint(TblAccessory tblAccessoryByFromAcc2Id, TblAccessory tblAccessoryByToAcc2Id,
			TblAccessory tblAccessoryByToAcc1Id, TblAccessory tblAccessoryByToAcc3Id,
			TblAccessory tblAccessoryByFromAcc1Id, TblAccessory tblAccessoryByFromAcc3Id,
			TblComplaintSubject tblComplaintSubject, TblOrderform tblOrderform, TblUser tblUserByToUserId,
			TblUser tblUserByFromUserId, TblUser tblUserByHandleUserId, Date addTime, boolean deleteStatus,
			Date appealTime, String fromUserContent, String handleContent, Date handleTime, int status,
			String talkContent, String toUserContent, String type, Set<TblComplaintGoods> tblComplaintGoodses) {
		this.tblAccessoryByFromAcc2Id = tblAccessoryByFromAcc2Id;
		this.tblAccessoryByToAcc2Id = tblAccessoryByToAcc2Id;
		this.tblAccessoryByToAcc1Id = tblAccessoryByToAcc1Id;
		this.tblAccessoryByToAcc3Id = tblAccessoryByToAcc3Id;
		this.tblAccessoryByFromAcc1Id = tblAccessoryByFromAcc1Id;
		this.tblAccessoryByFromAcc3Id = tblAccessoryByFromAcc3Id;
		this.tblComplaintSubject = tblComplaintSubject;
		this.tblOrderform = tblOrderform;
		this.tblUserByToUserId = tblUserByToUserId;
		this.tblUserByFromUserId = tblUserByFromUserId;
		this.tblUserByHandleUserId = tblUserByHandleUserId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.appealTime = appealTime;
		this.fromUserContent = fromUserContent;
		this.handleContent = handleContent;
		this.handleTime = handleTime;
		this.status = status;
		this.talkContent = talkContent;
		this.toUserContent = toUserContent;
		this.type = type;
		this.tblComplaintGoodses = tblComplaintGoodses;
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
	@JoinColumn(name = "from_acc2_id")
	public TblAccessory getTblAccessoryByFromAcc2Id() {
		return this.tblAccessoryByFromAcc2Id;
	}

	public void setTblAccessoryByFromAcc2Id(TblAccessory tblAccessoryByFromAcc2Id) {
		this.tblAccessoryByFromAcc2Id = tblAccessoryByFromAcc2Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_acc2_id")
	public TblAccessory getTblAccessoryByToAcc2Id() {
		return this.tblAccessoryByToAcc2Id;
	}

	public void setTblAccessoryByToAcc2Id(TblAccessory tblAccessoryByToAcc2Id) {
		this.tblAccessoryByToAcc2Id = tblAccessoryByToAcc2Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_acc1_id")
	public TblAccessory getTblAccessoryByToAcc1Id() {
		return this.tblAccessoryByToAcc1Id;
	}

	public void setTblAccessoryByToAcc1Id(TblAccessory tblAccessoryByToAcc1Id) {
		this.tblAccessoryByToAcc1Id = tblAccessoryByToAcc1Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_acc3_id")
	public TblAccessory getTblAccessoryByToAcc3Id() {
		return this.tblAccessoryByToAcc3Id;
	}

	public void setTblAccessoryByToAcc3Id(TblAccessory tblAccessoryByToAcc3Id) {
		this.tblAccessoryByToAcc3Id = tblAccessoryByToAcc3Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "from_acc1_id")
	public TblAccessory getTblAccessoryByFromAcc1Id() {
		return this.tblAccessoryByFromAcc1Id;
	}

	public void setTblAccessoryByFromAcc1Id(TblAccessory tblAccessoryByFromAcc1Id) {
		this.tblAccessoryByFromAcc1Id = tblAccessoryByFromAcc1Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "from_acc3_id")
	public TblAccessory getTblAccessoryByFromAcc3Id() {
		return this.tblAccessoryByFromAcc3Id;
	}

	public void setTblAccessoryByFromAcc3Id(TblAccessory tblAccessoryByFromAcc3Id) {
		this.tblAccessoryByFromAcc3Id = tblAccessoryByFromAcc3Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cs_id")
	public TblComplaintSubject getTblComplaintSubject() {
		return this.tblComplaintSubject;
	}

	public void setTblComplaintSubject(TblComplaintSubject tblComplaintSubject) {
		this.tblComplaintSubject = tblComplaintSubject;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "of_id")
	public TblOrderform getTblOrderform() {
		return this.tblOrderform;
	}

	public void setTblOrderform(TblOrderform tblOrderform) {
		this.tblOrderform = tblOrderform;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_user_id")
	public TblUser getTblUserByToUserId() {
		return this.tblUserByToUserId;
	}

	public void setTblUserByToUserId(TblUser tblUserByToUserId) {
		this.tblUserByToUserId = tblUserByToUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "from_user_id")
	public TblUser getTblUserByFromUserId() {
		return this.tblUserByFromUserId;
	}

	public void setTblUserByFromUserId(TblUser tblUserByFromUserId) {
		this.tblUserByFromUserId = tblUserByFromUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "handle_user_id")
	public TblUser getTblUserByHandleUserId() {
		return this.tblUserByHandleUserId;
	}

	public void setTblUserByHandleUserId(TblUser tblUserByHandleUserId) {
		this.tblUserByHandleUserId = tblUserByHandleUserId;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "appeal_time", length = 19)
	public Date getAppealTime() {
		return this.appealTime;
	}

	public void setAppealTime(Date appealTime) {
		this.appealTime = appealTime;
	}

	@Column(name = "from_user_content")
	public String getFromUserContent() {
		return this.fromUserContent;
	}

	public void setFromUserContent(String fromUserContent) {
		this.fromUserContent = fromUserContent;
	}

	@Column(name = "handle_content")
	public String getHandleContent() {
		return this.handleContent;
	}

	public void setHandleContent(String handleContent) {
		this.handleContent = handleContent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "handle_time", length = 19)
	public Date getHandleTime() {
		return this.handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "talk_content")
	public String getTalkContent() {
		return this.talkContent;
	}

	public void setTalkContent(String talkContent) {
		this.talkContent = talkContent;
	}

	@Column(name = "to_user_content")
	public String getToUserContent() {
		return this.toUserContent;
	}

	public void setToUserContent(String toUserContent) {
		this.toUserContent = toUserContent;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblComplaint")
	public Set<TblComplaintGoods> getTblComplaintGoodses() {
		return this.tblComplaintGoodses;
	}

	public void setTblComplaintGoodses(Set<TblComplaintGoods> tblComplaintGoodses) {
		this.tblComplaintGoodses = tblComplaintGoodses;
	}

}