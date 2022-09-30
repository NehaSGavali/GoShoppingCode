package com.framework;

public abstract class ShopAcc 
{
	private int accNo;
	private String accNm;
	private static double charges = 1000.00 ;
	public static void bookProduct(float f1)
	{
		System.out.println("Product book and charges are : " +charges);
	}
	void items(float f2)
	{
		System.out.println("Items are delivered with charges : " +charges);
	}
	@Override
	public String toString() 
	{
		return "ShopAcc [accNm=" + getAccNm() + "]";
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public static double getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public ShopAcc(int accNo, String accNm, float charges) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
}
