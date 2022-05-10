package Office;


public class Template {
    String name; 
    int age; 
    String position; 
    double salary; 

    public Template(String name) {
        this.name = name; 
    }

    public void empAge(int empAge) {
        age = empAge; 
    }

    public void empPosition(String empos) {
        position = empos;  //Strings paramters name have to be different
    }

    public void empSalary(double empSalary) {
        salary = empSalary; 
    }

    
    public void printEmployee() {
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Position: " + position); 
        System.out.println("Salary: " + salary); 
    }
    
}
