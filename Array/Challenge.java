package Array;

public class Challenge {

    //Will be used as review for arrays then problems will be solved through paper 

    //1) Accessing array using void method 

    public static void accessArr(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
    }

    public static String[] word(String[] greetArr) {
        String[] result = new String[greetArr.length]; //create a new variable for the parameter to be stored
        for(int start = 0; start < greetArr.length; start++) {
            System.out.print(greetArr[start] + " "); 
        }
        return result; 
    }

    //Written notebook test

    public static void Array(int[] arr) {
        for(int begin = 0; begin < arr.length; begin++) {
            System.out.print(arr[begin] + " "); 
        }
    }

    public static char[] letter(char[] alpha) {
        char[] r = new char[alpha.length]; 
        for(int a = 0; a < alpha.length; a++) {
            System.out.print(alpha[a] + " "); 
        }

        return r; 
    }
    
    public static void main(String[] args) {
        accessArr(new int[]{1,2,3,4});
        word(new String[]{"Hello", "World"}); 
        Array(new int[]{7,8,9});
        letter(new char[]{'a', 'b', 'c'}); 
    }

    
}
