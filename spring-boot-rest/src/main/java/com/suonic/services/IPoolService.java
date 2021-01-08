package com.suonic.services;

import com.suonic.model.Pool;

public interface IPoolService {
	
	void createPool(Pool pool);
	Pool getPool(int poolId);

}
