public class Food {
    String fName; 
    double price; 
    String rName; 

    Food(String fName, double price, String rName) {
        this.fName = fName; 
        this.price = price; 
        this.rName = rName; 
    }

    public static void main(String[] args) {
        Food fType = new Food("Dumpling", 10.99, "Eat Dumpling"); 
        System.out.println(fType.fName + " " + fType.price + " " + fType.rName); 
    }
    
}
