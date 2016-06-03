package OO;

import Common.Customer;
import Common.GoodsItem;
import Common.Sales;

public class SalesManager {
	Sales sale = new Sales();
	Printer printer = new Printer();
	
	public void setCustomer(Customer c) {
		// TODO Auto-generated method stub
		sale.setCustomer(c);
	}
	
	public void addGoodsItem(GoodsItem gi){
		sale.addGoodsItem(gi);
	}

	public Sales getSale() {
		return sale;
	}
	
	public double getTotalPrice(){
		return sale.getTotalPrice();
	}
	
	public double getShouldPay(){
		return sale.getShouldPay();
	}

	public void afterStrategy() {
		// TODO Auto-generated method stub
		sale.afterStrategy();
	}
	
	public double getChange(double pay){
		return sale.getChange(pay);
	}
	
	public void printBill(){
		sale.printBill();
	}
	
}
