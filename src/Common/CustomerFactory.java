package Common;

import java.util.ArrayList;

public class CustomerFactory {
	public static ArrayList<Customer> c = new ArrayList<>();
	static Strategy defaultStrategy = new Strategy(0.8, 30);
	
	static{
		c.add(new Customer("1", "黄晓明", defaultStrategy));
		c.add(new Customer("2", "Angelababy", defaultStrategy));
		c.add(new Customer("3", "李晨", defaultStrategy));
		c.add(new Customer("4", "范冰冰", defaultStrategy));
	}
	
	public static Customer getCustomerById(String id){
		for(Customer u : c)
			if(u.id.equals(id))
				return u;
		return null;
	}
	
}
