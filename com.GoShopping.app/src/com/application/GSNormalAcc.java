package com.application;

import com.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) 
	{
		super(accNo, accNm, charges, deliveryCharge);
	}

	public static void bookProduct(float f1) {
		System.out.println("Dear Normal User, Your Product Charges are  : " +getCharges()+ " with Delivery Charges are : "+getDeliveryCharge());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + getDeliveryCharge() + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
				+ getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
