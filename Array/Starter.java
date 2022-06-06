public class Starter {
    public static void main(String[] args) {

        //arrays follow have indexes and it must be told which one needs to be acessed 
        int[] arr = {10, 20, 30, 40}; 
        System.out.println(arr[0]); 

        //Changing the element of an array

        int[] num = {2,4,6,8}; 
        num[0] = 1; 
        System.out.println(num[0]); //Instead of 2 the output is 1

        //The number of the integers found using the length method

        int[] number = {4,8,12,16}; 
        System.out.println(number.length); 

        //Using new to write the array size 

        int a[] = new int[5]; 
        a[0] = 10; 
        a[1] = 20;
        a[2] = 30;
        a[3] = 40; 
        a[4] = 50; 

        //Acessing the array 
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]); 
        }
    }
    
}
