package com.logger.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.logger.bean.Logger;

public class LoggerService {
	public LoggerData readFile(String fileLoc) {
		LoggerData mapObj = new LoggerData();
		try {
			File fl = new File(fileLoc);
			Scanner dataReader = new Scanner(fl);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				String[] array = fileData.split(" ");
				Logger userData = new Logger(array[0], array[1], array[2], array[3]);
				mapObj.createMap(userData.getName(), userData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexpected error occured!");
			exception.printStackTrace();
		}
		return mapObj;
	}
}
