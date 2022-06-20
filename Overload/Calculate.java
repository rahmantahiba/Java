package Overload;

public class Calculate {

    public double cal(double add1, double add2, double add3) {
        System.out.print("The answer when adding is: "); 
        return (add1 + add2 + add3); 
    }

    public double cal(double sub1, double sub2) {
        System.out.print("The answer when substracting is: "); 
        return (sub1 - sub2); 
    }

    public int cal(int m, int p) {
        System.out.print("The answer when multiplying is: "); 
        return (m * p); 
    }

    public float cal(float d, float n) {
        System.out.print("The answer when dividing is: "); 
        return (d/n); 
    }

    public static void main(String[] args) {
        Calculate num = new Calculate(); 
        System.out.println(num.cal(20, 30, 40)); 
        System.out.println(num.cal(10, 20));
        System.out.println(num.cal(100, 10));
        System.out.println(num.cal(4, 2)); 
    }

  
    
}
