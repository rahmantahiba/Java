public class VStatements {

    //The condition goes inside the if-statement like Python 

    public static void Age() {
        int age = 17; 
        if(age > 18) {
            System.out.println("Allowed!"); 
        } else {
            System.out.println("Not allowed!"); 
        }
    }

    public void testNumber() {
        int evenN = 20; 
        if(evenN % 2 == 0) {
            System.out.println("Even number"); 
        } else {
            System.out.println("Odd number"); 
        }
    }

    //Problem: Determine whether the integer positive, negative, or zero 

    public static void number() {
        int n = -10; 

        if(n > 0) {
            System.out.println("POSITIVE"); 

        } else if(n < 0) {
            System.out.println("NEGATIVE"); 
        
        } else {
            System.out.println("ZERO"); 
        }
    }

    public void weight() {
        int a = 10; 
        int w = 20; 

        if(a >= 18) {
            if(w > 50) {
            System.out.println("Eligible to donate blood"); 

            } 

            } else {
                System.out.println("Not eligible to donate blood"); 
        }
    }

    public static void main(String[] args) {

        //This is how static methods can be called just by putting the name of the function
        Age();
        number();

        //Use objects to call public methods 

        VStatements call = new VStatements(); 
        VStatements calling = new VStatements(); 
        call.testNumber();
        calling.weight();
    }
    
}
