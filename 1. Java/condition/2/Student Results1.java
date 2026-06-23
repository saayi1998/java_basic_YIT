class studentresults1{
	public static void main (String args[]){
	     
		int marks = -1;
		
		if (100 <marks && marks >=50){
			System.out.println("PASS");
		}
		else if (0 >marks < 50){
			System.out.println("FAIL");
		}
		
		else if (marks <0){
			System.out.println("INVALID");	
		}
		
		else if (marks >=101){
			System.out.println("INVALID");	
		}
	}
}