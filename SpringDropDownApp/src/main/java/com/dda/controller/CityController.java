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

import com.dda.entity.City;
import com.dda.exception.DropDownAppException;
import com.dda.service.CityService;

@RestController
@RequestMapping("api/city")
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@PostMapping
	public String save(@RequestBody City city)throws DropDownAppException {
		return cityService.save(city);
	}
	
	@GetMapping
	public Iterable<City> getAll(){
		return cityService.getAll();
	}
	
	@GetMapping("/{cityId}")
	public City getById(@PathVariable int cityId) throws DropDownAppException{
		return cityService.getById(cityId);
		
	}
	
	@PutMapping("/{cityId}")
	public String updateById(@PathVariable int cityId, @RequestBody City editCity)throws DropDownAppException {
		return cityService.updateById(cityId, editCity);
		
	}
	
	@DeleteMapping("/{cityId}")
	public String deleteById(@PathVariable int cityId)throws DropDownAppException {
		return cityService.deleteById(cityId);
	}

}
