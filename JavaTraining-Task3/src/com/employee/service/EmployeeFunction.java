package com.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeFunction extends EmployeeServices {
	// Find the employee count whose name starts with s
	public void countEmployee() {
		System.out.println("Employee count whose name starts with S");
		int count = (int) employeeList.stream().filter(n -> n.getName().startsWith("S")).count();
		System.out.println(count);
	}

	// Print all the employees with location Hyderabad
	public void filterLocation() {
		System.out.println("All employees with location Hyderabad");
		employeeList.stream().filter(h -> h.getLocation().equals("Hyderabad")).map(h -> h.getName())
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	// Print location and employee in the map
	public void locateEmployee() {
		System.out.println("Locationand the Employee in the Map");
		Map<String, ArrayList<String>> employeeData = new HashMap<String, ArrayList<String>>();
		employeeList.parallelStream().forEach(s -> {
			if (employeeData.containsKey(s.getLocation())) {
				employeeData.get(s.getLocation()).add(s.getName());
			} else {
				employeeData.put(s.getLocation(), new ArrayList<String>());
				employeeData.get(s.getLocation()).add(s.getName());
			}
		});
		System.out.println(employeeData);
	}

	// Check salary greater than 100000 using stream
	public void checkSalary() {
		System.out.println("check salary greater than 10000");
		List<String> empList = employeeList.stream().filter(e -> e.getSalary() > 30000).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(empList);
	}

	// Sort employees name
	public void sortName() {
		System.out.println("Sorted Employee name");
		employeeList.stream().sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).forEach(System.out::println);
	}

	// Sort employees location
	public void sortLocation() {
		System.out.println("Sorted Employee Location");
		employeeList.stream().sorted((n1, n2) -> n1.getLocation().compareTo(n2.getLocation()))
				.forEach(System.out::println);
	}
}
