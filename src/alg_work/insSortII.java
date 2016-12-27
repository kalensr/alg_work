package alg_work;

public class insSortII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsSort iSort = new InsSort();
		
		int[] list = new int[]{5,3,9,5,8,2,6,7};
		
		//int[] sorted = iSort.sort(list);
		for(int i = 0;i<list.length;i++){
			System.out.print(list[i] + " ");
		}
		for (int i=1; i<list.length;i++){
		
			for(int j= i;j>0 && list[j] <= list[j -1];j--){
				int t = list[j-1];
				list[j-1]=list[j];
				list[j] = t;
			}
			
		}
		
		System.out.println();
		for(int i = 0;i<list.length;i++){
			System.out.print(list[i] + " ");
		}
		
		list = iSort.sort(list);

		System.out.println();
		for(int i = 0;i<list.length;i++){
			System.out.print(list[i] + " ");
		}
		
		
	}

}
