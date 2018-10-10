import java.util.Scanner;

public class ShopperRewardsBrown
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the cost of your groceries: ");
		double cost = in.nextDouble();
		
		double discountPercent = 0;
		int discountPrint = 0;
		double couponAmount = 0;
		int gallonDiscount = 0;
		final double tier1PurchaseRangeBottom = 10.01;
		final double tier1Discount = 0.08;
		final double tier2PurchaseRangeBottom = 60.01;
		final double tier2Discount = 0.10;
		final double tier3PurchaseRangeBottom = 150.01;
		final double tier3Discount = .12;
		final double tier4PurchaseRangeBottom = 210.01;
		final double tier4Discount = .14;
		final int tier3GallonPurchaseRange = 99;
		final int tier3GallonDiscount = 3;
		final int tier2GallonPurchaseRange = 49;
		final int tier2GallonDiscount = 2;
		final int tier1GallonPurchaseRange = 1;
		final int tier1GallonDiscount = 1;
		
		if (cost >= tier4PurchaseRangeBottom)
		{
			discountPercent = tier4Discount;
		}
		else if (cost >= tier3PurchaseRangeBottom)
		{
			discountPercent = tier3Discount;
		}
		else if (cost >= tier2PurchaseRangeBottom)
		{
			discountPercent = tier2Discount;
		}
		else if (cost >= tier1PurchaseRangeBottom)
		{
			discountPercent = tier1Discount;
		}
		else
		{
			discountPercent = 0.00;
		}
		
		discountPrint = (int) ((discountPercent) * 100);
		couponAmount = (cost * discountPercent);
		
		if(cost > tier3GallonPurchaseRange)
		{
			gallonDiscount = tier3GallonDiscount;
		}
		else if(cost > tier2GallonPurchaseRange)
		{
			gallonDiscount = tier2GallonDiscount;
		}
		else if (cost >= tier1GallonPurchaseRange)
		{
			gallonDiscount = tier1GallonDiscount;
		}
		else
		{
			gallonDiscount = 0;
		}
		
		System.out.printf("Cost of Groceries: $%.2f" , cost);
		System.out.println("");
		System.out.printf("You receive a discount coupon of: $%.2f" , couponAmount);
		System.out.println(". (" + discountPrint + "% of your purchase.)");
		System.out.println("You have earned a " + gallonDiscount + "¢ discount per gallon of gas.");

		in.close();
	}
}