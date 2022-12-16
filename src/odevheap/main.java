package odevheap;

import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("girdi:");
		String girdi = scanner.nextLine();
			
		System.out.println("girdi:" + girdi);
			
		String[] words = girdi.split(",");
		int [] dizi = new int [words.length];
		for(int i=0;i<words.length;i++) {
			dizi[i]=Integer.valueOf(words[i]);
			System.out.print(dizi[i]);
				
			}
			
		minmi(dizi);
		
		
			
		}
		
	public static void minmi(int[] arr) {
		

		for(int m=0;m<(arr.length)-1;m++) {
			if(arr[m]<arr[m+1]) {
				System.out.println("minheap");
				break;

				
			}
			
			else {
				System.out.println("min heap değil");
				heapsort ob = new heapsort();
		        ob.sort(arr);
		        
		  
		        System.out.println("3lü min heap hali");
		        printArray(arr);
				
			}
	}
		
			
		}

	private static void printArray(int[] arr) {
		 int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
		
	}	
		}
	
		
     
	
