import java.util.Scanner;

class nested_If{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
			
		int age;
		String license;	
		
		System.out.print("enter you age:");
		age=scan.nextInt();
	
		
			
		if(age>=20){
			System.out.print("Do you have license ?:");
			license=scan.next();
			if(license.equalsIgnoreCase("yes")){
				System.out.println("you are elgible to drive");
			}else if(license.equalsIgnoreCase("no")){
				System.out.println("You are old enough, but you need a driving license");
			}else{
			System.out.println("INVALID");
			}
		}else{
			System.out.println("You are not old enough to drive.");
		}		
	}
}