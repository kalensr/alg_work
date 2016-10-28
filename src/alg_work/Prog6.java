package alg_work;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sqrSum = 0;
		
		for (int i = 1; i<=100;i++){
			sum += i * i;
			sqrSum += i;
		}
		System.out.println(Integer.toString((sqrSum*sqrSum)-sum));

	}

}
