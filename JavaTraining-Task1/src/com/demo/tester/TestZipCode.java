package com.demo.tester;

import java.util.Scanner;

import com.demo.services.ZipService2;

public class TestZipCode {

	public static void main(String[] args) {
		getData();
		//setData();
		//printData();
	}

	public static void getData() {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Enter the zipcode you are looking for : ");
			int zip = reader.nextInt();

			ZipService2 data = new ZipService2();
			data.addAddress();
			System.out.println("Result is :\n" + data.searchAddress(zip));
		}
	}

	public static void setData() {
		ZipService2 data = new ZipService2();
		data.setArea("India", "Rajasthan", "Maansarovar", "Jaipur", 302020);
	}

	public static void printData() {
		ZipService2 data = new ZipService2();
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("All the data present are");
		data.addAddress();
		data.printAll();
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}

}
