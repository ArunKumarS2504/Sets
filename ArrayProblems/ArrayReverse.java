package ArrayProblems;

public class ArrayReverse {
	
	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6};
			int j = arr.length-1;
			int i=0;
			while(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			System.out.println("Reversed array : " + arr );
	}

}
