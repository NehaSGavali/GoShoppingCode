package com.application;

import com.framework.PrimeAcc;
import com.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isSalaried)
	{		
		GSPrimeAcc.bookProduct(charges);
		return null;
				
	}
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges)
	{
		GSNormalAcc.bookProduct(deliveryCharges);
		return null;		
	}
}
