package in.gov.ind.ass08.array;

import java.util.Arrays;

public class Main3 {
	public static void main(String[] args) {
		int arr[] = { 10,30,56,87,10,1,5,2,6,13};
		
		Arrays.sort(arr);
		
		System.out.println("Minnimun value:: "+arr[0]);
		System.out.println("maximum value:: "+ arr[arr.length - 1]);		
	}	
}
