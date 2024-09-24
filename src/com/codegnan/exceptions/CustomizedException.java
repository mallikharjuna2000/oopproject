package com.codegnan.exceptions;

class TooYoungException extends Exception {
	public TooYoungException(String message) {
		super(message);
	}
}

class TooOldException extends Exception {
	public TooOldException(String message) {
		super(message);
	}
}

public class CustomizedException {
	public void checkEligibility(int age) throws TooYoungException, TooOldException {
		if (age < 18) {
			throw new TooYoungException("Marriage Cannot be Approved... your age is below 18 years");

		} else if (age > 60) {
			throw new TooOldException("Your age is Already Crossed the Marrieage age.. Marriage cannot be approved...");
		} else {
			System.out.println("Marrieage Approved! Details will be processed Soon....");
		}
	}

	public static void main(String[] args) {
		CustomizedException checker = new CustomizedException();
		try {
			checker.checkEligibility(25);
		} catch (TooYoungException | TooOldException e) {
			e.printStackTrace();
		}
	}

}
