package me.brandon.lab1.task3;

public class Task3 {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		int currentSecond = (int) (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		int currentMinute = (int) (totalMinutes % 60);
		long totalHours = totalMinutes / 60;
		int currentHour = (int) (totalHours % 24);
		
		System.out.printf("Current time is %d:%d:%d GMT", currentHour, currentMinute, currentSecond);
	}

}
