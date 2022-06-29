package functioncalls;

public class Factorial {
	public int findFactorial(int num) {
		int a=1;
		for(int i=1;i<=num;i++) {
			 a=a*i;
		}
		return a;
	}

}
