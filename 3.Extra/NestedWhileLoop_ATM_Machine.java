import java.util.Scanner;

class NestedWhileLoop_ATM_Machine{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
	
		System.out.println("ATM");
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("3.check balance");
		System.out.println("4.exit");
		
		System.out.println();
		
		int balance=10000;
		int damount;
		
		while (true){
			System.out.print("Enter your choice");
			int choice=scan.nextInt();
			
			if (choice==1){
				System.out.println("Enter Your Amount:");
				int damount=scan.nextInt();
					if(damount<balance
		
				
				
			}else if(choice==2){
				
			}else if(choice==3) {
			
			}else if(choice==4) {
			
			}else{
				System.out.println("INVALID TRY AGAIN");
				continue;
			}
			break;
		}
	}
}