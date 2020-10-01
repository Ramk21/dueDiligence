package com.privat.customerprofileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.privat.customerprofileservice.model.CustomerProfile;

@Repository
public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Long>{

}
