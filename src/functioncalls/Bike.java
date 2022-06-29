package functioncalls;

public class Bike {
	String brand;
	int price;
	String model;
	int taxAmount;
	public int netPrice() {
	int num=price+(price*taxAmount/100);
	return num;
	}
	public void dev() {
		System.out.println(brand+" "+price+" "+model+" "+taxAmount);
	}
	public int length(String brand) {
	int length=brand.length();
	return length;
	}

}
