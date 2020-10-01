package com.privat.customerdiligence.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.privat.customerdiligence.model.CustomerDueDiligence;
import com.privat.customerdiligence.repository.CustomerDueDiligenceRepository;

@RunWith(MockitoJUnitRunner.class)
public class CustomerDueDiligenceControllerTest {

	@Mock
	CustomerDueDiligenceRepository customerDueDiligenceRepository;
	
	@InjectMocks
	CustomerDueDiligenceController customerDueDiligenceController;

	@Test 
	public void testGetDiligenceDetails() { 
		Long Id=3L;
		CustomerDueDiligence diligence = new CustomerDueDiligence();
		diligence.setCustomerId(3L);
		diligence.setDiligenceStatus("default");
		when(customerDueDiligenceRepository.findById(Id)).thenReturn(Optional.of(diligence));
	   diligence= customerDueDiligenceController.getDiligenceDetails(Id);
	   assertEquals("default",diligence.getDiligenceStatus());
	   }
	
	@Test 
	public void testGetDiligenceStatusWithDefault() { 
		Long Id=3L;
		CustomerDueDiligence diligence = new CustomerDueDiligence();
		diligence.setCustomerId(3L);
		diligence.setDiligenceStatus("default");
	   when(customerDueDiligenceRepository.findById(Id)).thenReturn(Optional.of(diligence));	   
	   diligence= customerDueDiligenceController.getDiligenceStatus(Id);
	   assertEquals("default",diligence.getDiligenceStatus());
	}
	@Test 
	public void testGetDiligenceStatusWithPending() { 
		Long Id=3L;
		CustomerDueDiligence diligence = new CustomerDueDiligence();
		Optional<CustomerDueDiligence> optionalCustomers= Optional.empty();
	   when(customerDueDiligenceRepository.findById(Id)).thenReturn(optionalCustomers);	   
	   diligence= customerDueDiligenceController.getDiligenceStatus(Id);
	   assertEquals("pending",diligence.getDiligenceStatus());
	}
	 public CustomerDueDiligenceControllerTest() { }
}
