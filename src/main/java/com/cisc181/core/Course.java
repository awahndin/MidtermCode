package com.cisc181.core;
import com.cisc181.eNums.eMajor;
import java.util.UUID;

public class Course {
	private int CN;
	private UUID CourseID;
	private int grade;
	private eMajor Major;
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void CourseID(){
		this.CourseID = CourseID;
	}
	public int getCourseName() {
		return CN;
	}
	public void CourseName() {
		this.CN = CN;;
	}
	public int getGradePoints(){
		return grade;
	}
	public void GradePoints() {
		this.grade = grade;
	}
}
