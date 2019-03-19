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
 * TblHomeAddention generated by hbm2java
 */
@Entity
@Table(name = "tbl_home_addention", catalog = "sailplat")
public class TblHomeAddention implements java.io.Serializable {

	private Long id;
	private TblHomepage tblHomepageByAttentionHomepageId;
	private TblHomepage tblHomepageByAttentionedId;
	private Date addTime;
	private boolean deleteStatus;

	public TblHomeAddention() {
	}

	public TblHomeAddention(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblHomeAddention(TblHomepage tblHomepageByAttentionHomepageId, TblHomepage tblHomepageByAttentionedId,
			Date addTime, boolean deleteStatus) {
		this.tblHomepageByAttentionHomepageId = tblHomepageByAttentionHomepageId;
		this.tblHomepageByAttentionedId = tblHomepageByAttentionedId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
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
	@JoinColumn(name = "attention_homepage_id")
	public TblHomepage getTblHomepageByAttentionHomepageId() {
		return this.tblHomepageByAttentionHomepageId;
	}

	public void setTblHomepageByAttentionHomepageId(TblHomepage tblHomepageByAttentionHomepageId) {
		this.tblHomepageByAttentionHomepageId = tblHomepageByAttentionHomepageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "attentioned_id")
	public TblHomepage getTblHomepageByAttentionedId() {
		return this.tblHomepageByAttentionedId;
	}

	public void setTblHomepageByAttentionedId(TblHomepage tblHomepageByAttentionedId) {
		this.tblHomepageByAttentionedId = tblHomepageByAttentionedId;
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

}
