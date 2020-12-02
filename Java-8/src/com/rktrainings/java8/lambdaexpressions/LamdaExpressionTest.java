/**
 * 
 */
package com.rktrainings.java8.lambdaexpressions;

/**
 * @author RavikumarPothannagar
 *
 */
public class LamdaExpressionTest {
	int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a,b);
	}
	
	public static void main(String args[]) {
		LamdaExpressionTest test = new LamdaExpressionTest();
		
		
		
		//Optional parenthesis around parameter
		//Optional curly braces
		//Optional return keyword
		
		//with type declaration
		MathOperation addition = (int a, int b) -> a+b;
		
		//Optional without type declaration
		MathOperation subtraction = (a, b) -> a-b;
		
		//with return statement  along with curly braces
		MathOperation mulitplication = (int a, int b) -> {return a*b;};
		
		
		//without return statement and without curly braces
		MathOperation division = (int a, int b) -> a/b;
		
		
		
		System.out.println("10+5= "+test.operate(10, 5, addition));
		System.out.println("10-5= "+test.operate(10, 5, subtraction));
		System.out.println("10*5= "+test.operate(10, 5, mulitplication));
		System.out.println("10/5= "+test.operate(10, 5, division));
		
		//without parenthesis
		GreetingService greetService1 = (message) ->
		System.out.println("Hello "+message);
		
		
		//without parenthesis
		GreetingService greetService2 = message ->
		System.out.println("Hello "+message);
		
		
		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
		
	}
}
