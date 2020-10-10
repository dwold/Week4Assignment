package com.dagnachew.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		List <String> employeeNames = new ArrayList <String> ();	// Coding Step 1
		Set <Integer> ids = new HashSet <Integer> ();	// Coding Step 2
		Map <Integer, String> employeeMap = new HashMap <Integer, String> ();	// Coding Step 3
		// Coding Step 4
		employeeNames.add("Thomas");	
		employeeNames.add("David");
		employeeNames.add("John");
		employeeNames.add("Eden");
		employeeNames.add("Rita");
		ids.add(20201);			
		ids.add(20202);
		ids.add(20203);
		ids.add(20204);
		ids.add(20205);
		// Coding Step 5
		int i = 0;		
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		// Coding Step 6
		for (int key : employeeMap.keySet()) {			
			System.out.println(key + " : " + employeeMap.get(key));
		}
		StringBuilder idsBuilder = new StringBuilder();		// Coding Step 7
		// Coding Step 8
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		System.out.println(idsBuilder.toString());		// Coding Step 9
		StringBuilder namesBuilder = new StringBuilder();	// Coding Step 10
		// Coding Step 11
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());	// Coding Step 12	
	}
}