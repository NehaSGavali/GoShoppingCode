package com.main.goshopping;
import com.application.*;
import com.framework.*;
public class Main {

	public static void main(String[] args) 
	{

		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(0, null, 0, false);
		gssfactory.getNewNormalAccount(0, null, 0, 0);
		
		
		GSPrimeAcc gsprime=new GSPrimeAcc(111, "Neha", 1500, true);
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		gsprime.bookProduct(00);
		gsprime.toString();
		
		GSNormalAcc gsnormal=new GSNormalAcc(112, "Neha", 1800, 40);
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.bookProduct(00);
		gsnormal.toString();
	}
}
//API is Any service requirement specification which has methods are always public and abstract
//In JAVA 8 , default and static methods are also introduced in interfaces.
//