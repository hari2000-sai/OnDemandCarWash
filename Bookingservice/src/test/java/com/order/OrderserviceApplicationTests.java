package com.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.order.model.Bookingdetails;
import com.order.repository.Bookingrepo;
import com.order.repository.service.Bookingservice;
 
@SpringBootTest
class OrderserviceApplicationTests {

	@Autowired
	private Bookingservice service;
	@MockBean
	private Bookingrepo repo; 
	
	
	@Test
	public void getUsersTest() {
		when(repo.findAll()).thenReturn(Stream
				.of(new  Bookingdetails(),
						new  Bookingdetails()).collect(Collectors.toList()));
		assertEquals(2, service.orderdetails().size());
	}
	
	
	 

}
