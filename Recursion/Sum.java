package Recursion;

public class Sum {

    public static int sum(int k) {
        //base case 
        if(k > 0) {
            return k + sum(k - 1); //calling the function
        } else {
            return 0; 

        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result); 
    }
    
}
