package functioncalls;


public class Cars {
	String brand;
	int price;
	String color;
	int taxAmount;
	public int netPrice() {
		int netPrice=price+taxAmount;
		return netPrice;
	}
}
