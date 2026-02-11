import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Disaster Type (Flood/Fire/Earthquake/Cyclone): ");
        String type = sc.nextLine();

        System.out.println("Enter Location: ");
        String location = sc.nextLine();

        System.out.println("Enter Severity (Low/Medium/High): ");
        String severity = sc.nextLine();

        System.out.println("Enter Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        Report r = new Report(type, location, severity, date);
        r.displayReport();
    }
}
