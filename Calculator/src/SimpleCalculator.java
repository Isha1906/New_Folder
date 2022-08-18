//Program to perform calculation on two number(+,-,*,/)
import java.util.Scanner;    //Importing Scanner class for taking input from user

class SimpleCalculator {
  public static void main(String[] args) {

    String choice;                           //initializing values 
    int num1, num2, result;

         // create an object of Scanner class
    Scanner r = new Scanner(System.in);

    
         // asking users to enter numbers
    System.out.println("Enter first number:");
    num1 = r.nextInt();

    System.out.println("Enter second number:");
    num2 = r.nextInt();
    
         // asking users to enter operator
    System.out.println("Choose an operator: +, -, *, or /:");
    choice = r.next();

    switch (choice) {         
      case "+":                               // performs addition between numbers
        result = num1 + num2;
        System.out.println("Sum:"+result);
        break;

    
      case "-":                                  // performs subtraction between numbers
        result = num1 - num2;
        System.out.println("Difference:"+result);
        break;

     
      case "*":                                   // performs multiplication between numbers
        result = num1 * num2;
        System.out.println("Product:"+result);
        break;

      
      case "/":                                   // performs division between numbers
        result = num1 / num2;
        System.out.println("Quotient:"+result);
        break;

      default:
        System.out.println("Entered wrong operator!!!!");
        break;
    }

    
  }
}
