package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		int age = 18;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter first Number: ");
		
		int num3 = sc.nextInt();
		System.out.println("Eneter Second Number: ");	
		int num4 = sc.nextInt();
		
		String result3 = (num3 > num4)? "A":"B";
		System.out.println(result3 + " is greater");
		
		String result4 = (num3 >= 0)?"Positive":"Nagative";
		System.out.println(result4);
		
		int result5 = (num3 < num4 )? num3:num4;
		System.out.println(result5 + " is Smallest");
		
		
		String result6 = (num3 <= 12)? "Child":
			(num3 <= 19)? "Teenager":
				(num3 <= 59)? "Adult":
					(num3 >= 60)?"Senior Citizen":
						"Old";
		System.out.println("Your in : "+result6);
		
		
		
		String result = (age > 18) ? "Eligible" : "Not Eligible";
		System.out.println(result);
		
		int marks = 75;
		String grade = (marks > 90)? "A":
			           (marks > 80)? "B":
		               (marks > 70)? "C": "D";
		
		System.out.println(grade);
		
		int num = 10;
		
		String result1 = (num >= 0)? "positive":
			              (num < 0)? "Nagative":
			            	  "Not a number";
		
		System.out.println(result1);
		
		
		int num2 = 12;
		
		String result2 = (num2 % 2 == 0)? "Even":
			             "Odd";
		System.out.println(result2);	

	}

}
