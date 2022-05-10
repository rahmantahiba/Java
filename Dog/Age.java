package Dog;

public class Age {
    int puppyAge; //camelcase (aB)

    Age(int puppyAge) {
        this.puppyAge = puppyAge;  

    }

    //When name does not need to be set use separate parameter 
    public Age(String name) {
        System.out.println("The name of puppy is: " + name);
    }

    public void setAge(int age) {
        puppyAge = age; 
    }

    public int getAge() {
        System.out.println("The age of puppy is: " + puppyAge); 
        return puppyAge; 
    }

    public static void main(String[] args) {
        Age puppy = new Age("Alfin");
        puppy.setAge(2); 
        puppy.getAge(); 
        System.out.println("Overall is: " + puppy.puppyAge); 
    }
    
}
