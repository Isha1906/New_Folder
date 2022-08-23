//Program to print array elements using FOR-EACH LOOP

public class Fruits {           //class name Fruits

	public static void main(String[] args) {    //main() class
		
		//Initializing and Declaring Array of type String with Array_name "Fruits"  
		
		String[] fruits= {"Banana","Cherry","Apple"
				          ,"Orange","Grapes"};
		
		System.out.println("Elements in the array - ");
		
		for(String i:fruits)     //Using For-each loop to print Array elements
		{
	       
	     System.out.println("'"+i+"'");    //printing Array elements
		 
		}                          //END-OF-FOR-EACH-LOOP

	}

}                                 //END-OF-PROGRAM
