package Return;

import java.util.Scanner;

public class Age {

    //Create conditions to see whether or not people are over 18 by using scanner and return statement

    public static int ageCheck(int a) {

        if(a >= 18) {
            System.out.println("Allowed!"); 

        } else {
            System.out.println("Not Allowed!"); 
        }

        return a; 
    }

    public static void main(String[] args) {

        Scanner preCheck = new Scanner(System.in); 
        int a; 
        System.out.print("Enter your age: "); 
        a = preCheck.nextInt(); 
        ageCheck(a); 

        preCheck.close();
    }
    
}
