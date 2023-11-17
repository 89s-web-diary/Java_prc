package com.multi.mvc05;

public class TaskDTO {
	
	private String task;
	private int hours;
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "TaskDTO [task=" + task + ", hours=" + hours + "]";
	}
	
}
