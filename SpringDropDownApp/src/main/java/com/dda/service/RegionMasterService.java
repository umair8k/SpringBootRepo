package com.dda.service;

import com.dda.entity.RegionMaster;
import com.dda.exception.DropDownAppException;

public interface RegionMasterService {
	
	String save(RegionMaster regionMaster)throws DropDownAppException;
	
	String updateById(int regionMasterId, RegionMaster editRegionMaster)throws DropDownAppException;
	
	RegionMaster getById(Integer regionMasterId)throws DropDownAppException;
	
	String deleteById(int regionMasterId)throws DropDownAppException;
	
	Iterable<RegionMaster>getAll();
	
	
	
	

}
