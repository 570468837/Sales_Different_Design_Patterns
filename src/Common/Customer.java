package Common;

public class Customer {
	String id;
	String name;
	Strategy strategy;
	
	public Customer(String id, String name, Strategy strategy) {
		super();
		this.id = id;
		this.name = name;
		this.strategy = strategy;
	}
	
	public String welcome(){
		return "Welcome" + this.name;
	}
	
	public double afterStrategy(double original){
		return strategy.afterStrategy(original);
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Strategy getStrategy() {
		return strategy;
	}


	
	
}
