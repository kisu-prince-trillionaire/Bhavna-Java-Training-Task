package com.logger.tester;

import com.logger.service.LoggerData;
import com.logger.service.LoggerService;

public class TestLogger {

	public static void main(String[] args) {
		LoggerService service = new LoggerService();
		LoggerData dataObj = service
				.readFile("C:\\Users\\Vishal.Kumar\\Desktop\\Bhavna Training\\JavaTraining-Task2\\src\\a.txt");
		dataObj.display();
	}

}
