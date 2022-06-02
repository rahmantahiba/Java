import java.util.Scanner;

public class Selection {

    //Find positive and negative number using scanner 

    public static char findNum(int n) {

        char sign = '/'; //initializing

        if(n > 0) {
            sign = '+'; 
            System.out.println(sign); 

        } else if(n < 0) {
            sign = '-'; 
            System.out.println(sign);

        } else {
            sign = '0';  
            System.out.println(sign);
        }

        return sign; 

    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); 
        int n;  
        System.out.print("Enter a number: "); 
        n = obj.nextInt(); 
        findNum(n); 

        obj.close();
    }
    
}
