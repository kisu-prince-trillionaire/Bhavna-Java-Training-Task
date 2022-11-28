package com.logger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.logger.bean.Logger;

public class LoggerData {
	
	Map<String, ArrayList<Logger>> loggerData = new HashMap<String, ArrayList<Logger>>();

	public void createMap(String id, Logger userData) {
		if (loggerData.containsKey(id)) {
			loggerData.get(id).add(userData);
		} else {
			loggerData.put(id, new ArrayList<Logger>());
			loggerData.get(id).add(userData);
		}
	}

	public void display() {
		loggerData.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
