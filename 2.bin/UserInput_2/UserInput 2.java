import java.util.Scanner;

class UserInput{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		
		String fname,lname ="";
		System.out.println(" ");
		System.out.print("please enter your first name:");
		fname=scan.nextLine();
		System.out.println("Your First Name is:" + fname);
		
		System.out.println(" ");
		
		System.out.print("please enter your Last name:");
		lname=scan.nextLine();
		System.out.println("Your Name is:" + lname);
		
		System.out.println(" ");
		
		System.out.println("Your Last name is:"+fname+""
		+lname);
		
		System.out.println(" ");
		System.out.println("+++++++++++++");
		System.out.println(" ");
		
		int maths =0;
		int science =0;
		int total=0;
		double average=0;
		
		System.out.print("please enter your Maths marks:");
		maths=scan.nextInt();
		System.out.println("Your Maths Marks is:" + maths);
		
		System.out.println(" ");
		
		System.out.print("please enter your Science marks:");
		science=scan.nextInt();
		System.out.println("Your Science marks is:" + science);
		
		System.out.println(" ");
		
		total=maths+science;
		System.out.println("Your Total marks is:" +total);
		
		average=total/2;
		System.out.println("Your Average marks is:" +average);
		
		
	}

}

//your first name: Saai
//your last name: Kumar

//Full Name: Saai Kumar
//********************
//your Maths marks: 80
//your Science marks: 75

//Total Marks: 155
//Average Marks: 77.5
