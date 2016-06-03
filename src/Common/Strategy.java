package Common;

public class Strategy {
	double discount;
	double scope;

	public Strategy(double discount, double scope) {  //满scope元可以打discount折。
		super();
		this.discount = discount;
		this.scope = scope;
	}

	public double afterStrategy(double original) {
		if(original >= scope)
			return original * discount;
		return original;
	}

}
