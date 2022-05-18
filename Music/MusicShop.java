public class MusicShop {
    int category; 
    double price; 
    String aName; 
    String sName;

    public MusicShop(String sName) {
        this.sName = sName; 
    }

    public void storage(int store) {
        category = store; 
    }

    public void pricing(double p) {
        price = p; 
    }

    public void album(String selection) {
        aName = selection; 
    }

    public void printmusicShop() {

        System.out.println("Name of Shop: " + sName); 
        System.out.println("Number of categories: " + category); 
        System.out.println("Name of album: " + aName); 
        System.out.println("Total price: " + price); 
    }
    
}
