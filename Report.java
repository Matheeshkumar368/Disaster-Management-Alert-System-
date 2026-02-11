public class Report {

    String disasterType;
    String location;
    String severity;
    String date;

    public Report(String disasterType, String location, String severity, String date) {
        this.disasterType = disasterType;
        this.location = location;
        this.severity = severity;
        this.date = date;
    }

 public void displayReport() {
    System.out.println("\n--- Disaster Report ---");
    System.out.println("Disaster Type : " + disasterType);
    System.out.println("Location      : " + location);
    System.out.println("Severity      : " + severity);
    System.out.println("Date          : " + date);
}

    }

