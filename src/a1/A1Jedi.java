package a1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Want format amountOfCustomers bought amountOfItem nameOfItem
		int itemsInStore = scan.nextInt();
		double[] foodPriceArray = new double[itemsInStore];
		String[] foodNameArray = new String[itemsInStore];
		int[] foodCountArray = new int[itemsInStore];
		int[] numberOfCustomersBought = new int[itemsInStore];
		
		for (int i = 0; i < itemsInStore; i++) {
			String foodName = scan.next();
			double foodPrice = scan.nextDouble();
			foodPriceArray[i] = foodPrice;
			foodNameArray[i] = foodName; 
		}
		
		int customerCount = scan.nextInt();
		String[] nameOfCustomer = new String[customerCount];
		for (int j = 0; j < customerCount; j++) {
				String name = scan.next() + " " + scan.next();
				nameOfCustomer[j] = name;
				int itemsBought = scan.nextInt();
		/* Up to here is good. Want a for loop that scrolls through the items bought,
		 * and if the nameOfItem is equal to the array in the foodName array, add it
		 * the quantityOfItem to a new array and store it in the same place as the
		 * foodNameArray.
		 */
				
				for (int k = 0; k < itemsBought; k++) {
						int quantityOfItem = scan.nextInt();
						String nameOfItem = scan.next();
						for (int i = 0; i < foodNameArray.length; i++) {
							if(foodNameArray[i].equals(nameOfItem)) {
								foodCountArray[i] += quantityOfItem;
								numberOfCustomersBought[i] += 1;
							
							}
						}	
				}		
		}
		for (int i = 0; i < foodNameArray.length; i++) {
			if (foodCountArray[i] == 0) {
				System.out.println("No customers bought " + foodNameArray[i]);
			} else {
			System.out.println(numberOfCustomersBought[i] + " customers bought " + foodCountArray[i] + " " + foodNameArray[i]);
		}
	scan.close();
	
	}
	}
}