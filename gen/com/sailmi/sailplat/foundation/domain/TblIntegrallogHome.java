package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblIntegrallog.
 * @see com.sailmi.sailplat.foundation.domain.TblIntegrallog
 * @author Hibernate Tools
 */
@Stateless
public class TblIntegrallogHome {

	private static final Log log = LogFactory.getLog(TblIntegrallogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblIntegrallog transientInstance) {
		log.debug("persisting TblIntegrallog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblIntegrallog persistentInstance) {
		log.debug("removing TblIntegrallog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblIntegrallog merge(TblIntegrallog detachedInstance) {
		log.debug("merging TblIntegrallog instance");
		try {
			TblIntegrallog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblIntegrallog findById(Long id) {
		log.debug("getting TblIntegrallog instance with id: " + id);
		try {
			TblIntegrallog instance = entityManager.find(TblIntegrallog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
