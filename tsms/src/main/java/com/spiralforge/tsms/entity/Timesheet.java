package com.spiralforge.tsms.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Timesheet {

	@Id
	private Long timeSheetId;
	private LocalDate date;
	private LocalTime time;
}
