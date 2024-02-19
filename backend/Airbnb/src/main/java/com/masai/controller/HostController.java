package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.masai.service.HostService;

@RestController
public class HostController {
	
	@Autowired
	private HostService hostService;

}
