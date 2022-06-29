package functioncalls;

public class Prime {
	public String findPrime(int num) {
		int a=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				a++;
			}
		}
		if(a==0) {
			return"Its prime";
		}
		else {
			return" is not Prime";
		}
	}
}
