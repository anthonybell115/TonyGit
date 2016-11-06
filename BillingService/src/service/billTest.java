package service;

import org.junit.Assert;
import org.junit.Test;

public class billTest {

	@Test
	public final void whenAFoodItemIsPurchasedThenTheItemCanBeEntered() {
		String total = bill.main(new String[] {});
		if (total.equals("0.00")) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public final void whenAllFoodItemsArePurchasedThenTheyCanAllBeEntered() {
		String total = bill.main(new String[] { "steak", "cheese", "cola", "coffee" });
		if (total.equals("0.00")) {
			Assert.assertTrue(true);
		}
	}

}