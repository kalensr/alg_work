package alg_work;

public class Karatsuba {

	public int multiply(int[] num1, int[] num2) {
		
		if((num1.length + num2.length) / 2 == 1){
			return num1[0] * num2[0];
			}
		else{
			// split 1 array, then solve for each
		}
		
		int n = (num1.length + num2.length) / 2;
		
		int p = num1[0];
		int q = num1[1];
		int r = num2[0];
		int s = num2[1];
		
		return (int) (p*r*(Math.pow(10, n))+ (p*r+q*s-(q-p)*(s-r))*(Math.pow(10,(n/2)))+ q*s);
	}
	
	
	public int solve(int[] num1, int[] num2){
		
		int n = (num1.length + num2.length) / 2;
		
		int p = num1[0];
		int q = num1[1];
		int r = num2[0];
		int s = num2[1];
		
		return (int) (p*r*(Math.pow(10, n))+ (p*r+q*s-(q-p)*(s-r))*(Math.pow(10,(n/2)))+ q*s);
	}
	
	public int[] strgToInt(String num){
		int[] numD1 = new int[num.length()];
		for(int i=0; i<num.length();i++){
			numD1[i] = num.charAt(i)-48;			
		}
		return numD1;
	}
	public int karatsuba(String num1, String num2){
		
		int[] numD1 = strgToInt(num1);
		int[] numD2 =  strgToInt(num2);

		
		return multiply(numD1, numD2);
	}
}
