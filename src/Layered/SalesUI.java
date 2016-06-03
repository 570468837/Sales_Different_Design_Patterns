package Layered;

import java.util.Scanner;

import Common.Customer;
import Common.CustomerFactory;
import Common.IOHelper;
import Main_Sub.SalesHelper;
import OO.SalesManager;

public class SalesUI {
	SalesManager sm;
	SalesBusinessLogic sbl;
	CustomerBusinessLogic cbl;
	Scanner sc;
	
	public SalesUI(){
		sbl = SalesBusinessLogic.getInstance();
		cbl = CustomerBusinessLogic.getInstance();
		sc = IOHelper.scanner;
	}
	
	public void sale(){
		System.out.println("Start sales.");
		System.out.println("Input customer id:");
		String id = sc.nextLine();
		Customer c = cbl.getCustomer(id);
		
		sm = sbl.getSalesManager();
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

