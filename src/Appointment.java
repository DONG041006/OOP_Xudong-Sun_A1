public class Appointment {
    //instance variable
    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor; // Compatible with all HealthProfessional subclasses

    // 1. default constructor
    public Appointment() {
        this.patientName = "Unknown Patient";
        this.patientMobile = "Unknown Mobile";
        this.preferredTimeSlot = "Unknown Time";
        this.selectedDoctor = new HealthProfessional(); // Default base class object
    }

    // 2. Constructor with parameters (initializing all instance variables)
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 3. Method for printing all appointment information
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor Information:");
        selectedDoctor.printDetails(); // Call the doctor's printing method
        System.out.println();
    }

    // Getter (subsequent appointment cancellations require searching via phone number, and must include the Getter of patientMobile)
    public String getPatientMobile() {
        return patientMobile;
    }
}