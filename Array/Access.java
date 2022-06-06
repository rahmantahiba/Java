package Array;

public class Access {

    public static void main(String[] args) {

        //Accessing the arrays with for loop 

        double[] arr = {10.0, 11.0, 12.0}; 
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }

        //Accessing array using for each loop 

        int[] arrays = {10, 20, 30, 40, 50}; 

        for(int element : arrays) { //element is an initalizing value
            System.out.print(element + " "); 
        }
    }
    
}
