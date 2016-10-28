package alg_work;

import org.junit.Test;

public class TestInsSort {

	private InsSort iSort = new InsSort();
	private SelSort sSort = new SelSort();
	
	@Test
	public void test_1() {
		int size = 50000;
		int[] l = new int[size];
		
		for(int i=0;i<size;i++){
			int random = (int )(Math.random() * 1000 + 1);
			l[i] = random;
			System.out.print(random + " ");
		}
		System.out.println();
		
		long startTime, stopTime;
		
// ------------------- Insert Sort
		// start the timer
		startTime = System.nanoTime();
		
		/*receive returning array from iSort, 
		 * if we want to iterate and test the results*/
		iSort.sort(l);

		// stop the timer
		stopTime = System.nanoTime();
		System.out.print("Insertion Sort: ");
		System.out.println(stopTime - startTime);

// ------------------- Selection Sort		
		// Selection Sort timing test
		startTime = System.nanoTime();
		
		/*receive returning array from iSort, 
		 * if we want to iterate and test the results*/
		sSort.sort(l);
		
		// stop the timer
		stopTime = System.nanoTime();
		System.out.print("Selection Sort: ");
		System.out.println(stopTime - startTime);

// validate array is sorted -- not needed at this time
		/*assertTrue(l.length==k.length);
		for(int i=1;i<k.length;i++){
			assertTrue(k[i-1]<=k[i]);
		}*/
	}

}
