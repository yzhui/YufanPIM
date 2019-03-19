package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblGoodstypeBrandId generated by hbm2java
 */
@Embeddable
public class TblGoodstypeBrandId implements java.io.Serializable {

	private long typeId;
	private long brandId;

	public TblGoodstypeBrandId() {
	}

	public TblGoodstypeBrandId(long typeId, long brandId) {
		this.typeId = typeId;
		this.brandId = brandId;
	}

	@Column(name = "type_id", nullable = false)
	public long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	@Column(name = "brand_id", nullable = false)
	public long getBrandId() {
		return this.brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblGoodstypeBrandId))
			return false;
		TblGoodstypeBrandId castOther = (TblGoodstypeBrandId) other;

		return (this.getTypeId() == castOther.getTypeId()) && (this.getBrandId() == castOther.getBrandId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getTypeId();
		result = 37 * result + (int) this.getBrandId();
		return result;
	}

}
