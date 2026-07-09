class EvenOdd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int x =scan.nextInt();
		if(x=x/2%1){
		System.out.println("ODD");
		}else{
		System.out.println("EVEN");
		}
	}
}