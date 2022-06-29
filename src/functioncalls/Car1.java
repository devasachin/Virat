package functioncalls;

public class Car1 {
	String brand;
	int price;
	String model;
	String color;
	int taxPrice;
	int netPrice;
	int regNo;
	public int findNetprice(Car1 a) {
		int findNetprice=price+taxPrice;
		return findNetprice;
	}
	public int findAverage(Car1 a) {
		int findAverage=netPrice/2;
		return findAverage;
	}
	public String findPrime(Car1 z) {
		int a=0;
		for(int i=2;i<z.regNo;i++) {
			if(z.regNo%i==0) {
				a++;
			}
		}
		if(a==0) {
			return"c1 is prime";
		}
		else {
			return"c2 is not Prime";
		}
				
			}
}
	


