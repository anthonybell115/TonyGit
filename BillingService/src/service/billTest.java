package service;

import org.junit.Assert;
import org.junit.Test;

public class billTest {

	@Test
	public final void whenAFoodItemIsPurchasedThenTheItemCanBeEntered() {

		String total = bill.main(new String[] {});
		if (total.equalsIgnoreCase("0.00")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public final void whenAllFoodItemsArePurchasedThenTheyCanAllBeEntered() {
		String total = bill.main(new String[] { "steak", "cheese", "cola", "coffee" });
		if (total.equalsIgnoreCase("8.00")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}