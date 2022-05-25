import java.util.Scanner;

//Practicing using scanner 

public class Calculator {

    public static void calculating(char sign, int a, int b) { 
        if(sign == '+') {
            System.out.println(a + b); 

        }else if (sign == '-') {
            System.out.println(a - b); 

        }else if (sign == '/') {
            System.out.println(a / b); 

        }else if (sign == '*') {
            System.out.println(a * b); 

        } else {
            System.out.println("Please use the correct operator for the calculation"); 
        }   
    }
    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in); 

        char sign; 
        int a; 
        int b; 

        System.out.print("Enter operator: "); 
        sign = cal.next().charAt(0); 

        System.out.print("Enter first number: "); 
        a = cal.nextInt(); 

        System.out.print("Enter second number: "); 
        b = cal.nextInt(); 
        
        calculating(sign, a, b);

        cal.close();

    }
    
}
