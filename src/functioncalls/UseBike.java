package functioncalls;

public class UseBike {
	public static void main(String[]args) {
		Bike b1=new Bike();
		b1.brand="Yamaha";
		b1.price=60000;
		b1.model="RX 100";
		b1.taxAmount=5;
		Bike b2=new Bike();
		b2.brand="BAJAJI";
		b2.price=90000;
		b2.model="Pulsar 150";
		b2.taxAmount=10;
		b1.dev();
		b2.dev();
		int a=b1.netPrice();
		System.out.println(a);
		System.out.println(b2.netPrice());
		System.out.println(b1.length(b1.brand));
		System.out.println(b2.length(b2.brand));
		
	}

}
