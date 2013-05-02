/**
 * 
 */
package com.mckinsey.billDisc;

import com.mckinsey.billDisc.pojo.User;
import com.mckinsey.billDisc.types.ItemType;
import com.mckinsey.billDisc.types.UserType;

/**
 * 
 * On a retail website, the following discounts apply:
 *  1. If the user is an employee of the store, he gets a 30% discount
 *  2. If the user is an affiliate of the store, he gets a 10% discount
 *  3. If the user has been a customer for over 2 years, he gets a 5% discount.
 *  4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount). 
 *  5. The percentage based discounts do not apply on groceries. 
 *  6. A user can get only one of the percentage based discounts on a bill.  
 *  Write a program with test cases such that given a bill,
 *  it finds the net payable amount. Please note the stress
 *  is on object oriented approach and test coverage.
 * @author Ritika Jagtiani
 *
 */
public class BillDiscountMain {
  
	public static void main (String [] args) {
		BillDiscountMain obj = new BillDiscountMain();
		User u1 = new User(1, "ABC", UserType.AFFILIATE, 200.0, ItemType.GROCERIES);
		User u2 = new User(2, "XYZ", UserType.OLD_CUSTOMER, 500.0, ItemType.OTHERS);//2 years old
		User u3 = new User(3, "PQR", UserType.NEW_CUSTOMER, 1200.0, ItemType.GROCERIES);
		User u4 = new User(4, "LMN", UserType.NEW_CUSTOMER, 600.0, ItemType.OTHERS);
		User u5 = new User(5, "GKH", UserType.EMPLOYEE, 700.0, ItemType.GROCERIES);
		System.out.println(u1 + "   Final bill amount : " + obj.calcDiscount(u1));
		System.out.println(u2 + "   Final bill amount : " + obj.calcDiscount(u2));
		System.out.println(u3 + "   Final bill amount : " + obj.calcDiscount(u3));
		System.out.println(u4 + "   Final bill amount : " + obj.calcDiscount(u4));
		System.out.println(u5 + "   Final bill amount : " + obj.calcDiscount(u5));
	}

	private Double calcDiscount(User user) {
		Double finalBillAmount = 0.0;
		switch (user.getUsertype()) {
			case AFFILIATE:
				finalBillAmount = user.getBill().doubleValue() * .9;
				break;
			case EMPLOYEE:
				finalBillAmount = user.getBill().doubleValue() * .7;
				break;
			case OLD_CUSTOMER:
				finalBillAmount = user.getBill().doubleValue() * .95;
				break;
			case NEW_CUSTOMER:
				{
					switch(user.getItemType()) {
						case GROCERIES:
							finalBillAmount = user.getBill().doubleValue();
							break;
						case OTHERS:
							if (user.getBill().compareTo(100.0) > 0) {
								finalBillAmount = user.getBill().doubleValue() * .95;
							} else {
								finalBillAmount = user.getBill().doubleValue();
							}
							break;
					}
					break;
				}
		}
		return finalBillAmount;
	}

}
