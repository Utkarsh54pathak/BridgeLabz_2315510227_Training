public class EmployeeManagementSystem {
        static String companyName = "TechCorp";
        private static int totalEmployees = 0;

        private final int id;
        private String name;
        private String designation;

        public EmployeeManagementSystem(int id, String name, String designation) {
            this.id = id;
            this.name = name;
            this.designation = this.designation = designation;
            totalEmployees++;
        }

        public static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }

        public void printEmployeeDetails(Object obj) {
            if (obj instanceof EmployeeManagementSystem) {
                EmployeeManagementSystem emp = (EmployeeManagementSystem) obj;
                System.out.println("Company Name: " + companyName);
                System.out.println("ID: " + emp.id);
                System.out.println("Name: " + emp.name);
                System.out.println("Designation: " + emp.designation);
            } else {
                System.out.println("Object is not an Employee");
            }
        }
}
