package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalNumber = scan.nextInt();
		
		
		for (int i = 0 ; i < totalNumber; i++) {
			
			double product = 0;
		
			String firstName = scan.next();
		
			String lastName = scan.next();
		
			int itemsBought = scan.nextInt();
			
		
			for (int j = 0; j < itemsBought; j++) {
				
				int numberOfItems = scan.nextInt();
		
		
				for (int k = 0; k < 1; k++); {
					String foodName = scan.next();
					
					double foodPrice = scan.nextDouble();
					
					product = product + numberOfItems * foodPrice;
		
		}
		// Print statement first initial, last: + total
		}
		char firstInitial = (firstName.charAt(0));
		System.out.println(firstInitial + ". " + lastName + ": " + String.format("%.2f",product));
		
		}
		scan.close();
		
	}
	
}
