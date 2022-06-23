package Recursion;

public class Thermo {
    
    public static String temp(String unit, double t, double operate) {
        if(unit == "F") { //Fahrenheit to celsius 
            operate = (t - 32)* 5/9;
            return temp(unit, t, operate); 

        } else if(unit == "C") { //Celsius to fahrenheit
            operate = (t * 9/5) + 32; 
            return temp(unit, t, operate);
        }
 
        return ""; 
    }
}
