package main;

public class Babysitter {

	public static void main(String[] args) {

	}

	public int startTime() {

		return 1700;
	}

	public int stopTime() {

		return 400;
	}

	public int bedTime() {

		return 2100;
	}

	public int CalculateStarttimetoBedtime() {
		int pay1 = (((2100 - 1700) * 12) / 100);
		return pay1;
	}

	public int CalculateBedtimetoMidnight() {
		int pay2 = (((2400 - 2100) * 8) / 100);
		return pay2;
	}

	public int CalculateMidnighttoStoptime() {
		int pay3 = (((0 + 400) * 16) / 100);
		return pay3;
	}

	public int GetTotal() {
		int pay1 = CalculateStarttimetoBedtime();
		int pay2 = CalculateBedtimetoMidnight();
		int pay3 = CalculateMidnighttoStoptime();

		int total = pay1 + pay2 + pay3;
		return total;
	}

}
