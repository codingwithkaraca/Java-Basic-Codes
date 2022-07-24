package Calculator;

import java.util.Scanner;

public class Switchcasewithcalculator {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		double num1 =scanner1.nextInt();
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter the second number : ");
		double num2 =scanner2.nextInt();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("what action do you want to do :\n 1.addition \n 2.Subtraction\n 3.multiplication\n 4.division");
		int select =scanner3.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("result of collection :"+(num1+num2));
			break;
		case 2:
			System.out.println("result of extraction :"+(num1-num2));
			break;	
	
		case 3:
			System.out.println("result of multiplication :"+(num1*num2));
			break;
		case 4:
			if (num1==0||num2==0) {
				System.out.println("You can't divide using 0 (zero)");
			}
			else{  
				System.out.println(num1/num2);}
            break;
          
		default:
			System.out.println("you made the wrong choice");
			break;
		}
		



	}

}
