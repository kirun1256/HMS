package com.mindtree.hotelreservation.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringToDateConversionTest {

	@Test
	public void testGetDayMonthYearFromStringDate() {
		StringToDateConversion obj=new StringToDateConversion();
		obj.getDayMonthYearFromStringDate("test");
		
	}

}
