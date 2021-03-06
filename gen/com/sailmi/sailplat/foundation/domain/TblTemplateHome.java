package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblTemplate.
 * @see com.sailmi.sailplat.foundation.domain.TblTemplate
 * @author Hibernate Tools
 */
@Stateless
public class TblTemplateHome {

	private static final Log log = LogFactory.getLog(TblTemplateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblTemplate transientInstance) {
		log.debug("persisting TblTemplate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblTemplate persistentInstance) {
		log.debug("removing TblTemplate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblTemplate merge(TblTemplate detachedInstance) {
		log.debug("merging TblTemplate instance");
		try {
			TblTemplate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblTemplate findById(Long id) {
		log.debug("getting TblTemplate instance with id: " + id);
		try {
			TblTemplate instance = entityManager.find(TblTemplate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
