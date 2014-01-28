#Java Quote of the Day
Quote of the Day program displays a different quote each day of the year as the quote of the day. The program picks a random quote from an array of quotes based on day of the year; and keeps showing that selected quote for the whole day and change to a new one the next day.


**NOTE:** Remember the already picked and selected quotes not pick again until the next year.

### Quote of the Day Demo
Following **QuoteOfTheDayDemo.java** demonstrates the use of **QuoteOfTheDay.java**

 ```java
public class QuoteOfTheDayDemo {
	public static void main(String[] args) {

		// Display the selected Quote on the screen
		String quote_of_the_day = QuoteOfTheDay.chooseQuoteOfTheDay();
		System.out.println(quote_of_the_day);
	}
}
 ```


[Presentation on Slide Share website](http://www.slideshare.net/oxus20/quote-of-the-day-step-by-step)
 
[Follow us on Facebook](https://www.facebook.com/Oxus20)