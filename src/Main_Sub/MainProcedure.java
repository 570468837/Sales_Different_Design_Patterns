package Main_Sub;

import java.util.Scanner;

import Common.IOHelper;
import Common.Sales;

public class MainProcedure {

	public void startSales(){
		System.out.println("--------------------");
		System.out.println("Welcome!");
		System.out.println("--------------------");
		ifstart();
		exitSales();
	}
	
	private void ifstart() {
		// TODO Auto-generated method stub
		System.out.println("Start Sale?(Press 1 to start, press 2 to quit)");
		Scanner sc = IOHelper.scanner;
		while (true){
			String s = sc.nextLine();
			if(s.equals("1")){
				callSubRoutine();
				break;
			}
			else if(s.equals("2"))
				break;
			else
				System.out.println("Invalid Command!");
		}
	}

	public void exitSales(){
		System.out.println("--------------------");
		System.out.println("Goodbye!");
		System.out.println("--------------------");
	}
	
	public void callSubRoutine(){
		SalesHelper sh = new SalesHelper();
		Sales s = sh.sale();
		sh.inputCustomer(s);
		sh.inputGoodsItems(s);
		sh.charge(s);
		s.printBill();
		
	}
	
	public static void main(String[] args){
		MainProcedure m = new MainProcedure();
		m.startSales();
	}
}
