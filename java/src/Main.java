import java.util.Scanner;

class Overloading {

    int totalDays = 90;

    
    void calculateAttendance(int presentDays) {
        double percentage = (presentDays * 100.0) / totalDays;
        System.out.println("Attendance Percentage: " + percentage + "%");
    }

    
    void calculateAttendance(int presentDays, int trainingDays) {
        double percentage = (presentDays * 100.0) / totalDays;
        System.out.println("Attendance Percentage: " + percentage + "%");

        if (trainingDays > 10) {
            System.out.println("Credit Status: 1 Credit Awarded");
        } else {
            System.out.println("Credit Status: No Credit");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Overloading it = new Overloading();

        System.out.print("Enter present days: ");
        int presentDays = sc.nextInt();

        System.out.print("Enter placement training days: ");
        int trainingDays = sc.nextInt();

        
        it.calculateAttendance(presentDays, trainingDays);

        sc.close();
    }
}