package com.masai.service;

import java.util.List;

import com.masai.entity.Host;

public interface HostService {
	
	/**
	 * 
	 * @return It will return All hosts;
	 */

	 public List<Host> findAllHosts() ;
	 
	 
	 /**
	  * 
	  * @param id
	  * @return It will return host related to that id
	  */
	 
	 public Host findHostById(Long id);
	 
	 /**
	  * 
	  * @param host
	  * @return It will return Host
	  */
	 
	 public Host saveHost(Host host) ;
}
