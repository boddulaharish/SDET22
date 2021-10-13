package com.crm.vlion.GenericUtility;


import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	/*
	 * author @ Harish
	 */
	/**
	 * This method is generate random number to avoid duplicates
	 * @return
	 */
	public static String getRandomData() {
		Random random=new Random();
		int ran= random.nextInt(1000);
		return ""+ran;
	}
	/**
	 * @harish
	 * this method is used to generate currentdate
	 * @return currentdate
	 */
	public static String getCurrentDate() {
		Date date = new Date();
		String currentdate=date.toString();
		return currentdate;
	}
	
	public static String getSystemDateAndTime()
	{
		Date date = new Date();
		String currentdateandtime= date.toString().replaceAll(" ","").replace(":","");
		return currentdateandtime;
		
	}

}
