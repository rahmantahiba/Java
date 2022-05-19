public class Car {
    String brand; 
    int price; 
    double fuel; 

    Car(String brand, int price, double fuel) {
        this.brand = brand; 
        this.price = price;
        this.fuel = fuel; 
    }

    public static void main(String[] args) {
        Car c1 = new Car("Ford", 12000, 60.0); 
        //specify the fields in the print statement
        //Use + not comma
       System.out.println(c1.brand + " " + c1.price + " " + c1.fuel); 
    }
    
}
