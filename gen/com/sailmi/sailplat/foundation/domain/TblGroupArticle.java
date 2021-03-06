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
 * TblGroupArticle generated by hbm2java
 */
@Entity
@Table(name = "tbl_group_article", catalog = "sailplat")
public class TblGroupArticle implements java.io.Serializable {

	private Long id;
	private TblArticle tblArticle;
	private TblGroup tblGroup;
	private TblGroupArticleClass tblGroupArticleClass;
	private long desc;
	private Date createDate;
	private Date modifyDate;

	public TblGroupArticle() {
	}

	public TblGroupArticle(TblArticle tblArticle, TblGroup tblGroup, TblGroupArticleClass tblGroupArticleClass,
			long desc, Date createDate, Date modifyDate) {
		this.tblArticle = tblArticle;
		this.tblGroup = tblGroup;
		this.tblGroupArticleClass = tblGroupArticleClass;
		this.desc = desc;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
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
	@JoinColumn(name = "articleId", nullable = false)
	public TblArticle getTblArticle() {
		return this.tblArticle;
	}

	public void setTblArticle(TblArticle tblArticle) {
		this.tblArticle = tblArticle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupId", nullable = false)
	public TblGroup getTblGroup() {
		return this.tblGroup;
	}

	public void setTblGroup(TblGroup tblGroup) {
		this.tblGroup = tblGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classId", nullable = false)
	public TblGroupArticleClass getTblGroupArticleClass() {
		return this.tblGroupArticleClass;
	}

	public void setTblGroupArticleClass(TblGroupArticleClass tblGroupArticleClass) {
		this.tblGroupArticleClass = tblGroupArticleClass;
	}

	@Column(name = "desc", nullable = false)
	public long getDesc() {
		return this.desc;
	}

	public void setDesc(long desc) {
		this.desc = desc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifyDate", nullable = false, length = 19)
	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
