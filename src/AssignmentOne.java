public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 1. Create 3 GeneralPractitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Davis", "Family Medicine", "123 Main St, Sydney");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Brown", "General Health", "456 Oak Ave, Melbourne");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Wilson", "Primary Care", "789 Pine Rd, Brisbane");

        // 2. Create 2 Radiologist objects
        Radiologist rad1 = new Radiologist(201, "Dr. James Lee", "Diagnostic Radiology", "CT Scanner + MRI");
        Radiologist rad2 = new Radiologist(202, "Dr. Lisa Chen", "Interventional Radiology", "Ultrasound + X-Ray");

        // 3. Print all object details
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        rad1.printDetails();
        rad2.printDetails();

        // Add a dividing line
        System.out.println("------------------------------");
    }
}