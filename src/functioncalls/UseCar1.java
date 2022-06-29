package functioncalls;

public class UseCar1 {
	public static void main(String[]args) {
		Car1 c1=new Car1();
		c1.price=1000000;
		c1.brand="Mahendra";
		c1.color="Red";
		c1.taxPrice=5000;
		c1.regNo=6647;
		Car1 c2=new Car1();
		c2.price=500000;
		c2.brand="Xylo";
		c2.color="Black";
		c2.taxPrice=10987;
		c2.regNo=7776;
		System.out.println(c1.findPrime(c2));
		System.out.println(c2.findPrime(c1));
		System.out.println(c2.findNetprice(c1));
		System.out.println(c1.findNetprice(c2));
		System.out.println((c1.findAverage(c2)+c2.findAverage(c1))/2);
		
	}

}
