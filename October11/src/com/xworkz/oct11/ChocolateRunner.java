package com.xworkz.oct11;

import com.xworkz.oct11.boot.*;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Chocolate chocolate1 = new Chocolate();
		chocolate1.name= "dairyMilk";
		chocolate1.brand="cadburry";
		chocolate1.flavour="fruitNNut";
		chocolate1.price=50;
		
		System.out.println(chocolate1.name);
		System.out.println(chocolate1.brand);
		System.out.println(chocolate1.flavour);
		System.out.println(chocolate1.price);
		
		}

}
