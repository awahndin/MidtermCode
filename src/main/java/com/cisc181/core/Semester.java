
package com.cisc181.core;

import java.sql.Date;

public class Semester {
	private Date SD;
	private Date ED;
	private static int UUID;
	
	public static int getSemesterID() {
		return UUID;
	}
	public void SemesterID(){
		this.UUID = UUID;
	}
	
	public Date getStartDate() {
		return SD;
	}
	public void StartDate(){
		this.SD = SD;
	}
	
	public Date getEndDate() {
		return ED;
	}
	public void EndDate(){
		this.ED = ED;
	}
}