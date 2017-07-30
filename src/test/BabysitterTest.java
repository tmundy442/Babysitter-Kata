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

}
