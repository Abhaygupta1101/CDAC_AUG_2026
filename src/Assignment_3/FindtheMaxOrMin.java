package Assignment_3;

public class FindtheMaxOrMin {

	public static int[] findMaxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max =arr[i];
			if(arr[i]<min)
				min= arr[i];
		}
		
	
	return new int[] {max,min};
}
}