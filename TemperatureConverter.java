import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("-------------------");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    celsiusToFahrenheit(scanner);
                    break;
                case 2:
                    fahrenheitToCelsius(scanner);
                    break;
                case 3:
                    celsiusToKelvin(scanner);
                    break;
                case 4:
                    kelvinToCelsius(scanner);
                    break;
                case 5:
                    fahrenheitToKelvin(scanner);
                    break;
                case 6:
                    kelvinToFahrenheit(scanner);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    static void celsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
    }

    static void fahrenheitToCelsius(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
    }

    static void celsiusToKelvin(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f°C is equal to %.2fK%n", celsius, kelvin);
    }

    static void kelvinToCelsius(Scanner scanner) {
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.printf("%.2fK is equal to %.2f°C%n", kelvin, celsius);
    }

    static void fahrenheitToKelvin(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        System.out.printf("%.2f°F is equal to %.2fK%n", fahrenheit, kelvin);
    }

    static void kelvinToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        System.out.printf("%.2fK is equal to %.2f°F%n", kelvin, fahrenheit);
    }
}
