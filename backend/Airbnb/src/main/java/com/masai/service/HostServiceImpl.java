package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.HostRepository;
import com.masai.entity.Host;

@Service
public class HostServiceImpl implements HostService {

	@Autowired

	private HostRepository hostRepository;

	public List<Host> findAllHosts() {
		return hostRepository.findAll();
	}

	public Host findHostById(Long id) {
		return hostRepository.findById(id).get();
	}

	public Host saveHost(Host host) {
		return hostRepository.save(host);
	}

}
