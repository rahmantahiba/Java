public class While {

    //This file will start the lesson while loops 

    public void num() {
        int i = 0; 
        while(i <= 10) {
            System.out.println(i); 
            i++;
        }
    }

    public static void main(String[] args) {
        While obj = new While(); 
        obj.num();
    }
    
}
