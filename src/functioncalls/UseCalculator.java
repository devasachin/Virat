package functioncalls;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator c1=new Calculator();
		c1.add(10, 15);
		c1.sub(15, 7);
		System.out.println(c1.multiply(6, 6));
		System.out.println(c1.divide(5, 3));
		System.out.println(c1.modulus(17, 4));
		System.out.println(c1.word("DEVA"));
	}

}
