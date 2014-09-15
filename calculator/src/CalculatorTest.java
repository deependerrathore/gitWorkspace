import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


/*
 * @author deepak
 * handleNumber:
 * 		should handle number:push number and return ture
 * 		should not handle non-number:do nothing and return false
 * handleOperator
 * 		should handle operator:pop , op , push and return true
 * 		shouln not handle operator:do nothing and return false
 * 
 * calculate:
 * 		integration test:result is calculated correctly
 * 		if you pass garbage , it should throw an exception
 *
 */
public class CalculatorTest {

	
	@Test
	public void handleNumberMustHandleNumbers(){
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = Calculator.handleNumber(stack, "5");
		assertTrue(result);
		assertEquals(1,stack.size());
		assertEquals(5,(int)stack.peek());
	}
	
	@Test
	public void handleNonNumberMustHandle(){
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = Calculator.handleNumber(stack, "garbage");
		assertFalse(result);
		assertTrue(stack.isEmpty());
		
	}
	
	@Test
	public void handleOperatorMustHandleAddition(){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(5);
		boolean result = Calculator.handleOperator(stack, "+");
		assertTrue(result);
		assertEquals(1,stack.size());
		assertEquals(8,(int)stack.peek());
	}
	
	@Test
	public void handleOperatorMuustNotHandleGarbage(){
 		Stack<Integer> stack = new Stack<Integer>();
 		boolean result = Calculator.handleOperator(stack, "garbage");
 		assertFalse(result);
 		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void onePlusOneEqualTwo(){
		int result = Calculator.calculate("1 1 +");
		assertEquals(2 , result);
	}
	@Test(expected= IllegalArgumentException.class)
	public void calculatorMustNotAcceptGarbage(){
		Calculator.calculate("garbage");
	}

}
