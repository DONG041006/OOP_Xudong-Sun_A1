import java.util.ArrayList;

public class AssignmentOne {
    // Method 1: Create and add an appointment
    public static void createAppointment(ArrayList<Appointment> list, String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // Verify the integrity of information
        if (patientName == null || patientName.isEmpty() ||
                patientMobile == null || patientMobile.isEmpty() ||
                timeSlot == null || timeSlot.isEmpty() ||
                doctor == null) {
            System.out.println("Error: The appointment information is incomplete, unable to create an appointment！");
            return;
        }
        // Create an appointment object and add it to the collection
        Appointment newAppt = new Appointment(patientName, patientMobile, timeSlot, doctor);
        list.add(newAppt);
        System.out.println("Appointment created successfully! Patient: " + patientName + ", Time: " + timeSlot);
        System.out.println();
    }

    // Method 2: Print all existing appointments
    public static void printExistingAppointments(ArrayList<Appointment> list) {
        System.out.println("=== Existing appointment list ===");
        if (list.isEmpty()) {
            System.out.println("Currently, there are no existing appointments.");
            System.out.println();
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Appointment " + (i + 1) + "：");
            list.get(i).printAppointmentDetails();
        }
    }

    // Method 3: Cancel the reservation via mobile phone number
    public static void cancelBooking(ArrayList<Appointment> list, String mobile) {
        System.out.println("=== Canceling an appointment operation===");
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPatientMobile().equals(mobile)) {
                list.remove(i); // Delete matching appointments
                found = true;
                System.out.println("The reservation with the phone number " + mobile + " has been successfully canceled.");
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for the phone number " + mobile + ".");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 1. Create 3 GeneralPractitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Davis", "Family Medicine", "123 Main St, Sydney");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Brown", "General Health", "456 Oak Ave, Melbourne");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Wilson", "Primary Care", "789 Pine Rd, Brisbane");

        // 2. Create two Radiologist objects
        Radiologist rad1 = new Radiologist(201, "Dr. James Lee", "Diagnostic Radiology", "CT Scanner + MRI");
        Radiologist rad2 = new Radiologist(202, "Dr. Lisa Chen", "Interventional Radiology", "Ultrasound + X-Ray");

        // 3. Print the details of all objects
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        rad1.printDetails();
        rad2.printDetails();

        // Add a dividing line
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        // 1. Declare an ArrayList collection
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // 2. Create 4 appointments (2 for general practice and 2 for radiology)
        createAppointment(appointmentList, "Alice Smith", "0412345678", "08:30", gp1); // general medicine
        createAppointment(appointmentList, "Bob Johnson", "0498765432", "10:00", gp2); // general medicine
        createAppointment(appointmentList, "Charlie Davis", "0456789012", "14:00", rad1); // Radiology Department
        createAppointment(appointmentList, "Diana Miller", "0423456789", "15:30", rad2); // Radiology Department

        // 3. Print existing appointments
        printExistingAppointments(appointmentList);

        // 4. Cancel one appointment (e.g. Alice's appointment, phone number 0412345678)
        cancelBooking(appointmentList, "0412345678");

        // 5. Print the appointment again and demonstrate the updates
        printExistingAppointments(appointmentList);

        // Add a dividing line
        System.out.println("------------------------------");
    }
}