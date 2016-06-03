package OO;

import Common.GoodsItem;

public class Printer {
	
	public static void welcomeCustomer(String name){
		System.out.println("--------------------");
		System.out.println("Welcome "+ name + "!");
	}
	
	public static void startSales(){
		System.out.println("--------------------");
		System.out.println("Start sales.");
	}
	
	public static void goodsItem(GoodsItem gi){
		System.out.println(gi.toString());
	}
	
	public void exitSales(){
		System.out.println("--------------------");
		System.out.println("Goodbye!");
		System.out.println("--------------------");
	}
}
