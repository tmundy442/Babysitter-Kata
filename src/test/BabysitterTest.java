package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.Babysitter;

public class BabysitterTest {

	Babysitter underTest = new Babysitter();

	@Test
	public void GetStartTime() {

		int startTime = underTest.startTime();
		assertEquals(1700, startTime);

	}

	@Test
	public void GetStopTime() {

		int stopTime = underTest.stopTime();
		assertEquals(400, stopTime);

	}

	@Test
	public void GetBedTime() {

		int bedTime = underTest.bedTime();
		assertEquals(2100, bedTime);

	}

	@Test
	public void CalculateStarttimetoBedtime() {

		int pay1 = underTest.CalculateStarttimetoBedtime();
		assertEquals(48, pay1);

	}

	@Test
	public void CalculateBedtimetoMidnight() {

		int pay2 = underTest.CalculateBedtimetoMidnight();
		assertEquals(24, pay2);

	}

	@Test
	public void CalculateMidnighttoStoptime() {

		int pay3 = underTest.CalculateMidnighttoStoptime();
		assertEquals(64, pay3);

	}

}
