package ODL;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class InteractiveLearning {
	Scanner sc = new Scanner(System.in);
	
		public void PythonLearn() throws Exception{
        System.out.println("Enter 1 for course structure");
        System.out.println("Enter 2 for Course Mock Test");
        System.out.println("Enter 3 for Online Compiler");
        System.out.println("Enter 4 for Main Menu");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            	Desktop desktop = java.awt.Desktop.getDesktop();
            	
  			    URI oURL1 = new URI("https://roadmap.sh/python");
  			    desktop.browse(oURL1);
                
                break;
            case 2:
               Desktop desktop1 = java.awt.Desktop.getDesktop();
            	
  			   URI oURL2 = new URI("https://www.w3schools.com/quiztest/quiztest.asp?qtest=PYTHON");
  			   desktop1.browse(oURL2);
                
                break;
            case 3:
               Desktop desktop2 = java.awt.Desktop.getDesktop();
            	
   			   URI oURL3 = new URI("https://www.programiz.com/python-programming/online-compiler/");
   			   desktop2.browse(oURL3);
                 break;
           case 4:
            	Reg reg=new Reg();
            	reg.home();
            default:
                System.out.println("Invalid Inputs");
                break;
        }
        PythonLearn();
    }     
		public void JavaScriptLearn() throws Exception {
	        System.out.println("Enter 1 for course structure");
	        System.out.println("Enter 2 for Course Mock Test");
	        System.out.println("Enter 3 for Online Compiler");
	        System.out.println("Enter 4 for Main Menu");
	        int choice = sc.nextInt();

	        switch (choice) {
	        case 1:
            	Desktop desktop = java.awt.Desktop.getDesktop();
            	
  			    URI oURL1 = new URI("https://roadmap.sh/javascript");
  			    desktop.browse(oURL1);                
                break;
            case 2:
               Desktop desktop1 = java.awt.Desktop.getDesktop();
            	
  			   URI oURL2 = new URI("https://www.w3schools.com/quiztest/quiztest.asp?qtest=JS");
  			   desktop1.browse(oURL2);                
                break;
            case 3:
               Desktop desktop2 = java.awt.Desktop.getDesktop();
            	
   			   URI oURL3 = new URI("https://www.programiz.com/javascript/online-compiler/");
   			   desktop2.browse(oURL3);               
                 break;
            case 4:
            	Reg reg=new Reg();
            	reg.home();
            default:
                System.out.println("Invalid Input");
                break;
                
	        }
	        JavaScriptLearn();
	    }
		public void JavaLearn() throws Exception {
	        System.out.println("Enter 1 for course structure");
	        System.out.println("Enter 2 for Course Mock Test");
	        System.out.println("Enter 3 for Online Compiler");
	        System.out.println("Enter 4 for Main Menu");
	        int choice = sc.nextInt();

	        switch (choice) {
	        case 1:
            	Desktop desktop = java.awt.Desktop.getDesktop();
            	
  			    URI oURL1 = new URI("https://roadmap.sh/java");
  			    desktop.browse(oURL1);
                
                break;
            case 2:
               Desktop desktop1 = java.awt.Desktop.getDesktop();
            	
  			   URI oURL2 = new URI("https://www.w3schools.com/quiztest/quiztest.asp?qtest=JAVA");
  			   desktop1.browse(oURL2);
                
                break;
            case 3:
               Desktop desktop2 = java.awt.Desktop.getDesktop();
            	
   			   URI oURL3 = new URI("https://www.programiz.com/java-programming/online-compiler/");
   			   desktop2.browse(oURL3);
                 
                 break;
           case 4:
            	Reg reg=new Reg();
            	reg.home();
            default:
                System.out.println("Invalid Input");
                break;
	        }
	        JavaLearn();
	    }
		public void cppLearn() throws Exception {
	        System.out.println("Enter 1 for Course Structure");
	        System.out.println("Enter 2 for Course Mock Test");
	        System.out.println("Enter 3 for Online Compiler");
	        System.out.println("Enter 4 for Main Menu");
	        int choice = sc.nextInt();

	        switch (choice) {
	        case 1:
            	Desktop desktop = java.awt.Desktop.getDesktop();
            	
  			    URI oURL1 = new URI("https://roadmap.sh/cpp");
  			    desktop.browse(oURL1);
                
                break;
            case 2:
               Desktop desktop1 = java.awt.Desktop.getDesktop();
            	
  			   URI oURL2 = new URI("https://www.w3schools.com/quiztest/quiztest.asp?qtest=CPP");
  			   desktop1.browse(oURL2);
                
                break;
            case 3:
               Desktop desktop2 = java.awt.Desktop.getDesktop();
            	
   			   URI oURL3 = new URI("https://www.programiz.com/cpp-programming/online-compiler/");
   			   desktop2.browse(oURL3);                
                 break;
            case 4:
            	Reg reg=new Reg();
            	reg.home();
            default:
                System.out.println("Invalid Input");
                break;
	        }
	        cppLearn();
		}
	
  
}



