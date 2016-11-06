package service;

import org.junit.Assert;
import org.junit.Test;

public class billTest {

	@Test
	public final void whenAnItemIsPurchasedThenTheItemCanBeEntered() {

		String total = bill.main(new String[] {});
		if (total.equalsIgnoreCase("0.00")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public final void whenAllItemsArePurchasedThenTheyCanAllBeEntered() {
		String total = bill.main(new String[] { "steak", "cheese", "cola", "coffee" });
		if (total.equalsIgnoreCase("8.00")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public final void whenFoodItemsArePurchasedThenTheyWillIncurServiceCharge() {
		String total = bill.main(new String[] { "steak", "cheese", "cola", "coffee" });
		if (!total.equalsIgnoreCase("8.00")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}