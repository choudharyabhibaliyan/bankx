package com.bankx;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application-prod.yaml")
class BankxApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("this is for testing -----------------------");
	}

}