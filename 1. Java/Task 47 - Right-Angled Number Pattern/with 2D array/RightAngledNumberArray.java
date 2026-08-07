class RightAngledNumberArray{
	public static void main(String args[]){
		int [][]rows = new int [5][];
		
		for(int i=0;i<=rows.length;i++){
			for (int j=0;j<=i+1;j++){
				System.out.print(j);
				if(j<=i){
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}