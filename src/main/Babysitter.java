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

}
