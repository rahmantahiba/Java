package Array;

public class Method {

    //Using the void type to print an array

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }

    //Printing an array using a return type through using a method
    public static int[] Array(int[] list) {

        int[] result = new int[list.length]; 
        for(int a = 0; a < list.length; a++) {
            System.out.print(list[a] + " "); 
        }

        return result;
    }

    public static void main(String[] args) {

        //Calling the array anonymously 
       printArr(new int[]{10,20,30});
       Array(new int[]{1,2,3,4}); 
    }
}
