package MVC;

import java.util.Scanner;

import Common.Customer;
import Common.IOHelper;
import Main_Sub.SalesHelper;
import OO.SalesManager;

public class SalesController {
	Scanner sc ;
	SalesView sv;
	SalesModel sModel;
	CustomerModel cModel;
	SalesManager sm;
	
	public SalesController(SalesView sv){
		this.sv = sv;
		sModel = new SalesModel();
		cModel = new CustomerModel();
		sm = new SalesManager();
		sc = sv.getScanner();
	}
	
	public void sale() {
		// TODO Auto-generated method stub
		sv.output("Start sales.");
		sv.output("Input customer id:");
		String id = sc.nextLine();
		Customer c = cModel.getCustomer(id);
		
		sm = sModel.getSalesManager();
		sm.setCustomer(c);
		sv.output("Welcome "+ c.getName()+"!");
		
		SalesHelper.inputGoodsItems(sm.getSale());
	}

	public void charge() {
		// TODO Auto-generated method stub
		sv.output("You pay: ");
		double pay = sc.nextDouble();
		sv.output("The Change is: " + sm.getChange(pay));
	}

	public void printBill() {
		// TODO Auto-generated method stub
		sm.printBill();
	}

}
