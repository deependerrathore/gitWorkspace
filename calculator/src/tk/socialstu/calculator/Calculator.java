package tk.socialstu.calculator;

import java.util.Stack;

public class Calculator {

	/**
	 * 
	 * 10 9 8 - * 7 * 6 + 5 /4 3 2 - - split expression up into tokens for each
	 * token: if we see a number: - push it on the stack if we see the operator:
	 * - pop two number - perform the op - push the result the result is the
	 * last thing left on the stack
	 */
	public static void main(String[] args) {
		// Make sure we have an expression on the command line
		if (args.length != 1) {
			System.err.println("Usage : Calculator <expression>");
			// System.exit(-1);
			return;
		}
		String expression = args[0];

		int result = calculate(expression);
		System.out.println("Result :" + result);

	}

	public static int calculate(String expression) throws IllegalAccessError {
		// split expression up into token
		String[] tokens = expression.split(" ");

		// for each token in the expression

		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			if (!handleOperator(stack, token) && !handleNumber(stack, token)) {
				throw new IllegalArgumentException("Garbage value");
			}

		}
		// Showing the result
		return stack.pop();

	}

	public static boolean handleNumber(Stack<Integer> stack, String token)
			throws IllegalAccessError {
		try {
			int number = Integer.parseInt(token);
			// if token is a integer , then push it
			stack.push(number);
			return true;
			// System.out.println(number + " is a number");
		} catch (NumberFormatException e) {
			return false;

		}

	}

	public static boolean handleOperator(Stack<Integer> stack, String token)
			throws IllegalAccessError {
		// popping out the values from the stack to perform operation

		switch (token) {
		case "+": {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs + rhs);
			break;
		}

		case "-": {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs - rhs);
			break;
		}

		case "*": {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs * rhs);
			break;
		}

		case "/": {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs / rhs);
			break;
		}

		default:
			return false;
		}
		return true;
	}

}
