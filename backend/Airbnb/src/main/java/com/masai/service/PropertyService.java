package com.masai.service;

import java.util.List;

import com.masai.entity.Property;

public interface PropertyService {

	/**
	 * It will not take any parameter;
	 * @return It will return All list of Property
	 */
	
	public List<Property> findAllProperty();
	
	/**
	 * 
	 * @param id
	 * @return It will return property related to that id;
	 */
	
	public Property findPropertyById(Long id);
	
	
	/**
	 * 
	 * @param property
	 * @return It will return that saved property;
	 */
	public Property saveProperty(Property property);
}
