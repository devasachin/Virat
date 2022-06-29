package functioncalls;

public class UseCar {
	public static void main(String[]args) {
		Car c=new Car();
		c.brand="Swift";
		c.color="Blue";
		c.price=750000;
		Car c1=new Car();
		c1.brand="Maruthi";
		c1.color="Black";
		c1.price=100000;
		System.out.println(c1.findLarger(c));
	}

}
