package com.cisc181.core;
import java.sql.Date;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private int RoomID;
	private UUID SemesterID;
	private UUID SectionID;
	
	
//I Don't know if we need getter/setters	
	public UUID getSectionID() {
		return SectionID;
	}
	public void SectionID(){
		this.SectionID = SectionID;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void SemesterID(){
		this.SemesterID = SemesterID;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void CourseID(){
		this.CourseID = CourseID;
	}
	
	public int getRoomID() {
		return RoomID;
	}
	public void RoomID(){
		this.RoomID = RoomID;
	}
}
