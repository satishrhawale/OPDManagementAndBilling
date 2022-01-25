package com.opd.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.opd.management.entity.Registration;


@Repository
public interface RegistrationRepo extends CrudRepository<Registration, Long>{
	
	Registration findByUsername(String username);

}
