package Main_Sub;

import java.util.Scanner;

import Common.*;

public class SalesHelper {
	Sales sale;
	public Sales sale(){
		sale = new Sales();
		System.out.println("Start sales.");
		System.out.println("--------------------");
		
		return sale;
	}

	public static void inputCustomer(Sales sale){
		while(true){
			System.out.println("Please enter customer id(If none, press 'e')");
			Scanner sc = IOHelper.scanner;
			String s = sc.nextLine();
			if (s.equals("e")){
				System.out.println("--------------------");
				break;
			}
			Customer c = CustomerFactory.getCustomerById(s);
			if(c != null){
				sale.setCustomer(c);
				System.out.println("Welcome "+ c.getName()+ "!");
				System.out.println("--------------------");
				break;
				}
			else
				System.out.println("Invalid customer Id!");
			}
	}
	

	public static void inputGoodsItems(Sales sale) {
		Scanner sc = IOHelper.scanner;
		while(true){
			System.out.print("Input goods id(If none, press 'e'): ");
			String id = sc.next();
			if(id.equals("e"))
				break;
			Goods g = Goods.getGoodsById(id);
			if(g == null){
				System.out.println("Invalid goods id!");
				continue;
			}
			System.out.print("Input the quantity: ");
			double num = sc.nextDouble();
			GoodsItem gi = new GoodsItem(g, num);
			System.out.println(gi.toString());
			sale.addGoodsItem(gi);
		}
		System.out.println("Originally you need to pay: "+ sale.getTotalPrice());
		sale.afterStrategy();
		System.out.println("After strategy you need to pay: "+ sale.getShouldPay());
	}
	
	public void charge(Sales s){
		System.out.print("You pay: ");
		Scanner sc = IOHelper.scanner;
		double pay = sc.nextDouble();
		System.out.println("The Change is: " + s.getChange(pay));
	}
}
