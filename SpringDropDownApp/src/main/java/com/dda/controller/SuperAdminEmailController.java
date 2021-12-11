package com.dda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dda.entity.SuperAdminEmail;
import com.dda.exception.DropDownAppException;
import com.dda.service.SuperAdminEmailService;


@RestController
@RequestMapping("api/superadmin")
public class SuperAdminEmailController {
	
	@Autowired
	SuperAdminEmailService superAdminEmailService;

	@PostMapping
	public String save(@RequestBody SuperAdminEmail superAdminEmail)throws DropDownAppException {
		return superAdminEmailService.save(superAdminEmail);
	}
	
	@GetMapping
	public Iterable<SuperAdminEmail> getAll(){
		return superAdminEmailService.getAll();
	}
	@GetMapping("/{adminId}")
	public SuperAdminEmail getById(@PathVariable Integer adminId)throws DropDownAppException {
		return superAdminEmailService.getById(adminId);
		
	}
	
	@PutMapping("/{adminId}")
	public String updateById(@PathVariable int adminId, @RequestBody SuperAdminEmail editSuperAdminEmail)throws DropDownAppException {
		return superAdminEmailService.updateById(adminId, editSuperAdminEmail);
		
	}
	
	@DeleteMapping("/{adminId}")
	public String deleteById(@PathVariable int adminId)throws DropDownAppException {
		return superAdminEmailService.deleteById(adminId);
	}
}
