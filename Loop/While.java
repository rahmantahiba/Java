package Loop;

import java.util.Scanner;

public class While {

    //This file will start the lesson while loops 

    public void num() {
        int i = 0; 
        while(i <= 10) {
            System.out.println(i); 
            i++;
        }
    }

    //Unlike while and for loop the "do while loop" the condition is checked at the end.

    public void doWhile() {

        int i = 1; 
        do {
            System.out.println(i); 
            i++; 

        } while(i <= 10); 
    }

    //Print the first 10 integers and their squares using do while loop

    public void intTen() {
        int s = 1; 
        do {
            System.out.println(Math.pow(s, 2)); 
            s++; 
        } while(s <= 10); 

    
    }   

    //Create a do-while loop that distinguishes between odd and even numbers

    public void oddEven() {
        int initial = 1; 
        do {
            if(initial % 2 == 0) {
                System.out.println(initial + "\t" + "Even"); 
            } else {
                System.out.println(initial + "\t" + "Odd"); 
            }

            initial++; 

        } while(initial <= 10); 
           
    }

    //Create a times table using while loop using scanner

    public void multiple(int m) {
        int begin = 1; 
        do {
            System.out.println(begin * m); 
            begin++; 

        } while(begin <= 10); 
    }

    public static void main(String[] args) {
        While obj = new While(); 
        obj.num();
        obj.doWhile();
        obj.intTen();
        obj.oddEven();
        Scanner multiply = new Scanner(System.in); 
        int m; 
        System.out.print("Enter the number for multiplication to occur: "); 
        m = multiply.nextInt(); 
        obj.multiple(m);

        multiply.close();
    }
    
}
