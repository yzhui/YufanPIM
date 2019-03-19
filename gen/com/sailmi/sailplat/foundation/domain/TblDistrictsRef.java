package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblDistrictsRef generated by hbm2java
 */
@Entity
@Table(name = "tbl_districts_ref", catalog = "sailplat")
public class TblDistrictsRef implements java.io.Serializable {

	private Long id;
	private long mdistrictId;
	private long refDistrictId;
	private String desc;
	private Date createDate;
	private Date modifyDate;

	public TblDistrictsRef() {
	}

	public TblDistrictsRef(long mdistrictId, long refDistrictId, String desc, Date createDate, Date modifyDate) {
		this.mdistrictId = mdistrictId;
		this.refDistrictId = refDistrictId;
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

	@Column(name = "mDistrictId", nullable = false)
	public long getMdistrictId() {
		return this.mdistrictId;
	}

	public void setMdistrictId(long mdistrictId) {
		this.mdistrictId = mdistrictId;
	}

	@Column(name = "refDistrictId", nullable = false)
	public long getRefDistrictId() {
		return this.refDistrictId;
	}

	public void setRefDistrictId(long refDistrictId) {
		this.refDistrictId = refDistrictId;
	}

	@Column(name = "desc", nullable = false, length = 50)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
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
