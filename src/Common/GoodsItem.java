package Common;

public class GoodsItem {
	Goods goods;
	double quantity;
	double total;
	
	public GoodsItem(Goods goods, double quantity) {
		super();
		this.goods = goods;
		this.quantity = quantity;
		this.total = goods.getPrice() * quantity;
	}

	public Goods getGoods() {
		return goods;
	}

	public double getQuantity() {
		return quantity;
	}
	
	public double getTotal(){
		return total;
	}
	
	public String toString(){
		return goods.getName() + "	" + goods.getPrice() + "	" + quantity + "	" + total;
	}
}
