package com.spiralforge.tsms.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TimeSheetDetails {
	private LocalDate date;
	private String day;
}
