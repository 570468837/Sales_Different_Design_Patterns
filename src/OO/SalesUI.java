package OO;

import java.util.Scanner;

import Common.Customer;
import Common.CustomerFactory;
import Common.IOHelper;
import Main_Sub.SalesHelper;

public class SalesUI {
	Scanner sc = IOHelper.scanner;
	SalesManager sm;
	public void sale(){
		sm = new SalesManager();
		Printer.startSales();
		System.out.println("Input customer id:");
		String id = sc.nextLine();
		Customer c = CustomerFactory.getCustomerById(id);
		sm.setCustomer(c);
		System.out.println("Welcome "+ c.getName()+"!");
		
		SalesHelper.inputGoodsItems(sm.getSale());
		
	}
	
	public void charge(){
		System.out.print("You pay: ");
		Scanner sc = IOHelper.scanner;
		double pay = sc.nextDouble();
		System.out.println("The Change is: " + sm.getChange(pay));
	}
	
	public void printBill(){
		sm.printBill();
	}
	
}
