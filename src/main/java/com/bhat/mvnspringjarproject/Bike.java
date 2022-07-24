package com.bhat.mvnspringjarproject;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public void drive() {
		System.out.println("riding a bike");
	}

}
