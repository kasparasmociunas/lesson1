package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//arPirminis
		
		

		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide an Integer");
		
		int number = scanner.nextInt();
		
		 boolean isPrimary = isPrimary(number);
		
		System.out.println(isPrimary(number));
		
		
		
	}

	private static boolean  isPrimary(int number) {
		
		boolean isThereRemainder = true;
		int divider = 2;
		
		while (number % divider !=0 && divider++ < number);
		return divider == number;
	}
	
}
