package alg_work;

public class InsSort {

	public int[] sort(int[] k) {
		
		int t, i, j = 0;
		for (i = 1; i < k.length; i++) {
			t = k[i];
			for (j = i; j > 0 && k[j] < k[j - 1]; j--) {
				t = k[j];
				k[j] = k[j - 1];
				k[j - 1] = t;
			}
		}
		return k;

	}

}
