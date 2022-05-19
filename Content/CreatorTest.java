package Content;

public class CreatorTest {
    public static void main(String[] args) {
        ContentCreator creatorOne = new ContentCreator("Tati"); 
        creatorOne.viewership(20000);
        creatorOne.money(220.0);
        creatorOne.printCreator();
    }
    
}
