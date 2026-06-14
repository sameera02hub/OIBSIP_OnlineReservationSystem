import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== LOGIN =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful");

            System.out.println("\n===== RESERVATION FORM =====");

            System.out.print("Passenger Name: ");
            String name = sc.nextLine();

            System.out.print("Train Number: ");
            String trainNo = sc.nextLine();

            System.out.print("Train Name: ");
            String trainName = sc.nextLine();

            System.out.print("Class Type: ");
            String classType = sc.nextLine();

            System.out.print("Journey Date: ");
            String date = sc.nextLine();

            System.out.print("From: ");
            String from = sc.nextLine();

            System.out.print("To: ");
            String to = sc.nextLine();

            int pnr = 123456;

            System.out.println("\nTicket Reserved Successfully");
            System.out.println("PNR Number: " + pnr);

            System.out.println("\n===== CANCELLATION =====");

            System.out.print("Enter PNR Number: ");
            int enteredPNR = sc.nextInt();

            if(enteredPNR == pnr) {
                System.out.println("Ticket Cancelled Successfully");
            } else {
                System.out.println("Invalid PNR Number");
            }

        } else {
            System.out.println("Invalid Login");
        }

        sc.close();
    }
}