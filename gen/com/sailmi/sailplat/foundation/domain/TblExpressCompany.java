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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblExpressCompany generated by hbm2java
 */
@Entity
@Table(name = "tbl_express_company", catalog = "sailplat")
public class TblExpressCompany implements java.io.Serializable {

	private Long id;
	private Date addTime;
	private boolean deleteStatus;
	private String companyMark;
	private String companyName;
	private Integer companyStatus;
	private Integer companySequence;
	private String companyType;
	private Set<TblOrderform> tblOrderformsForReturnEcId = new HashSet<TblOrderform>(0);
	private Set<TblOrderform> tblOrderformsForEcId = new HashSet<TblOrderform>(0);

	public TblExpressCompany() {
	}

	public TblExpressCompany(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblExpressCompany(Date addTime, boolean deleteStatus, String companyMark, String companyName,
			Integer companyStatus, Integer companySequence, String companyType,
			Set<TblOrderform> tblOrderformsForReturnEcId, Set<TblOrderform> tblOrderformsForEcId) {
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.companyMark = companyMark;
		this.companyName = companyName;
		this.companyStatus = companyStatus;
		this.companySequence = companySequence;
		this.companyType = companyType;
		this.tblOrderformsForReturnEcId = tblOrderformsForReturnEcId;
		this.tblOrderformsForEcId = tblOrderformsForEcId;
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

	@Column(name = "company_mark")
	public String getCompanyMark() {
		return this.companyMark;
	}

	public void setCompanyMark(String companyMark) {
		this.companyMark = companyMark;
	}

	@Column(name = "company_name")
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "company_status")
	public Integer getCompanyStatus() {
		return this.companyStatus;
	}

	public void setCompanyStatus(Integer companyStatus) {
		this.companyStatus = companyStatus;
	}

	@Column(name = "company_sequence")
	public Integer getCompanySequence() {
		return this.companySequence;
	}

	public void setCompanySequence(Integer companySequence) {
		this.companySequence = companySequence;
	}

	@Column(name = "company_type")
	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblExpressCompanyByReturnEcId")
	public Set<TblOrderform> getTblOrderformsForReturnEcId() {
		return this.tblOrderformsForReturnEcId;
	}

	public void setTblOrderformsForReturnEcId(Set<TblOrderform> tblOrderformsForReturnEcId) {
		this.tblOrderformsForReturnEcId = tblOrderformsForReturnEcId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblExpressCompanyByEcId")
	public Set<TblOrderform> getTblOrderformsForEcId() {
		return this.tblOrderformsForEcId;
	}

	public void setTblOrderformsForEcId(Set<TblOrderform> tblOrderformsForEcId) {
		this.tblOrderformsForEcId = tblOrderformsForEcId;
	}

}
