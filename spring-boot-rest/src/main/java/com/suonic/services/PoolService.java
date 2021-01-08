package com.suonic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suonic.dao.IPoolDAO;
import com.suonic.model.Pool;

@Service
public class PoolService implements IPoolService {

	@Autowired
	private IPoolDAO dao;

	@Override
	public void createPool(Pool pool) {
		dao.createPool(pool);
	}

	@Override
	public Pool getPool(int poolId) {
		return dao.getPool(poolId);
	}

}
