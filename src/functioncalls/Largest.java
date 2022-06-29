package functioncalls;

public class Largest {
	public String findLarger(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			return num1+" is Bigger";
		}
		else if(num2>num1&&num2>num3) {
			return num2+" is bigger";
		}
		else if(num3>num1&&num3>num2) {
			return num3+" is Biggest";
		}
		else {
			return "nothing";
		}
	}

}
