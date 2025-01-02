package com.example.demo.DocumentController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DocumentService.DocumentService;
import com.example.demo.DocumentService.ExcelService;
import com.example.demo.DocumentService.pdfService;
import com.example.demo.DocumentService.wordService;

@RestController
public class DocumentController {

	DocumentService service =new ExcelService();
	
	
	@GetMapping("/print")
	public String printData()
	{
		service.readData();
	 service.processData();
	 service.printData();
	 
		return "done";		
	}
	
	
	
	
	
}
