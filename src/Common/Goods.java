package Common;

public enum Goods {
	A("1", "飞利浦台灯", 50),
	B("2", "高露洁牙膏", 5),
	C("3", "旺仔牛奶250ml", 4.5),
	D("4", "农夫山泉600ml", 1.5),
	E("5", "清风抽纸200抽", 6);
	
	private String id;
	private String name;
    private double price;
	
    Goods(String id, String name, double price){
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }
    
    public String getId(){
    	return this.id;
    }

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getGoodsInfo(){
		return this.id + " " + this.name + " " + this.price ;
	}
	
	public static Goods getGoodsById(String id){
		switch(id){
		case "1": return A;
		case "2": return B;
		case "3": return C;
		case "4": return D;
		case "5": return E;
		default: 
			return null;
		}
	}
	
}
