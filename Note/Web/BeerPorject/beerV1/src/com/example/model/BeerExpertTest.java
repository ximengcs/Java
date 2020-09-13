package com.example.model;

public class BeerExpertTest {
	public static void main( String[] args ) {
		BeerExpert beer = new BeerExpert();
		
		String color = "light";
		System.out.println( color );
		System.out.println( beer.getBrands( color ) );
		
		color = "amber";
		System.out.println( color );
		System.out.println( beer.getBrands( color ) );
		
		color = "brown";
		System.out.println( color );
		System.out.println( beer.getBrands( color ) );
	}
}