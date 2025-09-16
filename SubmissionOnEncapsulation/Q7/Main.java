package Q7;

public class Main {
    public static void processPatients(Patient[] patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            double bill = patient.calculateBill();
            System.out.println("Bill: " + bill);
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).addRecord("Diagnosis: Flu");
                System.out.println("Records: " + ((MedicalRecord) patient).viewRecords());
            }
        }
    }

    public static void main(String[] args) {
        Patient[] patients = new Patient[] {
            new InPatient("P101", "Alice", 30, 5, 2000),
            new OutPatient("P202", "Bob", 25, 500)
        };
        processPatients(patients);
    }
}
