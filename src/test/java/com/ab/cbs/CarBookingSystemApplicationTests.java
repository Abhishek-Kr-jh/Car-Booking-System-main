package com.ab.cbs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.ab.cbs.dto.ChooseRideDTO;

@SpringBootTest
class CarBookingSystemApplicationTests {

	@Test
	void contextLoads() {
	}

	void verifyDriver(){
		ChooseRideDTO obj= new ChooseRideDTO();
		obj.setDriverName("Abhishek");
		String s= obj.getDriverName();

	}

}
