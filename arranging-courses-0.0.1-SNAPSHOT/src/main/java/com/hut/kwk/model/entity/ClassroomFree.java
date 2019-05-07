package com.hut.kwk.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Create by Wang Heng on 2019-04-29
 *
 * @author Wang Heng
 */
@Data
public class ClassroomFree implements Serializable {

    private Integer week;
    private Integer classroomId;
    private String classroomName;
    private String day;
    private Integer number;
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public Integer getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
	}
	public String getClassroomName() {
		return classroomName;
	}
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
    
    
    
}
