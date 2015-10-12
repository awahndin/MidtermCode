package com.cisc181.core;

import com.cisc181.eNums.eTitle;
import java.util.Date;

public class Staff extends Employee {

	 private eTitle Title;

	   public Staff(eTitle Title){
	        this.Title = Title;
	    }

	    public void setTitle(eTitle Title){
	        this.Title = Title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}