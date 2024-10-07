package BasicLogic;

import java.util.Scanner;

public class Fibonaaci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		int n = 0 ,n1 = 1,n2;
		
			System.out.print(n+ " "+n1);
			
			for(int i=2;i<=c;i++) {
				n2 = n+n1;
				System.out.print(" "+n2);
				n = n1;
				n1 = n2;
			}
				
			s.close();
	}

}
