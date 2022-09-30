package com.framework;

import com.application.GSPrimeAcc;

public class ShopFactory {
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime)
	{
		PrimeAcc.bookProduct(charges);
		return null;		
		
	}
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges)
	{
		NormalAcc.bookProduct(deliveryCharges);
		return null;		
	}
}

