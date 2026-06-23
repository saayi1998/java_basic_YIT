class conditionalstatement {
	public static void main (String args[]){
		if (true) {
			System.out.println("this true statement");
		}
		if (false) {
			System.out.println("this true statement");
		}
		
		int x = 7;
		
		if (x>5){
			System.out.println("x is greater than 5");
		}
		else if (x<5){
			System.out.println("x is less than 5");
		}
	}
}