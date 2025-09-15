public class Vehicle_Registration {
        private String ownerName;
        private String vehicleType;
        private static double registrationFee = 500.0;

        public Vehicle_Registration(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        public void displayVehicleDetails() {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }

        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
}
