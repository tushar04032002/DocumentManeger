package com.example.demo.DocumentService;

public class ExcelService implements DocumentService {

	@Override
	public void readData() {
		System.out.println("read data for db"); 
		
	}

	@Override
	public void processData() {
	 System.out.println("process data for Excel");
		
	}

	@Override
	public void printData() {
	 System.err.println("printing Excel");	
	}
 
}