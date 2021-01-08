package com.suonic.controller;

import com.suonic.model.Pool;
import com.suonic.services.IPoolService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateservice")
public class PoolController {

	@Autowired
	private IPoolService service;

	@GetMapping("pools/{id}")
	public ResponseEntity<Pool> getPool(@PathVariable("id") Integer id) {
		Pool pool = service.getPool(id);
		return new ResponseEntity<Pool>(pool, HttpStatus.OK);
	}

	@PostMapping("pools")
	public void createPool(@RequestBody @Valid Pool pool) {
		service.createPool(pool);
	}

}
