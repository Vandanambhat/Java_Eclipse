package com.xworkz.collections.FunctionalInterface;

public class BeerScanner {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();
		
		BeerSearch beerSearch = new EqualsBeerSearch();
		boolean result=beerDAO.find(beerSearch, "Astol");
		System.out.println(result);
		
		BeerSearch beerSearch1 = new EqualsIgnoreCaseBeerSearch();
		boolean result1=beerDAO.find(beerSearch1, "beer1");
		System.out.println(result1);

	}

}
