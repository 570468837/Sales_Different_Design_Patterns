package MVC;

import Common.Customer;
import Common.CustomerFactory;
import Layered.CustomerBusinessLogic;

public class CustomerModel {
	private static CustomerBusinessLogic cbl;
	
	public CustomerModel(){
		cbl = CustomerBusinessLogic.getInstance();
	}
	
	public Customer getCustomer(String id){
		return CustomerFactory.getCustomerById(id);
	}
}
