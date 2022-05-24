package Conditions;

import java.util.Scanner;

public class Input {

    public static void integer(int num) {

            if(num > 0) {
                System.out.println("POSITIVE"); 
           } else if(num < 0) {
                System.out.println("NEGATIVE");
           } else {
                System.out.println("ZERO"); 
           }
                
            
        }
        
      
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);  
        int num;
        System.out.println("Enter number: ");
        num = object.nextInt(); 
        integer(num); 
    
        object.close();
    
        
    }


    
}
