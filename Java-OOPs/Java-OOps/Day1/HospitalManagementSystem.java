public class HospitalManagementSystem {
        static class Patient {
            static String hospitalName = "City Hospital";
            private static int totalPatients = 0;

            private final int patientID;
            private String name;
            private int age;
            private String ailment;

            public Patient(String name, int age, String ailment) {
                this.name = name;
                this.age = age;
                this.ailment = ailment;
                totalPatients++;
                this.patientID = totalPatients;
            }

            public static int getTotalPatients() {
                return totalPatients;
            }

            public void displayDetails() {
                System.out.println("Hospital Name: " + hospitalName);
                System.out.println("Patient ID: " + patientID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
            }
        }

        // Sample usage
        public static void main(String[] args) {
            Patient p1 = new Patient("Alice", 30, "Flu");
            Patient p2 = new Patient("Bob", 45, "Fracture");

            Object obj = p1;
            if (obj instanceof Patient) {
                ((Patient) obj).displayDetails();
            }

            System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        }
}
