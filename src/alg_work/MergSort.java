package alg_work;

public class MergSort {
	
	public int[] mergSort(int[] source){
		if(source.length == 1){
			return source;
		}

		// divide
		int p, q, s;
		int[] a1 = new int [source.length / 2];
		int[] a2 = new int [a1.length];
		
		p = 0;
		q = source.length / 2;
		s = source.length;
		
		for(int i=0, j=q; i<q;i++,j++){
			a1[i]=source[i];
			a2[i]=source[j];
		}
		
		// recursive call
		a1 = mergSort(a1);
		a2 = mergSort(a2);
		
		
		// return merged result
		return merge(a1,a2);
	}
	
	private int[] merge(int[] a1, int[] a2){
		int[] c = new int[a1.length+a2.length];
		int i=0;
		int j=0;
		int k=0;
		
		// sort and merge into single array
		while(i<a1.length && j<a2.length){
			if(a1[i]<a2[j]){
				c[k] = a1[i];
				i++;
			}else{
				c[k] = a2[j];
				j++;
			}
			k++;
		}
		
		// clean up: load the remaining values into final array (c).
		while(i<a1.length){
			c[k] = a1[i];
			i++; k++;
		}
		while(j<a2.length){
			c[k] = a2[j];
			j++;k++;
		}
		
		// return final merged array
		return c;
	}
	
	public static void main (String[] args){
		MergSort m = new MergSort();
		int[] list = {9,8,4,3,9,6,1,2};
		int[] newList = new int[list.length];
		
		for(int i =0; i<list.length;i++){
			System.out.print(list[i]);
		}
		System.out.println();
		
		newList = m.mergSort(list);
		
		for(int i =0; i<newList.length;i++){
			System.out.print(newList[i]);
		}
		
	}

}
