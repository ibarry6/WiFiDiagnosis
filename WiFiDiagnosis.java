import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Class: CMSC203
		 * Instructor: Prof. Ahmed
		 * Description: I am building an program that will show some steps through to 
		 * restore interned connectivity.
		 * I pledge that I have completed the programming assignement indepedently.
		 * I have not copied the code from a student or any source.
		 * I have not given my code to any student.
		 * Printing my name: Iburahima Barry
		 */
		// Introducing the scanner
		 Scanner sc= new Scanner(System.in);
		 
		 // Printing the Title of the project
		
		System.out.println("If you have a problem with internet connectivity, this Wifi");
		System.out.println("Diagnosis might work.");
		  
		  
	       System.out.println("First step: Rebot your computer");
	      
	       System.out.println("Are you able to connect with the internet(yes or no ");
	       String enter = sc.nextLine();
	      
	       // Using the if statement to start the condiction first
	       if(enter.equals("no"))
	       {
	    	   System.out.println("Second step: Reboot your computer.");
	    	   System.out.println("Now are you able to connet with the internet");
	    	   enter = sc.nextLine();
	    	   // Using the second if statement to start the second condiction
	      
	    	   if(enter.equals("no")) 
	    	   {
	    	       System.out.println(" Third step: Make sure the cables the cable to you router are plugged in");
	    	   	   System.out.println("firmly and you router is getting power");
		           System.out.println("Now are you able to connect wnoith the internet(yes or no ");
		           enter = sc.nextLine();
		           // Using the if statement to start the third condition 

			       if(enter.equals("no"))
			       {
			    	   System.out.println(" Four step: Move you computer closer to your router.");
			      	   System.out.println("Now are you able to connect with the internet(yes or no) ");
			    	   enter = sc.nextLine();
          //Using the if fourth if statement to make the last if condiction
				       if(enter.equals("no"))
				       {
				    	   System.out.println("Fift step: contact your ISP");
				    	   System.out.println("Make sure your ISP is hooked up to you router.");

				       } else {
				    	   /* yes */
				       }
			       } else {
			    	   /* yes */
			       }
	    	   
	    	   } else {
	    		   System.out.println("Checking the router seemed to work");
	    	   }
	    	      
	      
	       } /* first question
	       If the user enter yes the first print this statement 
	        */
	       else {
	    	   System.out.println("Rooboting your computer seemed to work");
	    	   /* yes */
	       }
	   }
	}
	
