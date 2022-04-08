package com.bridgelab.lambda;

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

public class Lambda {

	public static void main(String[] args) {

		Lambda lambda = new Lambda();

		// with type declaration
		MathOperation addition = (a, b) -> a + b;

		System.out.println("Addition Of Two No Is ");

		System.out.println("10 + 5 = " + lambda.operate(10, 5, addition));
		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with type declaration
		MathOperation multiplication = (a, b) -> a * b;

		// with type declaration
		MathOperation division = (a, b) -> a / b;

		System.out.println("Addition Of Two No Is ");

		System.out.println("10 + 5 = " + lambda.operate(10, 5, addition));

		System.out.println("Subtraction Of Two No Is ");

		System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction));

		System.out.println("Multiplication  Of Two No Is ");

		System.out.println("10 x 5 = " + lambda.operate(10, 5, multiplication));

		System.out.println("Division  Of Two No Is ");

		System.out.println("10 / 5 = " + lambda.operate(10, 5, division));

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
