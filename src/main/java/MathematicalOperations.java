import java.math.BigInteger;

/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperations {

	public static int addTwoNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public static BigInteger factorial(int positiveInteger) {
		if (positiveInteger < 0) {
			throw new IllegalArgumentException("Input integer has to be positive!");
		}
		if (positiveInteger <= 1) {
			return BigInteger.ONE;
		}

		return factorial(positiveInteger - 1).multiply(BigInteger.valueOf(positiveInteger));
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static int multiplyTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;

	}

	public static int euclidean(int first, int second) {
		if (first <= 0 || second <= 0) {
			throw new IllegalStateException();
		}
		int third;
		while (second != 0) {
			third = first % second;
			first = second;
			second = third;
		}
		return first;
	}

	public static int substractTwoNumbers(int numb1, int numb2) {
		return numb1 - numb2;
	}

	public static int exponentiate(int number, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++)
			result *= number;
		return result;
	}
}