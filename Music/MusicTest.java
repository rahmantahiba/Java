package Music;

public class MusicTest {

    public static void main(String[] args) {

        MusicShop shopOne = new MusicShop("Best Music!"); 
        MusicShop shopTwo = new MusicShop("Lovelyz"); 

        shopOne.storage(10);
        shopOne.album("Hip Hop");
        shopOne.pricing(120.0);
        shopOne.printmusicShop();

        shopTwo.storage(15);
        shopTwo.album("K-pop");
        shopTwo.pricing(160.0);
        shopTwo.printmusicShop();
    }
    
}
