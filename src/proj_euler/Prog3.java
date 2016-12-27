package proj_euler;

public class Prog3 {

	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29.
		What is the largest prime factor of the number 600851475143 ?
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num = 600851475143L;
		
		for (long i=2; i<=num; i++){
			if ((num % i == 0) & (isPrime(i)==true)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(long p){
		boolean prime = true;
		
		for (long i=2; i<p;i++){
			if(p % i == 0){
				prime = false;
				return prime;
			}
		}
		return prime;
		
	}

}
