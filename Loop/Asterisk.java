package Loop;

public class Asterisk {

    //Create pyramid using while loop 

    public static void star() {

       int i = 1; 
       while(i <= 5) {
        int j = 1; 
            while(j <= i) { //Get the length
                System.out.println("*"); 
                j++; 
        }
        
            System.out.println(); 
            i++; 

       }

         
    }
    public static void main(String[] args) {
        star();
    }
    
}
