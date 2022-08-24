//Program to Print second Largest Number in Array

import java.util.Arrays;                    //Importing UTIL package to use Arrays class

public class SecondLargest {                //class name SecondLargest

	public static void main(String[] args) {      //main() class
	
		//Initializing and declaring array of type Int with name "number"
		int[] number= {25,14,36,56,15,77,18,29,49};
	
		Arrays.sort(number);
		
		int sec_max = 0;
		
        for(int i=0;i<number.length;i++)                  //Using for loop to access array elements
        {
        	if(number[i]!=number[number.length-1])                
        	{
        		sec_max=number[i];                          //assigning matched array_elemnet value to sec_max
        		
        	 }
        }	
        
       System.out.println(sec_max+" is second largest number in the array");	  //Printing the Second largest number from array
	}

}              //END-OF-PROGRAM
