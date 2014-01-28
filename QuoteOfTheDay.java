/*
 * Copyright (c) 2013, OXUS20 and its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/**
 * Quote Of The Day Program
 * This class picks a quote from an array of quotes based on day of the year.
 * @author <a href="mailto:absherzad@gmail.com">Abdul Rahman Sherzad</a>
 * @version 1.0
 */

import java.util.Calendar;

public class QuoteOfTheDay {
	
	public static String chooseQuoteOfTheDay() {
		
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
		return quotes[quote_index];
	}
}
