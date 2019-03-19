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
 * TblChatting generated by hbm2java
 */
@Entity
@Table(name = "tbl_chatting", catalog = "sailplat")
public class TblChatting implements java.io.Serializable {

	private Long id;
	private TblUser tblUserByUser2Id;
	private TblUser tblUserByUser1Id;
	private Date addTime;
	private boolean deleteStatus;
	private Integer type;
	private Set<TblChattinglog> tblChattinglogs = new HashSet<TblChattinglog>(0);

	public TblChatting() {
	}

	public TblChatting(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblChatting(TblUser tblUserByUser2Id, TblUser tblUserByUser1Id, Date addTime, boolean deleteStatus,
			Integer type, Set<TblChattinglog> tblChattinglogs) {
		this.tblUserByUser2Id = tblUserByUser2Id;
		this.tblUserByUser1Id = tblUserByUser1Id;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.type = type;
		this.tblChattinglogs = tblChattinglogs;
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
	@JoinColumn(name = "user2_id")
	public TblUser getTblUserByUser2Id() {
		return this.tblUserByUser2Id;
	}

	public void setTblUserByUser2Id(TblUser tblUserByUser2Id) {
		this.tblUserByUser2Id = tblUserByUser2Id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user1_id")
	public TblUser getTblUserByUser1Id() {
		return this.tblUserByUser1Id;
	}

	public void setTblUserByUser1Id(TblUser tblUserByUser1Id) {
		this.tblUserByUser1Id = tblUserByUser1Id;
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

	@Column(name = "type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblChatting")
	public Set<TblChattinglog> getTblChattinglogs() {
		return this.tblChattinglogs;
	}

	public void setTblChattinglogs(Set<TblChattinglog> tblChattinglogs) {
		this.tblChattinglogs = tblChattinglogs;
	}

}
