package doubtProgrames;

import java.util.Scanner;

public class StringDemo1 {
	
	
	public static void main(String[] args) {
		int number = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print multiple table");
		sc.next();
		
		for (int i = 0; i <=10; i++) {
			System.out.println(number+"*"+i+"="+(number*i));
			
		}
		

	}
}
