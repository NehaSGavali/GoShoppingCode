package com.application;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	@SuppressWarnings("unused")
	private static final float Charges = 0;
	
	public static void bookProduct(float f1)
	{
		System.out.println("Dear Prime User, Your Product Charges are  : " +getCharges());
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getCharges()="
				+ getCharges() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
    
}
