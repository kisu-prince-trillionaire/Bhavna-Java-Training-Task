package com.logger.bean;

public class Logger {
	private String id;
	private String name;
	private String date;
	private String time;

	public Logger() {
		super();
	}

	public Logger(String id, String name, String date, String time) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Id= " + id + ", Name= " + name + ", Date= " + date + ", Time= " + time;
	}

}
