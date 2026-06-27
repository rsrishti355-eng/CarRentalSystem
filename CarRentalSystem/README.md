# Car Rental System

A small Java console application that models a simple car rental system. This project includes core classes for cars, customers, rentals, and a small entry-point to run the application.

## Quick Start

- **Prerequisites:** Java JDK 11+ installed and `javac`/`java` available on `PATH`.
- **Compile:**
```bash
javac */*.java
```
- **Run:**
```bash
java Main
```

If the `Main` class is inside a package or the run above fails, run the class with its package-qualified name, e.g. `java com.example.Main`, or run `java -cp . Main` depending on your setup.

## Project Structure

- **Car class:** description and model — [Car.java](Car.java/Car.java)
- **Customer class:** customer data & behavior — [Customer.java](Customer.java/Customer.java)
- **Rental class:** rental records & logic — [Rental.java](Rental.java/Rental.java)
- **CarRentalSystem:** higher-level system operations — [CarRentalSystem.java](CarRentalSystem.java/CarRentalSystem.java)
- **Main:** application entry point — [Main.java](Main.java/Main.java)

## Features

- Create and list cars and customers
- Create and manage rentals (start / end / calculate fees)

## Notes

- This project uses a simple file layout (each class in its own folder). Adjust compile/run commands if you add packages.

## Contributing

Small fixes and improvements welcome. Open an issue or submit a pull request.

## License

No license specified. Add a `LICENSE` file if you want to set one.
