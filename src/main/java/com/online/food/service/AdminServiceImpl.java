package com.online.food.service;

import com.online.food.exception.AdminException;
import com.online.food.model.Admin;
import com.online.food.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public String createNewAdmin() throws AdminException {
		// TODO Auto-generated method stub

		String name = "Admin";
		String email = "admin@gmail.com";
		String password = "password";

		Admin existsAdmin = adminRepo.findByEmail(email);
		if (existsAdmin != null)
			throw new AdminException("Admin created => Email : " + email + ", Password : " + password);

		Admin admin = new Admin();
		admin.setName(name);
		admin.setEmail(email);
		admin.setPassword(password);
		
		adminRepo.save(admin);

		return "Admin created => Email : " + email + ", Password : " + password;
	}

}
