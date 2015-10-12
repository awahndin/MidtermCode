package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double Grade;
	
	private Enrollment(){
		
	}
	public Enrollment(UUID sectionID,UUID studentID){
		this.enrollmentID = enrollmentID;
	}
	public UUID getSectionID() {
		return sectionID;
	}
	public void SectionID(){
		this.sectionID = sectionID;
	}
	public UUID getStudentID() {
		return studentID;
	}
	public void StudentID(){
		this.studentID = studentID;
	}
	
	public double getGrade() {
		return Grade;
	}
	public void setGrade() {
		this.Grade = Grade;
	}
	public UUID getEnrollmentID() {
		return enrollmentID;
	}
	
}
