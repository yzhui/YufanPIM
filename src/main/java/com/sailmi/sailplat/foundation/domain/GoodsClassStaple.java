package com.sailmi.sailplat.foundation.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.database.domain.IdEntity;

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "tbl_goodsclassstaple")
public class GoodsClassStaple extends IdEntity {
	/**
	 * 主要产品
	 */
	private static final long serialVersionUID = 1L;

	//名称
	private String name;
	
	//货物类型
	@ManyToOne
	private GoodsClass gc;

	//商店
	@ManyToOne
	private Store store;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GoodsClass getGc() {
		return this.gc;
	}

	public void setGc(GoodsClass gc) {
		this.gc = gc;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}
