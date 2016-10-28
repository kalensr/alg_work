package alg_work;
public class SelSort {
	
	/* selectSort
	 * Input: array of int's
	 * Output: sorted ascending, array of int's
	 * 
	 */
	int[] sort(int[] k) {

		int swap = 0;
		for(int i = 0;i<k.length;i++){
			for(int j = i; j< k.length;j++){
				if(k[j]<k[i]){
					swap = k[i];
					k[i]=k[j];
					k[j]=swap;
				}
			}
		}
		return k;
	}
}
