package com.spiralforge.tsms.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spiralforge.tsms.dto.TimeSheetDetails;
import com.spiralforge.tsms.dto.TimeSheetResponseDto;

@Service
public class TimeSheetServiceImpl implements TimeSheetService{

	@Override
	public TimeSheetResponseDto timesheetEmployee() {
		LocalDate currentDate = LocalDate.now();
		TimeSheetResponseDto timeSheetResponseDto = new TimeSheetResponseDto();
		List<TimeSheetDetails> timeSheet = new ArrayList<>();
		for (Integer i = 0; i < 7; i++) {
			TimeSheetDetails timeSheetDetails = new TimeSheetDetails();
			timeSheetDetails.setDate(currentDate.plusDays(i));
			timeSheetDetails.setDay(currentDate.plusDays(i).getDayOfWeek().toString());
			timeSheet.add(timeSheetDetails);
		}
		timeSheetResponseDto.setTimesheetDetails(timeSheet);
		return timeSheetResponseDto;
	}
}
