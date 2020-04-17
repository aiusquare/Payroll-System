package com.java.payroll;

import java.io.Serializable;

public class Source_RecordList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String employee_Code;
	String employee_Name;
	int employee_Level;
	int employee_Rate;
	// creating constructor
	public  Source_RecordList(String empCode,String empName,int empLevel, int empRate) {
		this.employee_Code = empCode;
		this.employee_Level = empLevel;
		this.employee_Name = empName;
		this.employee_Rate = empRate;
	}
	public  Source_RecordList() {
		
	}
}
