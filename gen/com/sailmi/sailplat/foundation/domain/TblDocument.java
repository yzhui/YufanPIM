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
 * TblDocument generated by hbm2java
 */
@Entity
@Table(name = "tbl_document", catalog = "sailplat")
public class TblDocument implements java.io.Serializable {

	private Long id;
	private TblStore tblStore;
	private Date addTime;
	private boolean deleteStatus;
	private String content;
	private String mark;
	private String title;

	public TblDocument() {
	}

	public TblDocument(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblDocument(TblStore tblStore, Date addTime, boolean deleteStatus, String content, String mark,
			String title) {
		this.tblStore = tblStore;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.content = content;
		this.mark = mark;
		this.title = title;
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
	@JoinColumn(name = "storeId")
	public TblStore getTblStore() {
		return this.tblStore;
	}

	public void setTblStore(TblStore tblStore) {
		this.tblStore = tblStore;
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

	@Column(name = "mark")
	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
