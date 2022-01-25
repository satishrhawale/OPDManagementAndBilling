package com.opd.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.opd.management.entity.Login;

@Repository
public interface LoginRepo extends CrudRepository<Login, Long> {
	
	Login findByUsername(String username);

}
