package com.nathan.restful_api.repository;

import com.nathan.restful_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
