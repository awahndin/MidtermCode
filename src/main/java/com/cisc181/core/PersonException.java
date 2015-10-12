package com.cisc181.core;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.cisc181.core.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonException extends Exception {
	
	private Person c;
	
	public PersonException (Person c){
		this.c = c;
	}
}
