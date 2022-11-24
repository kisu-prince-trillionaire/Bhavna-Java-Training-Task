package com.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.bean.Area;

public class ZipService2 implements ZipService1 {
	static List<Area> addressList = new ArrayList<Area>();

	public void addAddress() {
		// Creating Address
		Area address1 = new Area("India", "Bihar", "Langarpur", "Barh", 803213);
		Area address2 = new Area("India", "Bihar", "Langarpur", "Barh", 803214);
		Area address3 = new Area("India", "Bihar", "Langarpur", "Barh", 803215);
		Area address4 = new Area("India", "Bihar", "Langarpur", "Barh", 803216);

		addressList.add(address1);
		addressList.add(address2);
		addressList.add(address3);
		addressList.add(address4);
	}

	public String searchAddress(int zip) {
		String zipCode = Integer.toString(zip);
		int zipLength = zipCode.length();
		if(zipLength <= 6) {
			for (int i = 0; i < addressList.size(); i++) {
				if (((Area) addressList.get(i)).getZipCode() == zip) {
					return addressList.get(i).toString();
				}
			}
			return "No such address exist";
		}
		return "Invalid Zip Code";
	}

	public void setArea(String countryName, String stateName, String areaName, String cityName, int zipCode) {
		Area areaData = new Area(countryName, stateName, areaName, cityName, zipCode);
		addressList.add(areaData);
		for (Area data : addressList) {
			System.out.println(data);
		}
		System.out.println("Sucessfully Added");

	}

	public void printAll() {
		Iterator<Area> itr = addressList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
