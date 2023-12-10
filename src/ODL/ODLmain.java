package ODL;

import java.util.Scanner;

public class ODLmain {
	static Scanner sc=new Scanner(System.in);
  
	public static void main(String[] args) throws Exception {
		System.out.println("Enter 1 for Registration");
		System.out.println("Enter 2  to  Login");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Reg reg=new Reg();
			reg.registers();
			break;
		
		case 2:
			Log log=new Log();
			log.login();
			break;
			
		default:
			System.out.println("Thank you Visit Again");
		
		}

	}

}
