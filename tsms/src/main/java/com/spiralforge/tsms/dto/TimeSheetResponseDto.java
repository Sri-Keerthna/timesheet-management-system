package com.spiralforge.tsms.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeSheetResponseDto {

	private List<TimeSheetDetails> timesheetDetails;
	
}
