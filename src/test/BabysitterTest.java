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

}
