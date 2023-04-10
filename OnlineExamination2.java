package java1;

import java.util.Scanner;

public class OnlineExamination2 {
	
	
	Scanner sc = new Scanner(System.in);
    String username = "Satish";
    int password =5678;
    
    //login
    void login() {
    	
    	System.out.println("\tWELCOME TO THE ONLINE EXAM PORTAL!!!");
    	
    	//taking username
        System.out.print("Enter username:");
        username = sc.next();
        
        //taking user password
        System.out.print("Enter your password:");
        password = sc.nextInt();
        
        if (username.equals("Satish") && password ==5678) {
            System.out.println("Login Successful");
            menu();
        } else {
            System.out.println("Login failed, try again!!");
            login();
        }
    	
    }
    public void menu() {
		int Choice;
		System.out.println("===User Menu===");
		System.out.println("1.Update Profile \n 2.Write Exam \n 3.Exit ");
		System.out.println("Enter The Choice: ");
		Choice = sc.nextInt();
		switch(Choice) {
		case 1:
			Update_Details();
			break;
		case 2:
			examination();

			break;
		case 3:
			//closing session
            System.out.println("Thanks For Using!!!");
			System.exit(0);
			break;
		default:
			System.out.println("Enter valid choice.");
		}
	}
    
    
    //update profile and password
    public void Update_Details(){
		String update_name;
		int update_pwd;
		System.out.println("Update profile and password ");
		System.out.println("Enter The Username: ");
		update_name = sc.next();
		if(update_name.equals(username)) {
		System.out.println("Enter New Password for your Account");
		update_pwd = sc.nextInt();
		username = update_name;
		password=update_pwd;
		
		
        System.out.println("Updated Your Details Successfully....");
		}
		else {
			System.out.println("Enter The Correct UserName");
		}
		menu();
	}
    
    public void examination() {
    	
    	int ans;
    	int score=0;
    	long start_time=System.currentTimeMillis();
		long end_time=start_time+30;
    	
		
		//timer and auto submit
		while(System.currentTimeMillis()<end_time)
		{
    	System.out.println("You have 5 quetions and time limit is 5 minutes");
		System.out.println("");
		System.out.println("Each quetion for 5 marks and negative marking is there...");
		System.out.println("");
		
		System.out.println("****Now answer the following questions: ****");
		System.out.println();
		
		//selecting answers for MCQs
		//1
		System.out.println("Q1. In which process, a local variable has the same name as one of the instance variables?");
		System.out.println("1)Serialization"+"\t"+"2)Variable Shadowing"+"\t"+"3)Abstraction"+"\t"+"4)Multi-threading");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==2)
		{
			score=score+5;
		}
		else
		{
			score--;
		}
		
		System.out.println();
		
		//2.
		
		
		System.out.println("Q2. An interface with no fields or methods is known as a ______.");
		System.out.println("1)Runnable Interface"+"\t"+"2) Marker Interface"+"\t"+"3)Abstract Interface"+"\t"+"4)CharSequence Interface");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==2)
		{
			score=score+5;
		}
		else
		{
			score--;
		}
		
		System.out.println();
		
		
		//3.
		
		
		System.out.println("Q3. Output of Math.floor(3.6)?");
		System.out.println("1)3"+"\t"+"2) 3.0"+"\t"+"3)4"+"\t"+"4)4.0");
				
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
				
		if(ans==2)
		{
			score=score+5;
			}
		else
		{
			score--;
			}
		System.out.println();
		
		//4
		
		
		System.out.println("Q4. Exception created by try block is caught in which block");
		System.out.println("1)catch"+"\t"+"2)throw"+"\t"+"3)final"+"\t"+"4)none");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==1)
		{
			score=score+5;
		}
		else
		{
			score--;
		}
		
		System.out.println();
		
		
		//5
		
		
		System.out.println("Q5. Identify the incorrect Java feature.");
		System.out.println("1)Object oriented"+"\t"+"2)Use of pointers "+"\t"+"3)Dynamic"+"\t"+"4)Architectural neutral");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==2)
		{
			score=score+5;
		}
		else
		{
			score--;
		}
		
		break;
		}
		
		
		
		
		
		System.out.println();
		
		System.out.println("you have finished the Exam!!!");
		System.out.println();
		System.out.println("Congratulations!!!");
		System.out.println();
		System.out.println("*****your Score is "+""+score+"/25"+"*****");
		System.out.println();
		
		menu();
		
    
		
    }
    
    public static void main(String[] args) {

		OnlineExamination2 e1 =new OnlineExamination2();
		e1.login(); 
		

	}

}
