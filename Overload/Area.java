package Overload;

public class Area {

    public double calArea(double a) {
        System.out.print("The area of the square is: "); 
        return a * a; 
    }

    public int calArea(int base, int height) {
        System.out.print("The area of the triangle is: ");
        return base * height / 2; 
    }

    public static void main(String[] args) {
        Area shape = new Area();
        System.out.println(shape.calArea(2)); 
        System.out.println(shape.calArea(10, 2)); 
    }
    
}
