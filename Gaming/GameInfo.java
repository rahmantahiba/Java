//Objective: Use object-orientated programming to create game selection

public class GameInfo {
    String owner; 
    String gName; 
    double price; 

    //Make constructor same name as class
    //Camel case is lowercase then uppercase

    public GameInfo(String owner) {
        this.owner = owner; 
    }

    public void gameName(String gameName) {
        gName = gameName; 
    }

    public void gPrice(double gPrice) {
        price = gPrice; 
    }

   
    public void printGame() {

        System.out.println("The owner of game: " + owner);
        System.out.println("The name is game is: " + gName); 
        System.out.println("The price is: " + price); 
    }
    
}
