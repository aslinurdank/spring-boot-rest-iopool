package com.suonic.dao;

import com.suonic.model.Pool;

public interface IPoolDAO {

	Pool getPool(int poolId);

	void createPool(Pool pool);

}
