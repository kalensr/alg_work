package proj_euler;

/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 * 
 */
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 20;
		long i =1L;
		long max = 9000000000L;
		
		for(i = 1L; i<max; i++){
			if(isDivisible(i, cnt)){
				System.out.println(Long.toString(i));
				return;
			}
		}
	}
	
	public static boolean isDivisible(long num, int maxCnt){
		
		for (int i=1;i<=maxCnt;i++){
			if(num % i != 0){
				return false;
				}
			}
		return true;
		}

}
