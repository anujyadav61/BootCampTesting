package Constructor;

class Employee {

    private int id;
    private String name;
    private float salary;
    private String ssn;

    // Parameterized Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Getter and Setter for ssn
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

public class ConstructorsUsingGetterAndSetter {

    public static void main(String[] args) {

        Employee anuj = new Employee(143, "Anuj Yadav");

        // Setting remaining values using setters
        anuj.setSalary(75000.0f);
        anuj.setSsn("123-45-6789");

        // Displaying values using getters
        System.out.println("Employee ID: " + anuj.getId());
        System.out.println("Employee Name: " + anuj.getName());
        System.out.println("Employee Salary: " + anuj.getSalary());
        System.out.println("Employee SSN: " + anuj.getSsn());
    }
}