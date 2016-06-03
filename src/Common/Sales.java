package Common;

import java.util.ArrayList;
import java.util.Scanner;

public class Sales {
	ArrayList<GoodsItem> goodsItem = new ArrayList<GoodsItem>();
	double totalPrice;
	Customer customer;
	double shouldPay;
	double pay;
	
	public double getChange(double pay){
		this.pay = pay;
		return pay - shouldPay;
	}
	
	public void afterStrategy(){
		if(customer == null)
			shouldPay = totalPrice;
		else
			shouldPay = customer.afterStrategy(totalPrice);
	}
	
	public void printBill(){
		System.out.println("--------------------");
		System.out.println("This "+ customer.getName() + "'s bill");
		for(GoodsItem gi: getGoodsItem())
			System.out.println(gi.toString());
		System.out.println("Originally you need to pay: " + getTotalPrice());
		System.out.println("After strategy you need to pay: "+ shouldPay);
		System.out.println("You pay: " + pay);
		System.out.println("The change is:" + (pay - shouldPay));
	}

	
	public void addGoodsItem(GoodsItem oneGi){
		goodsItem.add(oneGi);
		totalPrice += oneGi.getTotal();
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public ArrayList<GoodsItem> getGoodsItem() {
		return goodsItem;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getShouldPay() {
		return shouldPay;
	}

	
	
	
}
