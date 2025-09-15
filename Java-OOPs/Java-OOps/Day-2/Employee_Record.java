public class Employee_Record {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee_Record(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static class Manager extends Employee_Record {
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public void displayInfo() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
        }
    }
    
}
