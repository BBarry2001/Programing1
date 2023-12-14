import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class AutomobileInventory {
    public static void main(String[] args) {
        Automobile_ auto = new Automobile_("Toyota", "Camry", "Black", 2020, 15000);
        printArray(auto.listVehicle());

        System.out.println(auto.removeVehicle());

        System.out.println(auto.addVehicle("Honda", "Civic", "White", 2021, 10000));
        printArray(auto.listVehicle());

        System.out.println(auto.updateVehicle("Honda", "Civic", "Red", 2021, 10500));
        printArray(auto.listVehicle());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to print the information to a file (Y/N)? ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            try {
                PrintWriter writer = new PrintWriter(new File("C:\\Temp\\Autos.txt"));
                for (String detail : auto.listVehicle()) {
                    writer.println(detail);
                }
                writer.close();
                System.out.println("Information printed to C:\\Temp\\Autos.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("File will not be printed.");
        }
    }

    private static void printArray(String[] array) {
        for (String item : array) {
            System.out.println(item);
        }
    }
}
