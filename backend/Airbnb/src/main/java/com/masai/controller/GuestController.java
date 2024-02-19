package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.masai.service.GuestService;

@RestController
public class GuestController {
	
	@Autowired
	
	private GuestService guestService;

}
