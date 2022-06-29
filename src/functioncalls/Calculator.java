package functioncalls;

public class Calculator {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	public void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}
	public int multiply(int num1,int num2) {
		int num=num1*num2;
		return num;
	}
	public float divide(int num1,int num2) {
		float num=num1/num2;
		return num;
	}
	public int modulus(int num1,int num2) {
		int num=num1%num2;
		return num;
	}
	public int word(String a) {
		int word=a.length();
		return word;
	}

}
