package com.mobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileconnect.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
