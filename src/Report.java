import java.io.*;
import java.util.Scanner;
//import java.lang.Math;
public class Report {
	String pName, pID, pPWD, mName, mID, mPWD, cName,cID, cPWD;
	
	
	
	public Report(String aName, String aID, String aPWD) {
		
		this.pName= aName;
		this.pID= aID;
		this.pPWD= aPWD;
		
		this.mName= aName;
		this.mID= aID;
		this.mPWD= aPWD;
		
		this.cName= aName;
		this.cID= aID;
		this.cPWD= aPWD;
	}

	public String getpName(){
		return this.pName;
	}
	/*public String getpPWD(){
		return this.pPWD;
	}*/
	
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);

/*System.out.println("Enter your name, ID and password");
pName= sc.nextLine();
pID= sc.nextLine();
pPWD= sc.nextLine();*/
int a;
System.out.println("Click 1 to view report");
System.out.println("Click 2 to ask a query");


a= sc.nextInt();
    switch(a){
    case 1 : 
    	System.out.println("Generated Report->");
    	enquireReport();
    	break;
    case 2 :
    	System.out.println("Displayed Query->");
    	askQuery();
    	break;
    
    	
    default:
    	System.out.println("Invalid choice");
}
}
	public static void enquireReport()
	{  
		Scanner sc= new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("Enter the student name");
		String name= sc.nextLine();
		
		System.out.println("Enter the student ID");
		int sID= sc.nextInt();
		System.out.println("Enter the class of your ward");
		
		int cls= sc.nextInt();
		System.out.println("Enter the month of report: ");
		String ch="";
		ch= sc.next();
		//double random=Math.random();
		switch(ch)
		{
		case "January":
			//for class 1 students
			System.out.println("Following is your report: ***Report***");
			break;
		case "Feburary":
			//for class 2 students
			System.out.println("Following is your report:***Report***");
			break;
		case "March":
			//for class 1 students
			System.out.println("Following is your report:***Report***");
		    break;
		case "April":
			//for class 2 students
			System.out.println("Following is your report:***Report***");
            break;	
		case "May":
			//class 1 or 2
			System.out.println("Following is your report:***Report***");
			break;
		case "June":
			//for class 1 or 2 students
			System.out.println("Following is your report:***Report***");
            break;	
		case "July":
			//for class 1 or 2 students
			System.out.println("Following is your report:***Report***");
            break;	
		case "August":
			//for class 1 or 2 students
			System.out.println("Following is your report:***Report***");
            break;	
		case "September":
			//for class 1 or 2 students
			System.out.println("Following is your report:***Report***");
            break;	
		case "October":
			//for class 1 or 2 students
			System.out.println("Following is your report:***Report***");
            break;	
		
		case "November":
			//for class 1 or 2 students
			System.out.println("Sorry, we are closed because of Christmas holidays");
            break;	
		case "December":
			//for class 1 or 2 students
			System.out.println("Sorry, we are closed because of Christmas holidays");
            break;	
            
		}

}
	public static void askQuery(){
		System.out.println("Ask any question regarding your ward and we will contact you as sson as possible");
	}

	
}