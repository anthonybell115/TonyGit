package service;

import java.math.BigDecimal;

public class bill {

	// public static void main(String start, String end){
	public static String main(String[] args) {

		BigDecimal costCola = new BigDecimal("0.50");
		BigDecimal costCoffee = new BigDecimal("1.00");
		BigDecimal costCheese = new BigDecimal("2.00");
		BigDecimal costSteak = new BigDecimal("4.50");
		BigDecimal totalBill = new BigDecimal("0.00");

		for (int i = 0; i < args.length; i++) {

			if (args[i] == "cola") {
				totalBill = totalBill.add(costCola);
				System.out.println("1 Cola at := £" + costCola);
			} else if (args[i] == "coffee") {
				totalBill = totalBill.add(costCoffee);
				System.out.println("1 Coffee := £" + costCoffee);
			} else if (args[i] == "cheese") {
				totalBill = totalBill.add(costCheese);
				System.out.println("1 Cheese Sandwich := £" + costCheese);
			} else if (args[i] == "steak") {
				totalBill = totalBill.add(costSteak);
				System.out.println("1 Steak Sandwich := £" + costSteak);
			}
		}
		System.out.println("Total Bill := £" + totalBill);
		return totalBill.toString();
	}

}
