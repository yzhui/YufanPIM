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
 * TblArticle generated by hbm2java
 */
@Entity
@Table(name = "tbl_article", catalog = "sailplat")
public class TblArticle implements java.io.Serializable {

	private Long id;
	private TblArticleclass tblArticleclass;
	private Date addTime;
	private Long parentArticleId;
	private boolean deleteStatus;
	private byte articleType;
	private String content;
	private boolean display;
	private String mark;
	private int sequence;
	private String title;
	private String url;
	private Set<TblArticleHistory> tblArticleHistories = new HashSet<TblArticleHistory>(0);
	private Set<TblGoodsArticle> tblGoodsArticles = new HashSet<TblGoodsArticle>(0);
	private Set<TblGroupArticle> tblGroupArticles = new HashSet<TblGroupArticle>(0);
	private Set<TblDistrictsArticle> tblDistrictsArticles = new HashSet<TblDistrictsArticle>(0);
	private Set<TblArticleComments> tblArticleCommentses = new HashSet<TblArticleComments>(0);
	private Set<TblGoodsclassArticle> tblGoodsclassArticles = new HashSet<TblGoodsclassArticle>(0);
	private Set<TblUserArticle> tblUserArticles = new HashSet<TblUserArticle>(0);

	public TblArticle() {
	}

	public TblArticle(boolean deleteStatus, byte articleType, boolean display, int sequence) {
		this.deleteStatus = deleteStatus;
		this.articleType = articleType;
		this.display = display;
		this.sequence = sequence;
	}

	public TblArticle(TblArticleclass tblArticleclass, Date addTime, Long parentArticleId, boolean deleteStatus,
			byte articleType, String content, boolean display, String mark, int sequence, String title, String url,
			Set<TblArticleHistory> tblArticleHistories, Set<TblGoodsArticle> tblGoodsArticles,
			Set<TblGroupArticle> tblGroupArticles, Set<TblDistrictsArticle> tblDistrictsArticles,
			Set<TblArticleComments> tblArticleCommentses, Set<TblGoodsclassArticle> tblGoodsclassArticles,
			Set<TblUserArticle> tblUserArticles) {
		this.tblArticleclass = tblArticleclass;
		this.addTime = addTime;
		this.parentArticleId = parentArticleId;
		this.deleteStatus = deleteStatus;
		this.articleType = articleType;
		this.content = content;
		this.display = display;
		this.mark = mark;
		this.sequence = sequence;
		this.title = title;
		this.url = url;
		this.tblArticleHistories = tblArticleHistories;
		this.tblGoodsArticles = tblGoodsArticles;
		this.tblGroupArticles = tblGroupArticles;
		this.tblDistrictsArticles = tblDistrictsArticles;
		this.tblArticleCommentses = tblArticleCommentses;
		this.tblGoodsclassArticles = tblGoodsclassArticles;
		this.tblUserArticles = tblUserArticles;
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
	@JoinColumn(name = "articleClass_id")
	public TblArticleclass getTblArticleclass() {
		return this.tblArticleclass;
	}

	public void setTblArticleclass(TblArticleclass tblArticleclass) {
		this.tblArticleclass = tblArticleclass;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "addTime", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "parentArticleId")
	public Long getParentArticleId() {
		return this.parentArticleId;
	}

	public void setParentArticleId(Long parentArticleId) {
		this.parentArticleId = parentArticleId;
	}

	@Column(name = "deleteStatus", nullable = false)
	public boolean isDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	@Column(name = "articleType", nullable = false)
	public byte getArticleType() {
		return this.articleType;
	}

	public void setArticleType(byte articleType) {
		this.articleType = articleType;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "display", nullable = false)
	public boolean isDisplay() {
		return this.display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	@Column(name = "mark")
	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Column(name = "sequence", nullable = false)
	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblArticleHistory> getTblArticleHistories() {
		return this.tblArticleHistories;
	}

	public void setTblArticleHistories(Set<TblArticleHistory> tblArticleHistories) {
		this.tblArticleHistories = tblArticleHistories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblGoodsArticle> getTblGoodsArticles() {
		return this.tblGoodsArticles;
	}

	public void setTblGoodsArticles(Set<TblGoodsArticle> tblGoodsArticles) {
		this.tblGoodsArticles = tblGoodsArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblGroupArticle> getTblGroupArticles() {
		return this.tblGroupArticles;
	}

	public void setTblGroupArticles(Set<TblGroupArticle> tblGroupArticles) {
		this.tblGroupArticles = tblGroupArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblDistrictsArticle> getTblDistrictsArticles() {
		return this.tblDistrictsArticles;
	}

	public void setTblDistrictsArticles(Set<TblDistrictsArticle> tblDistrictsArticles) {
		this.tblDistrictsArticles = tblDistrictsArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblArticleComments> getTblArticleCommentses() {
		return this.tblArticleCommentses;
	}

	public void setTblArticleCommentses(Set<TblArticleComments> tblArticleCommentses) {
		this.tblArticleCommentses = tblArticleCommentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblGoodsclassArticle> getTblGoodsclassArticles() {
		return this.tblGoodsclassArticles;
	}

	public void setTblGoodsclassArticles(Set<TblGoodsclassArticle> tblGoodsclassArticles) {
		this.tblGoodsclassArticles = tblGoodsclassArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblArticle")
	public Set<TblUserArticle> getTblUserArticles() {
		return this.tblUserArticles;
	}

	public void setTblUserArticles(Set<TblUserArticle> tblUserArticles) {
		this.tblUserArticles = tblUserArticles;
	}

}
