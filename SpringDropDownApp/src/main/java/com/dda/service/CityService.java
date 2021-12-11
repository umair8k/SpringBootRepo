package com.dda.service;

import com.dda.entity.City;
import com.dda.exception.DropDownAppException;

public interface CityService {
	
	String save(City city)throws DropDownAppException;
	
	City getById(Integer cityId)throws DropDownAppException;
	
	String updateById(int cityId, City editCity)throws DropDownAppException;
	
	String deleteById(int cityId)throws DropDownAppException;
	
	Iterable<City> getAll();

}
