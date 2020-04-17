package com.java.payroll;
import java.util.Scanner;

public class Main {
	String register;
	public Main(String reg) {
		this.register= reg;
	}
	public static void main(String[] args) {
		EmployeeRecordList empRecList = EmployeeRecordList.Add();
		EmployeeTime emptime = new EmployeeTime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Welcome to JRG ");
		int option;
			System.out.println("(1.) Register Emp ||(2.)Get Total Weekly GrossIncome");
			System.out.print("Choose Action to start !(type 1 , 2 ) : ");
		    option = sc.nextInt();
			switch(option) {
			
			case 1 :
					System.out.println("Register employee is running...");
				
					try {
					
					empRecList.getInformation();
					empRecList.displayInfo();
					
					}catch (Exception e) {e.printStackTrace();}
					
					
				break;
			case 2 : 
				emptime.getTime();
				break;
			}

	}

}
