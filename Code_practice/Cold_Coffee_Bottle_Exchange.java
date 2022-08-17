package Code_practice;

import org.testng.annotations.Test;

public class Cold_Coffee_Bottle_Exchange {
	/*
	 * 
	 * Given number cold coffee bottles, you can exchange empty bottles for one full cold coffee bottle.
The operation of drinking a full cold coffee bottle turns it into an empty bottle.
Return the maximum number of cold coffee bottles you can drink.
	 */
	@Test
	public void example1() {
		int fullBottleCount = 9;
		int exchange = 3;
		bottleExchange(fullBottleCount, exchange);
	}

	@Test
	public void example2() {
		int fullBottleCount = 15;
		int exchange = 4;
		bottleExchange(fullBottleCount, exchange);
	}

	public static void bottleExchange(int fullbottle, int exchange) {
		int count=fullbottle;
		int drink = 0, nondrink=0;

		while(fullbottle>=exchange) {
			drink = fullbottle/exchange;
			nondrink = fullbottle%exchange;
			fullbottle=drink+nondrink;
			count+=drink;
		}
		System.out.println("remaining empty bottle = "+nondrink);
		System.out.println("bottle exchanged = "+count);
	}
}