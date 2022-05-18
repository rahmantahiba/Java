package Gaming;

public class GameTest {

    //Create object for constructor which in this case is name of the gamer from the previous class

    public static void main(String[] args) {
        GameInfo gamerOne = new GameInfo("Denise"); 
        GameInfo gamerTwo = new GameInfo("J"); 

        gamerOne.gameName("Trails of Cold Steel");
        gamerOne.gPrice(59.99);
        gamerOne.printGame();

        gamerTwo.gameName("Tales of the Abyss");
        gamerTwo.gPrice(29.99);
        gamerTwo.printGame();
    
    }

   
    
   
    
}
