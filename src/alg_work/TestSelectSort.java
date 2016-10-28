package alg_work;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSelectSort {

	private SelSort sort = new SelSort();
	
	@Test
	public void testSort_1() {
		
		int[] l = {8,2,6,9,13,5,32,22,5,19};
		
		// start timer
		int[] k = sort.sort(l);
		// stop timer
		
		assertTrue(l.length==k.length);
		
		for(int i=1;i<k.length;i++){
			assertTrue(k[i-1]<=k[i]);
			//System.out.print(k[i] + " ");
		}
	}
	
	@Test
	public void testSort_2() {
		int[] l = {8,2,6,9,13,5,32,22,5,19,52,58,51,42,44,49,48,29,24,20,27,15,4,17,19,12};
		// start timer
		int[] k = sort.sort(l);
		// stop timer
		assertTrue(l.length==k.length);
		
		for(int i=1;i<k.length;i++){
			assertTrue(k[i-1]<=k[i]);
			//System.out.print(k[i] + " ");
		}
	}

}
