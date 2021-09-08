package chapter03;

import mypackage.Goods2;

public class DiscounGoods extends Goods2 {
	private float discountRate = 0.5f;
	
	public float gatDiscountPrice() {
		return discountRate*price;
	}

}
