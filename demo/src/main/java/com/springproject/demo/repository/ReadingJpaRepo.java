
package com.springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springproject.demo.model.Reading;



@Component
public interface ReadingJpaRepo extends JpaRepository<Reading, String>{

}
