package Anonymous;

public class Num {
    void number(int n) {
        int number = 2; 
       for(int i = 0; i >= 10; i++) {
        number = number + i; 
        }

        System.out.println("Result " + number); 
    }

    public static void main(String[] args) {
        new Num().number(5);
    }

    
}
