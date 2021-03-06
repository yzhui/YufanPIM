package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HibernateSequence generated by hbm2java
 */
@Entity
@Table(name = "hibernate_sequence", catalog = "sailplat")
public class HibernateSequence implements java.io.Serializable {

	private Long nextVal;

	public HibernateSequence() {
	}

	public HibernateSequence(Long nextVal) {
		this.nextVal = nextVal;
	}

	@Id

	@Column(name = "next_val")
	public Long getNextVal() {
		return this.nextVal;
	}

	public void setNextVal(Long nextVal) {
		this.nextVal = nextVal;
	}

}
