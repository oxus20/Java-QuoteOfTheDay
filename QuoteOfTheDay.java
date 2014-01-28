/*
 * Copyright (c) 2013, OXUS20 and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
import java.util.Calendar;
/**
 * Display Quote Of The Day 
 * This class picks a quote from an array of quotes based on day of the year.
*/
public class QuoteOfTheDay {
	public static void main(String[] args) {
		// Array quotes[] to store the quotes
		String quotes[] = new String[366];
		// Loop initialize dummy quotes inside array quotes[]
		for (int i = 0; i < quotes.length; i++) {
			quotes[i] = "Dummy quote of the day " + (i + 1);
		}
		// Construct Calendar object "c"
		Calendar c = Calendar.getInstance();
		// quote_index represent day of the year
		int quote_index = c.get(Calendar.DAY_OF_YEAR);
		// quotes[quote_index] returns day of the year quote
		String quote_of_the_day = quotes[quote_index];
		// Display the code the screen
		System.out.println(quote_of_the_day);
	}
}
