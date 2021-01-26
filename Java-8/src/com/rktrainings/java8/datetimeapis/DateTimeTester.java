package com.rktrainings.java8.datetimeapis;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.time.temporal.ChronoUnit;

import java.time.Duration;
import java.time.Period;

import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

import java.util.Date;
import java.time.Instant;

/**
 * @author RavikumarPothannagar - 
 *
 * 		   
 * 		   With Java 8, a new Date-Time API is introduced to cover the following
 *         drawbacks of old date-time API.
 * 
 *         Not thread safe − java.util.Date is not thread safe, thus developers
 *         have to deal with concurrency issue while using date. The new
 *         date-time API is immutable and does not have setter methods.
 * 
 *         Poor design − Default Date starts from 1900, month starts from 1, and
 *         day starts from 0, so no uniformity. The old API had less direct
 *         methods for date operations. The new API provides numerous utility
 *         methods for such operations.
 * 
 *         Difficult time zone handling − Developers had to write a lot of code
 *         to deal with timezone issues. The new API has been developed keeping
 *         domain-specific design in mind.
 * 
 *         Java 8 introduces a new date-time API under the package java.time.
 *         Following are some of the important classes introduced in java.time
 *         package.
 * 
 *         Local − Simplified date-time API with no complexity of timezone
 *         handling.
 * 
 *         Zoned − Specialized date-time API to deal with various timezones.
 * 
 */
public class DateTimeTester {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		DateTimeTester tester = new DateTimeTester();
		tester.testLocalDateTime();
		System.out.println("------------------------------------");
		tester.testZonedDateTime();
		System.out.println("------------------------------------");
		tester.testChromoUnits();
		System.out.println("------------------------------------");
		tester.testPeriod();
		System.out.println("------------------------------------");
		tester.testDuration();
		System.out.println("------------------------------------");
		tester.testAdjusters();
		System.out.println("------------------------------------");
		tester.testBackwardCompatability();
	}

	/**
	 * Local Date-Time API
	 * 
	 * LocalDate/LocalTime and LocalDateTime classes simplify the development where
	 * timezones are not required. Let's see them in action.
	 */
	public void testLocalDateTime() {
		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("date1: " + date1);

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();

		System.out.println("Month: " + month + " day: " + day + " seconds: " + seconds);

		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("date2: " + date2);

		// 12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("date3: " + date3);

		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);

		// parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);
	}

	/**
	 * Zoned Date-Time API
	 * 
	 * Zoned date-time API is to be used when time zone is to be considered. Let us
	 * see them in action.
	 */
	public void testZonedDateTime() {
		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("date1: " + date1);

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);
	}

	
	/**
	 * Chrono Units Enum
	 * 
	 * java.time.temporal.ChronoUnit enum is added in Java 8 to replace the integer
	 * values used in old API to represent day, month, etc. Let us see them in
	 * action.
	 */
	public void testChromoUnits() {
		// Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		// In case for previous use negative values.
		// add 1 week to the current date.
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		// add 1 month to the current date
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + nextMonth);

		// add 1 year to the current date
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Next year: " + nextYear);

		// add 10 years to the current date
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Date after ten year: " + nextDecade);
	}
	
	
	/**
	 * Period and Duration
	 * 
	 * With Java 8, two specialized classes are introduced to deal with the time
	 * differences.
	 * 
	 * Period - It deals with date based amount of time.
	 * 
	 * Duration - It deals with time based amount of time.
	 * 
	 */
	public void testPeriod() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		// add 1 month to the current date
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date2);

		Period period = Period.between(date2, date1);
		System.out.println("Period: " + period);
	}

	/**
	 * Period and Duration
	 * 
	 * With Java 8, two specialized classes are introduced to deal with the time
	 * differences.
	 * 
	 * Period - It deals with date based amount of time.
	 * 
	 * Duration - It deals with time based amount of time.
	 * 
	 */
	public void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);

		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);

		System.out.println("Duration: " + duration);
	}
	
	/**
	 * Temporal Adjusters
	 * 
	 * TemporalAdjuster is used to perform the date mathematics. For example, get
	 * the "Second Saturday of the Month" or "Next Tuesday". Let us see them in
	 * action.
	 */
	public void testAdjusters() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		// get the next Tuesday
		LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday);

		// get the second Saturday of next month
		LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on : " + secondSaturday);
	}
	
	/**
	 * Backward Compatibility
	 * 
	 * A toInstant() method is added to the original Date and Calendar objects,
	 * which can be used to convert them to the new Date-Time API. Use an
	 * ofInstant(Insant,ZoneId) method to get a LocalDateTime or ZonedDateTime
	 * object. Let us see them in action.
	 */
	public void testBackwardCompatability() {
		// Get the current date
		Date currentDate = new Date();
		System.out.println("Current date: " + currentDate);

		// Get the instant of current date in terms of milliseconds
		Instant now = currentDate.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();

		LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
		System.out.println("Local date: " + localDateTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
		System.out.println("Zoned date: " + zonedDateTime);
	}

}
