package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblCombinLog.
 * @see com.sailmi.sailplat.foundation.domain.TblCombinLog
 * @author Hibernate Tools
 */
@Stateless
public class TblCombinLogHome {

	private static final Log log = LogFactory.getLog(TblCombinLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblCombinLog transientInstance) {
		log.debug("persisting TblCombinLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblCombinLog persistentInstance) {
		log.debug("removing TblCombinLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblCombinLog merge(TblCombinLog detachedInstance) {
		log.debug("merging TblCombinLog instance");
		try {
			TblCombinLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblCombinLog findById(Long id) {
		log.debug("getting TblCombinLog instance with id: " + id);
		try {
			TblCombinLog instance = entityManager.find(TblCombinLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
