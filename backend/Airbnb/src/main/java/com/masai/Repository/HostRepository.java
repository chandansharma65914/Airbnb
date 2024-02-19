package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Host;

@Repository
public interface HostRepository extends JpaRepository<Host, Long> {
}