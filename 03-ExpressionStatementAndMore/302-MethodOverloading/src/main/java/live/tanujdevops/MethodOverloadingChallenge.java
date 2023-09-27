package live.tanujdevops;

public class MethodOverloadingChallenge {
	public static void main(String[] args) {
		System.out.println("6ft = " + convertToCentimeters(6, 0) + "cm");
		System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
		System.out.println("68in = " + convertToCentimeters(68) + "cm");
	}

	public static double convertToCentimeters(int heightInInches) {
		double inchToCentimeterConversionFactor = 2.54;
		return heightInInches * inchToCentimeterConversionFactor;
	}

	public static double convertToCentimeters(int heightInFeet, int heightInInches) {
		double inchesToCentimeter = convertToCentimeters(heightInInches);
		int footToInches = heightInFeet * 12;
		double footToCentimeter = convertToCentimeters(footToInches);
		return inchesToCentimeter + footToCentimeter;
	}
}
