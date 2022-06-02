package Loop;

import java.util.Scanner;

public class For {

    //For loop in one line the pattern has to be: initializing, condition, and increment

    public static void ten() {
        for(int n = 1; n <= 10; n++) {
            System.out.println(n); 
        }
    }

    //Nested for loops

    public static void nesting() {
        for(int i = 1; i <= 3; i++) {
            for(int k = 1; k <= 3; k++) {
                System.out.println(i + " " + k); 

            }
        
        }
    }

    //Print the first 10 integers and their squares using for loop

    public static void integer() {
        for(int n = 1; n <= 10; n++) {
            System.out.println(n + "\t" + Math.pow(n, 2)); 
        }
    }

    //Create a loop that distinguishes between odd and even numbers

    public static void distiguish() {
        for(int a = 1; a <= 10; a++) {
            if(a % 2 == 1) {
                System.out.println(a + "\t" + "Odd"); 
            } else {
                System.out.println(a + "\t" + "Even"); 
            }
        }
    }

    //Create a times table using for loop using scanner 

    public static void multiplication(int num) {
        for(int start = 1; start <= 10; start++) {
            System.out.println(start * num); 
        }
    }
    
    public static void main(String[] args) {
        ten();
        nesting();
        integer();
        distiguish();

        Scanner multiple = new Scanner(System.in); 
        int num; 
        System.out.print("Enter the number to conduct multiplication: "); 
        num = multiple.nextInt(); 
        multiplication(num);

        multiple.close();
    }
}
