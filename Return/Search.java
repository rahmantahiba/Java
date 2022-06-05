package Return;

import java.util.Scanner;

public class Search {
    
    //Objective: Find even and odd number using return statement by using scanner  

    public static int searchNum(int n) {

        if(n % 2 == 1) {
            System.out.println("Odd"); 
        } else {
            System.out.println("Even"); 

        }

        return n; 
    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in); 
        int n; 
        System.out.print("Enter a number to be either odd or even: "); 
        n = number.nextInt(); 
        searchNum(n); 

        number.close();
        
    }
}
