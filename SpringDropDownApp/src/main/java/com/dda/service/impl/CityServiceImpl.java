package com.dda.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dda.constant.MessageConstant;
import com.dda.entity.City;
import com.dda.exception.DropDownAppException;
import com.dda.repo.CityRepository;
import com.dda.service.CityService;
import com.dda.service.SequenceGeneratorService;

@Service	
public class CityServiceImpl implements CityService {
	@Autowired
	CityRepository cityRepository;

	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	@Override
	public String save(City city) throws DropDownAppException{
		try {
		city.setCityId(sequenceGeneratorService.generateSequence(city.SEQUENCE_NAME));
		city.setCreatedDate(new Date());
		cityRepository.save(city);
		return MessageConstant.SUCCESS;
		}catch (Exception e) {
			throw new DropDownAppException(500, e.getLocalizedMessage());
		}
	}

	@Override
	public City getById(Integer cityId)throws DropDownAppException {
		Optional<City> optional=cityRepository.findById(cityId);
		if(optional.isPresent())
			return optional.get();
		throw new DropDownAppException(DropDownAppException.NOT_FOUND, MessageConstant.USER_NOT_FOUND);
	}

	@Override
	public String updateById(int cityId, City editCity) throws DropDownAppException{
		City city=getById(cityId);
		city.setCityName(editCity.getCityName());
		cityRepository.save(city);
		return MessageConstant.SUCCESS;
	}

	@Override
	public String deleteById(int cityId)throws DropDownAppException {
		getById(cityId);
		cityRepository.deleteById(cityId);
		return MessageConstant.SUCCESS;
	}

	@Override
	public Iterable<City> getAll() {

		return cityRepository.findAll();
	}

}
