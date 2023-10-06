package live.tanujdevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	SimpleCalculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new SimpleCalculator();
	}

	@Test
	@DisplayName("Test addition")
	void testAddition() {
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);

		Assertions.assertEquals(9.0, calculator.getAdditionResult(), "Addition of 5.0 and 4 should be 9.0");
	}

	@Test
	@DisplayName("Test subtraction")
	void testSubtraction() {
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);

		Assertions.assertEquals(1.0, calculator.getSubtractionResult(), "Subtraction of 4 from 5.0 should be 1.0");
	}

	@Test
	@DisplayName("Test multiplication")
	void testMultiplication() {
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		Assertions.assertEquals(0.0, calculator.getMultiplicationResult(),
				"Multiplication of 5.25 and 0 should be 0.0");
	}

	@Test
	@DisplayName("Test division")
	void testDivision() {
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		Assertions.assertEquals(0.0, calculator.getDivisionResult(), "Division of 5.25 from 0 should be 0.0");
	}
}
