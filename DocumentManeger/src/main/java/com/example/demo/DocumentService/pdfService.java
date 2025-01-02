package com.example.demo.DocumentService;

public class pdfService implements DocumentService {

	@Override
	public void readData() {
		 System.out.println("read data for db");
		
	}

	@Override
	public void processData() {
		 System.out.println("process data from pdf");		
	}

	@Override
	public void printData() {
		 System.out.println("printing pdf");
		
	}

	 
}
