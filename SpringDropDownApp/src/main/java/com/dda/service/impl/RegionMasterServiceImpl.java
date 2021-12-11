package com.dda.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dda.constant.MessageConstant;
import com.dda.entity.RegionMaster;
import com.dda.exception.DropDownAppException;
import com.dda.repo.RegionMasterRepository;
import com.dda.service.RegionMasterService;
import com.dda.service.SequenceGeneratorService;
@Service
public class RegionMasterServiceImpl implements RegionMasterService {

	@Autowired
	RegionMasterRepository regionMasterRepository;

	@Autowired
	SequenceGeneratorService sequenceGeneratorService ;

	@Override
	public String save(RegionMaster regionMaster)throws DropDownAppException {
		try {
		regionMaster.setRegionMasterId(sequenceGeneratorService.generateSequence(RegionMaster.SEQUENCE_NAME));
		regionMaster.setCreatedDate(new Date());
		regionMasterRepository.save(regionMaster);
		return MessageConstant.SUCCESS;
		}catch (Exception e) {
			throw new DropDownAppException(500, e.getLocalizedMessage());
		}
	}

	@Override
	public String updateById(int regionMasterId, RegionMaster editRegionMaster)throws DropDownAppException {
		RegionMaster regionMaster=getById(regionMasterId);
		regionMaster.setRegionCode(editRegionMaster.getRegionCode());
		regionMaster.setRegionName(editRegionMaster.getRegionName());
		regionMasterRepository.save(regionMaster);
		return MessageConstant.SUCCESS;
	}

	@Override
	public RegionMaster getById(Integer regionMasterId)throws DropDownAppException {
		Optional<RegionMaster> optional=regionMasterRepository.findById(regionMasterId);
		if(optional.isPresent())
			return optional.get();	
		throw new DropDownAppException(DropDownAppException.NOT_FOUND, MessageConstant.USER_NOT_FOUND);
	}

	@Override
	public String deleteById(int regionMasterId) throws DropDownAppException{
		getById(regionMasterId);
		regionMasterRepository.deleteById(regionMasterId);

		return MessageConstant.SUCCESS;
	}

	@Override
	public Iterable<RegionMaster> getAll() {

		return regionMasterRepository.findAll();
	}

}
