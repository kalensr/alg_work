package alg_work;

import java.io.File;
import alg_work.Util;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class InversionCount2 {
	
	long merge(int[] arr, int[] left, int[] right) {
	    int i = 0, j = 0, count = 0;
	    while (i < left.length || j < right.length) {
	        if (i == left.length) {
	            arr[i+j] = right[j];
	            j++;
	        } else if (j == right.length) {
	            arr[i+j] = left[i];
	            i++;
	        } else if (left[i] <= right[j]) {
	            arr[i+j] = left[i];
	            i++;                
	        } else {
	            arr[i+j] = right[j];
	            count += left.length-i;
	            j++;
	        }
	    }
	    return count;
	}

	long invCount(int[] arr) {
	    if (arr.length < 2)
	        return 0;

	    int m = (arr.length + 1) / 2;
	    int left[] = Arrays.copyOfRange(arr, 0, m);
	    int right[] = Arrays.copyOfRange(arr, m, arr.length);

	    return invCount(left) + invCount(right) + merge(arr, left, right);
	}
	
	
	public static void main (String[] args){
		InversionCount2 m = new InversionCount2();
		//int[] newList = m.getArrayFromFile();
		int[] newList = Util.getArrayFromFile("src/alg_work/data/IntegerArray.txt");
		
		long invCnt = m.invCount(newList);
		
		System.out.println("size of list:" + newList.length);
		System.out.println();
		System.out.println(invCnt);
	}

}
