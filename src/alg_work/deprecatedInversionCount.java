package alg_work;
//package alg_work;
//
//public class InversionCount {
//	
//	public int sortNCount(int[] array){
//		if(array.length == 1){
//			return 0;
//		}
//
//		// divide
//		int p, q, s;
//		int[] a1 = new int [array.length / 2];
//		int[] a2 = new int [a1.length];
//		int cntLeft = 0;
//		int cntRight = 0;
//		int cntSplit = 0;
//		int minCnt = 0;
//		
//		p = 0;
//		q = array.length / 2;
//		s = array.length;
//		
//		for(int i=0, j=q; i<q;i++,j++){
//			a1[i]=array[i];
//			a2[i]=array[j];
//		}
//		
//		// recursive call
//		cntLeft = sortNCount(a1);
//		cntRight = sortNCount(a2); 
////		minCnt = minInv(cntLeft, cntRight);
////		cntSplit = countSplitInversion(a1,a2, minInv);
////		
//		// return merged result
//		return cntLeft + cntRight + cntSplit;
//	}
//	
//	private int countSplitInversion(int[] a1, int[] a2){
//		int[] c = new int[a1.length+a2.length];
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		// sort and merge into single array
//		while(i<a1.length && j<a2.length){
//			if(a1[i]<a2[j]){
//				c[k] = a1[i];
//				i++;
//			}else{
//				c[k] = a2[j];
//				j++;
//			}
//			k++;
//		}
//		
//		// clean up: load the remaining values into final array (c).
//		while(i<a1.length){
//			c[k] = a1[i];
//			i++; k++;
//		}
//		while(j<a2.length){
//			c[k] = a2[j];
//			j++;k++;
//		}
//		
//		// return final merged array
//		return c;
//	}
//	
//	public static void main (String[] args){
//		InversionCount m = new InversionCount();
//		int[] list = {9,8,4,3,9,6,1,2};
//		int[] newList = new int[list.length];
//		
//		for(int i =0; i<list.length;i++){
//			System.out.print(list[i]);
//		}
//		System.out.println();
//		
//		newList = m.sortNCount(list);
//		
//		for(int i =0; i<newList.length;i++){
//			System.out.print(newList[i]);
//		}
//		
//	}
//
//}
