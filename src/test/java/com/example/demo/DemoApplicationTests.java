package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;  // JUnit 5

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("it's a test class");
		assertEquals(true, true);
	}

}
