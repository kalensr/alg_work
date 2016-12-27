package alg_work;


public class QuickSortLast {

	private int count = 0;
	public int getCount(){
		return this.count;
	}
	
	private void printArr(int [] arr){
		System.out.println();
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	private int[] sort(int[] arr, int left, int right){
		
		if(left>right){
			return arr;
		}
		
		this.count += arr.length - 1;
		
		int m = right;
		for(int i = right-1; i>=left; i--){
			/*Invariant: arr[left + 1... m < arr[left] && arr[p+1 .. right] >= arr[left]]  */
			if(arr[i] > arr[right]){
				// swap
				int t = arr[i];
				arr[i] = arr[--m];
				arr[m] = t;
			}
		}
		// swap
		int t = arr[m];
		arr[m] = arr[right];
		arr[right] = t;
		
		sort(arr, left, m-1);
		sort(arr, m+1, right);
		
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,9,7,2,1};
		
		QuickSortLast q = new QuickSortLast();
		q.printArr(arr);
		
		q.printArr(q.sort(arr, 0, arr.length- 1));
		System.out.println("Comparison Count: " + q.getCount());

	}

}
