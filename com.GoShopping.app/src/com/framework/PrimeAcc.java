package com.framework;

public abstract class PrimeAcc extends ShopAcc {
    boolean isPrime;
	@SuppressWarnings("unused")
	private static final float deliveryCharges = 0;
	public static void bookProduct(float f1) {
		System.out.println("Dear Prime User, Your Product Charges are  : " +getCharges());

	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getCharges()=" + getCharges() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
}
