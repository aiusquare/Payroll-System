package com.java.payroll;

import java.util.Scanner;

interface Time {
	long[] getTime();

	long[] getCompute();

}

public class EmployeeTime implements Time {

	long timeIn;
	long timeOut;

	@Override
	public long[] getTime() {
		String[] day = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		long[] getTime = new long[1];
		Scanner sc = new Scanner(System.in);
		for (String days : day) {
			System.out.println(days);
			for(int i = 0; i < getTime.length; i++) {
				System.out.print("Enter Time in: ");
				timeIn = sc.nextLong();
				System.out.print("Enter Time out: ");
				timeOut = sc.nextLong();
			}
		}
		

		return null;
	}

	@Override
	public long[] getCompute() {
		// TODO Auto-generated method stub
		return null;
	}

}
