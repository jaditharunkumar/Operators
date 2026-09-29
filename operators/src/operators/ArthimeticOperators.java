package operators;

import java.util.Scanner;

//1) Arithmetic Operators
// + - * / %
public class ArthimeticOperators {

	void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float a1 = sc.nextFloat();
		System.out.println("Enter second number: ");
		double a2 = sc.nextDouble();

		double result1 = addition(a1, a2);
		System.out.println("result of two numbers: " + result1);

		double result2 = subtraction(a1, a2);
		System.out.println("result of two numbers: " + result2);

		double result3 = multification(a1, a2);
		System.out.println("result of two numbers: " + result3);

		double result4 = division(a1, a2);
		System.out.println("result of two numbers: " + result4);

		double result5 = modulus(a1, a2);
		System.out.println("result of two numbers: " + result5);

		int a = 20;
		int b = 30;
		// Type mismatch: cannot convert from double to int
		int result = 5;
		//result = result + 4.5;
		//result =(int) (result + 4.5);
		
		result +=4.5;//result = result + 4.5
		
		//result -=4.5;
		
		System.out.println("Result is : " + result);
		
		
		System.out.println("Addition is : " + a + b);// 2030
		System.out.println("Addition is -----> Sum: " + (a + b));// 50

//		System.out.println("Subtraction is :"+ b-a);  Compile time error
		System.out.println("Subtraction is ------> Diff:" + (b - a));

		System.out.println("Multification is -----> Product:" + b * a);

		int x = 98;
		int y = 4;
		System.out.println("Division is -----> quotient: " + x / y);

		System.out.println("Modulus is -----> Reminder: " + x % y);
	}

	double addition(float a, double b) {
		double sum = a + b;
		return sum;

	}

	double subtraction(float a, double b) {
		double diff = a - b;
		return diff;

	}

	double multification(float a, double b) {
		double product = a * b;
		return product;

	}

	double division(float a, double b) {
		double quotient = a / b;
		return quotient;

	}

	double modulus(float a, double b) {
		double reminder = a % b;
		return reminder;

	}

}
