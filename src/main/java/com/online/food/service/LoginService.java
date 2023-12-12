package com.online.food.service;

import com.online.food.exception.LoginException;
import com.online.food.model.*;


public interface LoginService {

	public String loginAccount(LoginDTO loginDTO) throws LoginException;

	public String logoutAccount(String role, String key) throws LoginException;

}
