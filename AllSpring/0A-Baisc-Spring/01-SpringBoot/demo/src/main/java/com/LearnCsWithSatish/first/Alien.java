package com.LearnCsWithSatish.first;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	Laptop lap;
	
	public void code() {
		lap.compile();
		System.out.println("I am coding..");
	}
}
