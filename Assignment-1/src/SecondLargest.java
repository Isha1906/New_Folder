//Program to Print second Largest Number in Array

import java.util.Arrays;                    //Importing UTIL package to use Arrays class

public class SecondLargest {                //class name SecondLargest

	public static void main(String[] args) {      //main() class
	
		//Initializing and declaring array of type Int with name "number"
		int[][] number= {{1,1},{2,2},{3,3}};
	int product=1;
		Arrays.sort(number);
		
		int sec_max = 0;
		
        for(int i=0;i<number.length;i++)                  //Using for loop to access array elements
        {
        	for(int j=0;j>number.length;j++)
        	{
        		product=product*number[i][j];     	}
        }	
        
       System.out.println(product+" is second largest number in the array");	  //Printing the Second largest number from array
	}

}              //END-OF-PROGRAM
