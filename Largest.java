import java.util.Scanner;

public class Largest {

    public static void conditional(int first, int second, int third) {
        if(first > second && first > third) {
            System.out.println("The greatest number is: " + first); 
        } else if(second > first && second > third) {
            System.out.println("The greatest number is: " + second); 
        } else if(third > first && third > second) {
            System.out.println("The greatest number is: " + third); 
        }
    }

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in); 
        int first; 
        int second; 
        int third; 
        System.out.print("Give first number: "); 
        first = object.nextInt(); 
        System.out.print("Give second number: "); 
        second = object.nextInt(); 
        System.out.print("Give third number: "); 
        third = object.nextInt(); 

        conditional(first, second, third);
        object.close();
        
    }
    
}
