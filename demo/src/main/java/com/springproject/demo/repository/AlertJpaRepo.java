package com.springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springproject.demo.model.Alert;



@Component
public interface AlertJpaRepo extends JpaRepository<Alert, String>{

}
