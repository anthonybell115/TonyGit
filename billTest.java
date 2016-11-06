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
		if (total.equalsIgnoreCase("8.8000")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public final void whenHotFoodItemsArePurchasedThenTheyWillIncurServiceChargeOf20() {
		String total = bill.main(new String[] { "steak", "cheese", "cola", "coffee" });
		if (total.equalsIgnoreCase("9.6000")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public final void whenHotFoodItemsArePurchasedThenTheyWillIncurServiceChargeOf20rounded() {
		String total = bill.main(new String[] { "steak", "cheese", "cola", "coffee" });
		if (total.equalsIgnoreCase("9.60")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}