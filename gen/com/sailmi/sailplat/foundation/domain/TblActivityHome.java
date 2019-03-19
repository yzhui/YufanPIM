package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblActivity.
 * @see com.sailmi.sailplat.foundation.domain.TblActivity
 * @author Hibernate Tools
 */
@Stateless
public class TblActivityHome {

	private static final Log log = LogFactory.getLog(TblActivityHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblActivity transientInstance) {
		log.debug("persisting TblActivity instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblActivity persistentInstance) {
		log.debug("removing TblActivity instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblActivity merge(TblActivity detachedInstance) {
		log.debug("merging TblActivity instance");
		try {
			TblActivity result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblActivity findById(Long id) {
		log.debug("getting TblActivity instance with id: " + id);
		try {
			TblActivity instance = entityManager.find(TblActivity.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
