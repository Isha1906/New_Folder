/*Program to Split Entire Class(Based-on Students Roll No.) into Four Groups
( Sapphire, Perl, Ruby and Emerald) for Sports Competition. */
import java.util.Scanner;
public class SportsCompetition {                 //class_name-"SportsCompetition"

	public static void main(String[] args) {    //main() class
	Scanner r=new Scanner(System.in);
	int roll_no;
	
	System.out.print("Enter Your Roll Number:");     //Asking user to enter his/her roll_number    
	roll_no=r.nextInt();
	
	// Checking students roll number using If Condition
	if(roll_no==1 ||roll_no==5 ||roll_no==9 ||roll_no==13 ||roll_no==17 ||roll_no==21)        //Checking whether roll_number belongs to(1, 5, 9, 13, 17, 21) 
	{
		System.out.print("--You Are in Sapphire Group--");  	                               //Assigning group According to there roll_number
	}
	else if(roll_no==2 ||roll_no==6 ||roll_no==10 ||roll_no==14 ||roll_no==18 ||roll_no==22)   //Checking whether roll_number belongs to(2, 6, 10, 14, 18, 22 )
	{
		System.out.print("--You Are in Perl Group--");                                          //Assigning group According to there roll_number
	}
	else if(roll_no==3 ||roll_no==7 ||roll_no==11 ||roll_no==15 ||roll_no==19 ||roll_no==23)     //Checking whether roll_number belongs to(3, 7, 11, 15, 19, 23)
	{
		System.out.print("--You Are in Ruby Group--");                                            //Assigning group According to there roll_number
	}
	else if(roll_no==4 ||roll_no==8 ||roll_no==12 ||roll_no==16 ||roll_no==20 ||roll_no==24)     //Checking whether roll_number belongs to(4, 8, 12, 16, 20, 24)
	{
		System.out.print("--You Are in Emerald Group--");                                             //Assigning group According to there roll_number
	}
	else System.out.println(" You Entered wrong Roll number!!!!");                                //Giving Student/User warning that he/she entered wrong roll_number
	}

}
