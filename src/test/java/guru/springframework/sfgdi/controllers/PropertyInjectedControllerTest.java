package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void SetUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
