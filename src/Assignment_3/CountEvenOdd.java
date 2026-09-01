package Assignment_3;

public class CountEvenOdd {
 
	public static int[] countEvOd(int [] arr) {
		int even = 0;
		int odd = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++; 
				} else {
					odd++;
					}
			} 
		return new int[]{even, odd}; 
		}
	
	
		
	}


