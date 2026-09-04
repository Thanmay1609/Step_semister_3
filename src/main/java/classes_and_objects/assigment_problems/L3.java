package classes_and_objects.assigment_problems;

public class L3 {

    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("Name: " + emp.empName);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Permanent: " + emp.permanent);
    }
}

class Employee {
    String empName;
    double salary;
    boolean permanent;
}
