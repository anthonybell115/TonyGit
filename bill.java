package service;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class bill {

	// public static void main(String start, String end){
	public static String main(String[] args) {

		BigDecimal costCola = new BigDecimal("0.50");
		BigDecimal costCoffee = new BigDecimal("1.00");
		BigDecimal costCheese = new BigDecimal("2.00");
		BigDecimal costSteak = new BigDecimal("4.50");
		BigDecimal totalBill = new BigDecimal("0.00");
		BigDecimal serviceCharge = new BigDecimal("0.00");
		BigDecimal serviceChargeRate = new BigDecimal("0.10");
		BigDecimal hotServiceChargeRate = new BigDecimal("0.20");
		boolean foodIncluded = false;
		boolean hotFoodIncluded = false;
		DecimalFormat df = new DecimalFormat("0.00");
		BigDecimal maxServiceCharge = new BigDecimal("20.00");

		for (int i = 0; i < args.length; i++) {

			if (args[i] == "cola") {
				totalBill = totalBill.add(costCola);
				System.out.println("1 Cola at := £" + costCola);
			} else if (args[i] == "coffee") {
				totalBill = totalBill.add(costCoffee);
				System.out.println("1 Coffee := £" + costCoffee);
			} else if (args[i] == "cheese") {
				totalBill = totalBill.add(costCheese);
				foodIncluded = true;
				System.out.println("1 Cheese Sandwich := £" + costCheese);
			} else if (args[i] == "steak") {
				totalBill = totalBill.add(costSteak);
				foodIncluded = true;
				hotFoodIncluded = true;
				System.out.println("1 Steak Sandwich := £" + costSteak);
			}
		}

		if (foodIncluded) {
			serviceCharge = totalBill.multiply(serviceChargeRate);

		}
		if (hotFoodIncluded) {
			serviceCharge = totalBill.multiply(hotServiceChargeRate);

		}

		int i = serviceCharge.compareTo(maxServiceCharge);
		if (i > 0) {
			serviceCharge = maxServiceCharge;
		}

		totalBill = totalBill.add(serviceCharge);
		System.out.println("Service Charge := £" + df.format(serviceCharge));
		System.out.println("Total Bill := £" + df.format(totalBill));
		return totalBill.toString();
	}

}
