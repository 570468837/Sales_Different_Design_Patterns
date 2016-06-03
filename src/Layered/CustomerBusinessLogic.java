package Layered;

import Common.Customer;
import Common.CustomerFactory;

public class CustomerBusinessLogic {
	private static CustomerBusinessLogic cbl;
	
	public static CustomerBusinessLogic getInstance() {
		// TODO Auto-generated method stub
		if(cbl == null)
			cbl = new CustomerBusinessLogic();
		return cbl;
	}
	
	public Customer getCustomer(String id){
		return CustomerFactory.getCustomerById(id);
	}

}
