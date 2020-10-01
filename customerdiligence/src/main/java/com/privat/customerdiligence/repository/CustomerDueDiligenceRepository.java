package com.privat.customerdiligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.privat.customerdiligence.model.CustomerDueDiligence;

@Repository
public interface CustomerDueDiligenceRepository extends JpaRepository<CustomerDueDiligence, Long>{

}
