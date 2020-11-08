package com.mobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileconnect.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
