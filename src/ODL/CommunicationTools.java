package ODL;

import java.util.Scanner;

public class CommunicationTools {
	Scanner sc=new Scanner(System.in);

    void comm() throws Exception {
    	System.out.println("Hello..! I'm Here to Communicate with you");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("---------------------------------------------------------");
    	System.out.println("please Enter your Name");
    	String Name=sc.next();
    	System.out.println(Name);
    	System.out.println("please Enter your Emailid");
    	String email=sc.next();
    	System.out.println(email);
    	System.out.println("please Enter your Query");
    	String Query=sc.next();
    	System.out.println(Query);
    	System.out.println("We will Communicate to you with resolution.\nPlease Check your Mail for Further Assistance");
    	System.out.println("--------------------------------------------------------");
    	
	    
	
    System.out.println("Enter 1 for Main Menu");
    System.out.println("Enter any Key to Exit");
    int choice=sc.nextInt();
    if(choice==1) {
    	Reg reg=new Reg();
    	reg.home();
    }
    if(choice>=1){
    System.out.println("Thank you....!");
   
}}}
