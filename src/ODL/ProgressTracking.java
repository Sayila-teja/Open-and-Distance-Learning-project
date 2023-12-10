package ODL;

import java.util.Scanner;

public class ProgressTracking  {
	
	Scanner sc = new Scanner(System.in);
	void Prog() throws Exception {
		int Count = 0;
		System.out.println("------------------------------------------------");
		System.out.println("Have you Learned Introduction of Programming ?\nEnter '1' for yes\t  Enter '2' for No");
	     	
			int op=sc.nextInt();
			if(op==1) {
				Count=Count+1;
			}
			System.out.println("Have you Learned History of Programming ?\nEnter '1' for yes\t  Enter '2' for No");
			
			int op1=sc.nextInt();
			if(op1==1) {
				Count=Count+1;
			}
			System.out.println("Have you Learned Inputs and outputs ?\nEnter '1' for yes\t  Enter '2' for No");
			     
				int op2=sc.nextInt();
				if(op2==1) {
					Count=Count+1;
				}
			
			System.out.println("Have you Learned Operators of Programming ?\nEnter '1' for yes\t  Enter '2' for No");
			
			  int op3=sc.nextInt();
		    	if(op3==1) {
				Count=Count+1;
			}
			
			switch (Count){
			case 1:
				System.out.println("You Completed 25% of Course");
				break;
			case 2:
				System.out.println("You Completed 50% of Course");
				break;
			case 3:
				System.out.println("You Completed 75% of Course");
				break;
			case 4:
				System.out.println("You Completed 100% of Course");
				break;
			default:
				System.out.println("Invalid Input");
}   
			System.out.println("Enter 1 for Main Menu");
			System.out.println("Enter Any Key to Exit");

   
		
	int choice=sc.nextInt();
	   if(choice==1) {
				Reg reg=new Reg();
				reg.home();
	   }
	   else {
	   System.out.println("Thank you....!");
	   
	
	}}}
	

//    public void ProgressTracking1() {
//        Scanner sc = new Scanner(System.in);
//        int percentage = 0;
//        int topic = 1;
//
//        while (topic <= 5) {
//            System.out.println("Enter topic number");
//            int change = sc.nextInt();
//
//            switch (change) {
//                case 1: {
//                    System.out.println("Introduction to Python programming");
//                    percentage += 20;
//                    break;
//                }
//                case 2: {
//                    System.out.println("History of python");
//                    percentage += 20;
//                    break;
//                }
//                case 3: {
//                    System.out.println("Inputs and outputs");
//                    percentage += 20;
//                    break;
//                }
//                case 4: {
//                    System.out.println("Operators");
//                    percentage += 20;
//                    break;
//                }
//                case 5: {
//                    System.out.println("Basic programs exercise");
//                    percentage += 20;
//                    break;
//                }
//                default: {
//                    System.out.println("Course completed");
//                }
//            }
//
//            System.out.println("Current completion percentage: " + percentage + "%");
//            topic += 1;
//        }
//        
//        // Close the scanner to prevent resource leak
//        sc.close();
//    }
//}

