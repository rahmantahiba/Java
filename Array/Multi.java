package Array;

public class Multi {
    public static void main(String[] args) {

        //Creating multidimensional array 
        int arr[][] = {{1,2,3}, {2,4,5}, {4,4,5}}; 
        //Accessing the array
        for(int first = 0; first < 3; first++) { //The 3 is the amount of elements
            for(int second = 0; second < 3; second++) {
                System.out.print(arr[first][second] + " "); 
            }

            System.out.println(); 

        }
    }
    
}
