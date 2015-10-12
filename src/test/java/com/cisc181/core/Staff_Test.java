package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
public class Staff_Test {

	ArrayList<Staff> Staff =new ArrayList<Staff>();
	Date DATE;
	Staff staff0, staff1;
	
	@Before
	public void setUp() throws Exception {
		Staff.add(new Staff("bob","A","smith",DATE,"123 sun ave","123-456-7890","email@udel.edu","1-2",1,1.5,DATE,eTitle.Doctor));
		Staff.add(new Staff("bill","b","jones",DATE,"123 sun dr","098-765-4321","email2@udel.edu","1-2",1,1.5,DATE,eTitle.Mr));

	}		
	@Test
	public void testAverage() {
		double i = 0;
		double average =0;
		for (Staff Staff: Staff){
			i += Staff.getSalary();
		}
		average = i /Staff.size();
		System.out.println(Staff.size());
		System.out.println(average);
		assertTrue(average == 1.5);
	}

}
