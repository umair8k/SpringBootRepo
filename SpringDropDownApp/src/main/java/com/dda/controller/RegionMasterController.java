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

import com.dda.entity.RegionMaster;
import com.dda.exception.DropDownAppException;
import com.dda.service.RegionMasterService;

@RestController
@RequestMapping("api/regionMaster")
public class RegionMasterController {
	
	@Autowired
	RegionMasterService regionMasterService;
	
	@PostMapping
	public String save(@RequestBody RegionMaster regionMaster)throws DropDownAppException {
		return regionMasterService.save(regionMaster);
	}
	
	@GetMapping
	public Iterable<RegionMaster> getAll(){
		return regionMasterService.getAll();
	}
	@GetMapping("/{regionMasterId}")
	public RegionMaster getById(@PathVariable int regionMasterId)throws DropDownAppException {
		return regionMasterService.getById(regionMasterId);
		
	}
	
	@PutMapping("/{regionMasterId}")
	public String updateById(@PathVariable int regionMasterId, @RequestBody RegionMaster editRegionMaster)throws DropDownAppException {
		return regionMasterService.updateById(regionMasterId, editRegionMaster);
		
	}
	
	@DeleteMapping("/{regionMasterId}")
	public String deleteById(@PathVariable int regionMasterId) throws DropDownAppException{
		return regionMasterService.deleteById(regionMasterId);
	}

}
