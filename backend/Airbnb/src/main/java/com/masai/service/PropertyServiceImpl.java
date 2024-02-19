package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.PropertyRepository;
import com.masai.entity.Property;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired

	private PropertyRepository propertyRepository;

	public List<Property> findAllProperty() {

	   return propertyRepository.findAll();
	}

	public Property findPropertyById(Long id) {
		return propertyRepository.findById(id).get();
	}

	public Property saveProperty(Property property) {
		return propertyRepository.save(property);
	}

}
