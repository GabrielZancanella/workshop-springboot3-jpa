package com.gabrielzancanellapereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gabrielzancanellapereira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}