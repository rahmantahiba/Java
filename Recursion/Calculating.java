package Recursion;

import java.util.Scanner;

public class Calculating {

    //Objective: Create a calculator using recursion 

    public static String num(String sign, double a, double b, double operation) {

        if(sign == "+") {
            operation = a + b; 
            return num(sign, a, b, operation); 

        } else if(sign == "-") {
            operation = a - b;
            return num(sign, a, b, operation); 

        } else if(sign == "/") {
            operation = a/b; 
            return num(sign, a, b, operation);

        } else if(sign == "*") {
            operation = a*b; 
            return num(sign,a,b,operation);

        } else {
            return "Enter the right sign";
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); 
        double a;
        double b;
        double operation; 
        String sign; 
        System.out.println("Enter the sign: ");
        sign = obj.nextLine(); 
        System.out.println("Enter the first number: "); 
        a = obj.nextDouble();
        System.out.println("Enter the second number: ");
        b = obj.nextDouble();
        System.out.println("The answer is: ");
        operation = obj.nextDouble(); 
        num(sign, a, b, operation); 

        obj.close();
    }
    
}
