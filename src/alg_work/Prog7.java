package alg_work;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i = 2;i<1000000;i++){
			if(count == 10001){
				System.out.println(Integer.toString(count));
				return;
			}
			if(isPrime(i)){
				System.out.println(Integer.toString(i));
				count++;
			}
		}
		System.out.println(Integer.toString(count));

	}
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if(num % i == 0 ){
				return false;
			}
		}
		return true;
	}
	

}
