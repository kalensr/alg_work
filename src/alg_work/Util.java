package alg_work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {

	public static int[] getArrayFromFile(String filename){
		Scanner scanner = null;
		try {
			// scanner = new Scanner(new File("IntegerArray.txt"));
			scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int [] arr = new int [100000];
		int i = 0;
		while(scanner.hasNextInt()){
		   arr[i++] = scanner.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
