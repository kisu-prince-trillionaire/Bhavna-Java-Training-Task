package com.demo.services;

public interface ZipService1 {
	public void addAddress();

	public String searchAddress(int zip);

	public void setArea(String countryName, String stateName, String areaName, String cityName, int zipCode);

	public void printAll();
}
