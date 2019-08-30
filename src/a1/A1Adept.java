package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemsInStore = scan.nextInt();
		double[] foodPriceArray = new double[itemsInStore];
		String[] foodNameArray = new String[itemsInStore];
		
		for (int i = 0; i < itemsInStore; i++) {
			String foodName = scan.next();
			double foodPrice = scan.nextDouble();
			foodPriceArray[i] = foodPrice;
			foodNameArray[i] = foodName; 
		}
		
		int customerCount = scan.nextInt();
		double[] moneySpentPerCustomer = new double[customerCount];
		String[] nameOfCustomer = new String[customerCount];
		for (int j = 0; j < customerCount; j++) {
				String name = scan.next() + " " + scan.next();
				nameOfCustomer[j] = name;
				int itemsBought = scan.nextInt();
				double product = 0;
				
				for (int k = 0; k < itemsBought; k++) {
						int quantityOfItem = scan.nextInt();
						String nameOfItem = scan.next();
						for (int i = 0; i < foodNameArray.length; i++) {
							if (foodNameArray[i].equals(nameOfItem)) {
							product = (foodPriceArray[i] * quantityOfItem);
							moneySpentPerCustomer[j] += product;
							break;
							}
						}	
				}		
		}
	
		double smallestNumber = minimum(moneySpentPerCustomer)[0];
		double largestNumber = maximum(moneySpentPerCustomer)[0];
		double averageSpent = average(moneySpentPerCustomer);
		
		System.out.println("Biggest: " + nameOfCustomer[(int)maximum(moneySpentPerCustomer)[1]] + " " + "(" + String.format("%.2f", largestNumber) + ")" + "\n" + "Smallest: " + nameOfCustomer[(int)minimum(moneySpentPerCustomer)[1]] + " " + "(" + String.format("%.2f", smallestNumber) + ")" + "\n" + "Average: " + String.format("%.2f", averageSpent));
		scan.close();
	}

	static double[] minimum(double[] a) {
		double currmin = a[0];
		double namePlace = 0;
		double[] holdingPlace = new double[2];
		for (int i = 0; i < a.length; i++) {
			if (currmin > a[i]) {
				currmin = a[i];
				namePlace = i;
			}
		}
		holdingPlace[0] = currmin;
		holdingPlace[1] = namePlace;
		return holdingPlace;
	}
		
	

	static double[] maximum(double[] b) {
		double currmax = b[0];
		double namePlace = 0;
		double[] holdingPlace = new double[2];
		for (int j = 0; j < b.length; j++) {
			if (currmax < b[j]) {
				currmax = b[j];
				namePlace = j;
			}
		}
		holdingPlace[0] = currmax;
		holdingPlace[1] = namePlace;
		return holdingPlace;
	}


	static double average(double[] c) {
		double sum = 0;
		for (int k = 0; k < c.length; k++) {
			sum += c[k];
		}
		sum = sum / c.length;
		return sum;
	}
}




		
	
