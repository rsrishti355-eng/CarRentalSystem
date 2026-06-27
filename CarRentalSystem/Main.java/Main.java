import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRentalSystem system = new CarRentalSystem();

        // Adding cars
        system.addCar(new Car("C1", "BMW", 5000));
        system.addCar(new Car("C2", "Audi", 4000));
        system.addCar(new Car("C3", "Swift", 2000));

        while (true) {
            System.out.println("\n===== CAR RENTAL SYSTEM =====");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent Car");
            System.out.println("3. Return Car");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.showAvailableCars();
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Car ID: ");
                    String carId = sc.nextLine();

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    Customer customer = new Customer("CUS" + System.currentTimeMillis(), name);
                    system.rentCar(carId, customer, days);
                    break;

                case 3:
                    System.out.print("Enter Car ID to return: ");
                    String returnId = sc.next();
                    system.returnCar(returnId);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}