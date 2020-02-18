package com.spiralforge.tsms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spiralforge.tsms.dto.TimeSheetResponseDto;
import com.spiralforge.tsms.service.TimeSheetService;

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/timesheet")
public class TimeSheetController {

	@Autowired
	private TimeSheetService timeSheetService;
	
	@GetMapping
	public ResponseEntity<TimeSheetResponseDto> timesheetEmployee() {
		TimeSheetResponseDto timeSheetResponseDto=timeSheetService.timesheetEmployee();
		return new ResponseEntity<> (timeSheetResponseDto, HttpStatus.OK);
	}
}
