package com.hut.kwk.model.entity;

import lombok.Data;

/**
 * Create by kwk on 2019-04-25
 *
 * @author kwk
 */
@Data
public class ClassroomHelp extends Classroom {
    private Integer day;
    private Integer number;
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
    
    
}
