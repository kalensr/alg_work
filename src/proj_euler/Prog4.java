package proj_euler;

public class Prog4 {


	/*A palindromic number reads the same both ways. The largest palindrome made from the 
	 * product of two 2-digit numbers is 9009 = 91 × 99.

		Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 100; i <1000; i++){
			for(int j = 100; j < 1000; j++){
				if(isPalindrome(i*j)){
					System.out.println(Integer.toString(i*j));
				}
			}
		}

	}
	
	public static boolean isPalindrome(int num){
		String sNum = Integer.toString(num);
		String revNum = new StringBuffer(sNum).reverse().toString();
		
		if(sNum.equals(revNum)){
			return true;
		}
		return false;
	}

}
