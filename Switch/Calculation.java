package Switch;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner calculate = new Scanner(System.in); 
        System.out.print("Enter operator: "); 
        char operator = calculate.next().charAt(0);
        System.out.print("Enter first number: ");
        int first = calculate.nextInt(); 
        System.out.print("Enter second number: "); 
        int second = calculate.nextInt(); 

        int result = 0; 

        switch(operator) {
            case '+': result = first + second; 
            break; 
            case '-': result = first - second; 
            break; 
            case '/': result = first / second; 
            break; 
            case '*': result = first * second; 
            break; 
        }

        System.out.println("The result is: \n " + first + operator + second + '=' + result); 

        calculate.close();

        
    }
    
}
