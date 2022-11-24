package com.demo.test.cases;

//import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demo.bean.Area;
import com.demo.bean.Country;
import com.demo.bean.State;
import com.demo.services.ZipService1;
import com.demo.services.ZipService2;

public class TestCases {
	Country country;
	State state;
	Area area;
	ZipService1 zipService1;
	ZipService2 zipService2;
	
	@Test
	@DisplayName("Checking")
	public void check() {
		System.out.println("Test Cases running successfully");
	}
	
//	@Test
//	@DisplayName("Check Null")
//	public void testNull() {
//		assertNull(country.setCountryName(null));
//	}
	
	@BeforeEach
	public void beforeEachDemo() {
		country = new Country();
		state = new State();
		area = new Area();
		zipService2 = new ZipService2();
		System.out.println("before each");
	}

	@BeforeAll
	public static void beforeAllDemo() {
		System.out.println("before all");
	}

	@AfterEach
	public void afterEachDemo() {
		System.out.println("after each");
	}

	@AfterAll
	public static void afterAllDemo() {
		System.out.println("after all");
	}
}
