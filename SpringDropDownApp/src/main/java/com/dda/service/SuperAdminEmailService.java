package com.dda.service;

import com.dda.entity.SuperAdminEmail;
import com.dda.exception.DropDownAppException;

public interface SuperAdminEmailService {
	
	String save(SuperAdminEmail superAdminEmail)throws DropDownAppException;
	
	SuperAdminEmail getById(Integer adminId)throws DropDownAppException;
	
	String updateById(int adminId, SuperAdminEmail editSuperAdminEmail)throws DropDownAppException;
	
	String deleteById(int adminId)throws DropDownAppException;
	
	Iterable<SuperAdminEmail> getAll();

}
