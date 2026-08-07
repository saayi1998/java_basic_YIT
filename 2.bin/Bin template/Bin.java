import java.util.Scanner;

class Bin{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int[] marks=new int[5];
		int total=0;
		
		for(int i=0;i<marks.length;i++){
			System.out.print("Enter marks for subject "+(i+1)+":");
			marks[i]=scan.nextInt();
			total+=marks[i];
		}
		double average= total/(double)marks.length;
		
		System.out.println("total marks: "+total);
		System.out.println("Average: "+average);
	}
}