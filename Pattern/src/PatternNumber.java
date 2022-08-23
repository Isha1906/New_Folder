//Program to Print a number pattern 
public class PatternNumber {           //class name NumberPattern

	public static void main(String[] args) {    //main() class
		
		int rows=6;                    //Initializing and Declaring 5 rows in pattern
		
		for(int i=1;i<=rows;i++)        //Outer loop
		{
			for(int j=1;j<=i;j++)       //Inner Loop for first half of values
			{
				System.out.print(j+" ");    //Printing first half values
			}
			for(int j=i-1;j>=1;j--)         //Inner Loop for second half of values
			{
				System.out.print(j+" ");     //Printing first second values
			}
			System.out.println();            //taking a line break
		}

	}}
