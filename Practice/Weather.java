package Practice;

public class Weather {
    String wType; 
    int temp; 

    void temperature(String weatherType, int t) {
        wType = weatherType; 
        temp = t; 
    }

    //Then method for print statement 

    void printTemp() {
        System.out.println(wType + " " + temp); 
    }
    
}
