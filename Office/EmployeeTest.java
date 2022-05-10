package Office;

public class EmployeeTest {
    public static void main(String[] args) {

        //Two objects under constructor of the previous class

        Template empOne = new Template("Elise"); 
        Template empTwo = new Template("Ann"); 

        //Invoking methods for each object

        empOne.empAge(19);
        empOne.empPosition("Senior Software Engineer");
        empOne.empSalary(880); //Since it has been set to the fields
        empOne.printEmployee();

        empTwo.empAge(16);
        empTwo.empPosition("Model");
        empTwo.empSalary(100);
        empTwo.printEmployee();

    }
}
