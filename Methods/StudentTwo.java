package Methods;

public class StudentTwo {
    int rollNum; 
    String name; 

    void insertRecord(int r, String n) {
        rollNum = r; 
        name = n;
    }

    void displayInformation() {
        System.out.println(rollNum + " " + name); 
    }
    
}
