package com.opd.management.service;

import org.springframework.stereotype.Service;

import com.opd.management.model.LoginRequest;
import com.opd.management.model.RegistrationRequestModel;



@Service
public interface AuthService {
	
	public String registration(RegistrationRequestModel reg);
	
	public String login(LoginRequest loginRequest);

}
