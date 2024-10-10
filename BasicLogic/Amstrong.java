package BasicLogic;

 class Amstrong {
	 
	 public int number(int n ) {
		 
		 int rem=n%10;
		 int cube = n/10;
		 int temp = rem*rem*rem+cube; 
		 
		 return temp;
	 }
	public static void main(String[] args) {
		Amstrong as  = new Amstrong();
		int n = 153;
		int ans = as.number(n);
		System.out.println(ans);
	}

}
