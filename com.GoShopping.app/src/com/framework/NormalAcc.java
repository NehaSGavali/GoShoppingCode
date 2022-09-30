package com.framework;

public abstract class NormalAcc extends ShopAcc{
	private static float deliveryCharge=50;
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	public static void bookProduct(float f1)
	{
		System.out.println("Dear  User, Your Product Charges are  : " +getCharges()+ " with Delivery Charges are : "+deliveryCharge);

	}
	public String toString() {
		return "NormalAcc [deliveryCharge=" + getDeliveryCharge() + "]";
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
}
