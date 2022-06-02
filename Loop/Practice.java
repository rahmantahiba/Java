package Loop;

import java.util.Scanner;

public class Practice {

    //Print the first 10 integers and their squares using while loop

    public void exponent() {
        int num = 1; 
        while(num <= 10) {
            System.out.println(Math.pow(num, 2)); 
            num++; 
    }

    }

    //Create a loop that distinguishes between odd and even numbers

    public void numeral() {
        int number = 1; 
        while(number <= 10) {
            if(number % 2 == 1) {
                System.out.println(number + " Odd"); 
            } else {
                System.out.println(number + " Even"); 
            }

            number++; 

        }

 
    }

    //Create a times table using while loop using scanner 

    public static void multiple(int m) {
        int n = 1; 
        while(n <= 10) {
            System.out.println(n * m); 
            n++; 
        }
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.exponent();
        obj.numeral();

        Scanner multiply = new Scanner(System.in); 
        int m; 
        System.out.print("Enter a number for multiplication to occur: "); 
        m = multiply.nextInt(); 
        multiple(m);

        multiply.close();
    }
    
}
