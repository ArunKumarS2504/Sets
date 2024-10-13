package ArrayProblems;

public class MaxMin {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,2,4,7,7,4};
		int max = arr[0];		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Max element is" + max);
		
		int min = arr[0];
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element was :"+ min);
	}


}
