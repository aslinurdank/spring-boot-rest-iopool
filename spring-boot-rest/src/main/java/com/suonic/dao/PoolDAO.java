package com.suonic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suonic.model.Pool;

@Transactional
@Repository
public class PoolDAO implements IPoolDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Pool getPool(int poolId) {

		return entityManager.find(Pool.class, poolId);
	}

	@Override
	public void createPool(Pool pool) {
		entityManager.persist(pool);
	}

	private Pool getLastInsertedPool() {
		String hql = "select t from pool t order by ID DESC";
		Query query = entityManager.createQuery(hql);
		query.setMaxResults(1);
		Pool pool = (Pool) query.getSingleResult();
		return pool;
	}

}
