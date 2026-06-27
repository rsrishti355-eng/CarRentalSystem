import java.util.*;

class CarRentalSystem {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Rental> rentals = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void showAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getCarId() + " - " + car.getBrand() + " - ₹" + car.getPricePerDay() + "/day");
            }
        }
    }

    public Car findCar(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equalsIgnoreCase(carId)) {
                return car;
            }
        }
        return null;
    }

    public void rentCar(String carId, Customer customer, int days) {
        Car car = findCar(carId);

        if (car == null || !car.isAvailable()) {
            System.out.println("Car not available!");
            return;
        }

        car.rentCar();
        Rental rental = new Rental(car, customer, days);
        rentals.add(rental);

        System.out.println("Car rented successfully!");
        System.out.println("Total Bill: ₹" + rental.calculateBill());
    }

    public void returnCar(String carId) {
        for (Rental rental : rentals) {
            if (rental.getCar().getCarId().equalsIgnoreCase(carId)) {
                rental.getCar().returnCar();
                System.out.println("Car returned successfully!");
                return;
            }
        }
        System.out.println("Invalid Car ID!");
    }
}