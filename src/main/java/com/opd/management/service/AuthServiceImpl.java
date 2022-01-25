package com.opd.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opd.management.entity.Login;
import com.opd.management.entity.Registration;
import com.opd.management.model.LoginRequest;
import com.opd.management.model.RegistrationRequestModel;
import com.opd.management.repository.LoginRepo;
import com.opd.management.repository.RegistrationRepo;

@Service
public class AuthServiceImpl implements AuthService{
	
	@Autowired
	RegistrationRepo registrationRepo;
	
	@Autowired
	LoginRepo loginRepo;

	@Override
	public String registration(RegistrationRequestModel reg) {
		if(registrationRepo.findByUsername(reg.getUsername())==null) {
			Registration registartion=new Registration(reg.getFirst_name(), reg.getLast_name(), reg.getUsername(), reg.getAddress(), reg.getContact());
			registrationRepo.save(registartion);
			
			Login login=new Login(reg.getUsername(),reg.getPassword());
			loginRepo.save(login);
			
			return "Inserted";
		}else {
			return null;
		}
		
	}

	public String login(LoginRequest loginRequest) {
		Login login=loginRepo.findByUsername(loginRequest.getUsername());
		if(login!=null && login.getPassword().equals(loginRequest.getPassword())) {
			return "login Successfully";
		}else {
			return null;
		}
		
	}

}
