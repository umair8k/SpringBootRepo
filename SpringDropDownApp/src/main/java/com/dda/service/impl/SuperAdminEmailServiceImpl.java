package com.dda.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dda.constant.MessageConstant;
import com.dda.entity.SuperAdminEmail;
import com.dda.exception.DropDownAppException;
import com.dda.repo.SuperAdminEmailRepository;
import com.dda.service.SequenceGeneratorService;
import com.dda.service.SuperAdminEmailService;

@Service
public class SuperAdminEmailServiceImpl implements SuperAdminEmailService {
	
	@Autowired
	SuperAdminEmailRepository superAdminRepository;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	@Override
	public String save(SuperAdminEmail superAdminEmail)throws DropDownAppException {
		try {
		superAdminEmail.setAdminId(sequenceGeneratorService.generateSequence(superAdminEmail.SEQUENCE_NAME));
		superAdminEmail.setCreatedDate(new Date());
		superAdminRepository.save(superAdminEmail);
		return MessageConstant.SUCCESS;
		}catch (Exception e) {
			throw new DropDownAppException(500, e.getLocalizedMessage());
		}
	}

	@Override
	public SuperAdminEmail getById(Integer adminId) throws DropDownAppException{
		Optional<SuperAdminEmail> optional=superAdminRepository.findById(adminId);
		if(optional.isPresent())
			return optional.get();
		throw new DropDownAppException(DropDownAppException.NOT_FOUND, MessageConstant.USER_NOT_FOUND);
	}


	@Override
	public String updateById(int adminId, SuperAdminEmail editSuperAdminEmail)throws DropDownAppException {
		SuperAdminEmail superAdminEmail= getById(adminId);
		superAdminEmail.setName(editSuperAdminEmail.getName());
		superAdminEmail.setName(editSuperAdminEmail.getName());
		superAdminRepository.save(superAdminEmail);
		return MessageConstant.SUCCESS;
	}

	@Override
	public String deleteById(int adminId)throws DropDownAppException {
		getById(adminId);
		superAdminRepository.deleteById(adminId);
		return MessageConstant.SUCCESS;
	}

	@Override
	public Iterable<SuperAdminEmail> getAll() {
	
		return superAdminRepository.findAll();
	}

}
