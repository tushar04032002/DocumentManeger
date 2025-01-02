package com.example.demo.DocumentService;

public class wordService implements DocumentService {

	@Override
	public void readData() {
		 System.out.println("read data for db");
		
	}

	@Override
	public void processData() {
		 System.out.println("process data from word");
		
	}

	@Override
	public void printData() {
	 System.out.println("print word");
		
	}

	
	 
	
}
