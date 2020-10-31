package test;

import lab1.Beverage;
import lab1.HouseBlend;

public class Test {

	public static void main(String[] args) {
		Beverage b=new HouseBlend(false, true, true, false);
		System.out.println(b.getDescription()+": "+b.cost()+"$");
	}
}
