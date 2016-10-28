package alg_work;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsSort {

	private InsSort iSort = new InsSort();
	private SelSort sSort = new SelSort();
	
	@Test
	public void test_1() {
		int size = 50000;
		int[] l = new int[size];
		int[] k;
		
		for(int i=0;i<size;i++){
			int random = (int )(Math.random() * 1000 + 1);
			l[i] = random;
			System.out.print(random + " ");
		}
		System.out.println();
		
		long startTime, stopTime;
		k=null;
		// Insert Sort
		startTime = System.nanoTime();
		k =iSort.sort(l);
		stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
		
		k=null;
		// Selection Sort
		startTime = System.nanoTime();
		k =sSort.sort(l);
		stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
		
		/*assertTrue(l.length==k.length);
		for(int i=1;i<k.length;i++){
			assertTrue(k[i-1]<=k[i]);
		}*/
	}

}
