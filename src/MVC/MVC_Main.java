package MVC;

public class MVC_Main {
	
	public static void main(String[] args){
		SalesView sv = new SalesView();
		sv.sale();
		sv.charge();
		sv.printBill();
	}
}
