package MVC;

import java.util.Scanner;

import Common.IOHelper;

public class SalesView {
	Scanner sc;
	SalesController scon;
	
	public SalesView(){
		sc = IOHelper.scanner;
		scon = new SalesController(this);
	}
	
	public void sale(){
		scon.sale();
	}
	
	public void charge(){
		scon.charge();
	}
	
	public void printBill(){
		scon.printBill();
	}
	
	public Scanner getScanner(){
		return sc;
	}
	
	public void output(String str){
		System.out.println(str);
	}
}
