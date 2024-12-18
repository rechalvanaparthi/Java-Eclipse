import java.util.*;
import java.util.stream.Collectors;

public class PrinterApp {

    // List to store Printer objects
    static List<Printer> printers = new ArrayList<>();

    // Printer class to represent each printer's attributes
    static class Printer {
        int printer_id;
        String printer_name;
        String model;
        String type;
        String resolution;
        int price;
        Date purchase_date;

        // Constructor for Printer class
        Printer(int printer_id, String printer_name, String model, String type,
                String resolution, int price, Date purchase_date) {
            this.printer_id = printer_id;
            this.printer_name = printer_name;
            this.model = model;
            this.type = type;
            this.resolution = resolution;
            this.price = price;
            this.purchase_date = purchase_date;
        }

        // toString method for easy printing of Printer object details
        @Override
        public String toString() {
            return "Printer [ID=" + printer_id + ", Name=" + printer_name + ", Model=" + model + 
                   ", Type=" + type + ", Resolution=" + resolution + ", Price=" + price + 
                   ", Purchase Date=" + purchase_date + "]";
        }

        // Update method for updating printer details
        public void updatePrinter(String printer_name, String model, String type, 
                                  String resolution, int price) {
            this.printer_name = printer_name;
            this.model = model;
            this.type = type;
            this.resolution = resolution;
            this.price = price;
        }
    }

    // Method to add printer to the list
    public static void addPrinter(Printer printer) {
        printers.add(printer);
    }

    // Method to show all printers in the list
    public static void showAllPrinters() {
        if (printers.isEmpty()) {
            System.out.println("No printers available.");
        } else {
            printers.forEach(System.out::println);
        }
    }

    // Method to filter printers by type using Stream API
    public static void showPrintersByType(String type) {
        printers.stream()
                .filter(printer -> printer.type.equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    // Method to filter printers by price using Stream API
    public static void showPrintersByPrice(int maxPrice) {
        printers.stream()
                .filter(printer -> printer.price <= maxPrice)
                .forEach(System.out::println);
    }

    // Method to filter printers by model using Stream API
    public static void showPrintersByModel(String model) {
        printers.stream()
                .filter(printer -> printer.model.equalsIgnoreCase(model))
                .forEach(System.out::println);
    }

    // Method to delete printer by ID
    public static void deletePrinterById(int printer_id) {
        printers.removeIf(printer -> printer.printer_id == printer_id);
    }

    // Method to update printer details by ID
    public static void updatePrinterById(int printer_id, String printer_name, String model, 
                                          String type, String resolution, int price) {
        printers.stream()
                .filter(printer -> printer.printer_id == printer_id)
                .forEach(printer -> printer.updatePrinter(printer_name, model, type, resolution, price));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;

        // Menu for user interaction
        do {
            System.out.println("PRINTER MANAGEMENT APPLICATION");
            System.out.println("------------------------------");
            System.out.println("1. Add Printer");
            System.out.println("2. Show All Printers");
            System.out.println("3. Show Printers by Type");
            System.out.println("4. Show Printers by Price");
            System.out.println("5. Show Printers by Model");
            System.out.println("6. Update Printer by ID");
            System.out.println("7. Delete Printer by ID");
            System.out.println("8. Exit");
            System.out.print("Please select an option: ");
            option = in.nextInt();
            in.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.println("Enter the details of the new printer:");
                    System.out.print("Enter printer ID: ");
                    int printerId = in.nextInt();
                    in.nextLine();  // Consume newline
                    System.out.print("Enter printer name: ");
                    String printerName = in.nextLine();
                    System.out.print("Enter printer model: ");
                    String modelName = in.nextLine();
                    System.out.print("Enter printer type: ");
                    String printerType = in.nextLine();
                    System.out.print("Enter printer resolution: ");
                    String resolution = in.nextLine();
                    System.out.print("Enter printer price: ");
                    int printerPrice = in.nextInt();
                    Date purchaseDate = new Date();
                    addPrinter(new Printer(printerId, printerName, modelName, printerType, resolution, printerPrice, purchaseDate));
                    System.out.println("New printer added successfully.");
                    break;
                case 2:
                    System.out.println("All Printers:");
                    showAllPrinters();
                    break;
                case 3:
                    System.out.print("Enter printer type to filter by (e.g., Laser, Inkjet, etc.): ");
                    String type = in.nextLine();
                    System.out.println("Printers of Type '" + type + "':");
                    showPrintersByType(type);
                    break;
                case 4:
                    System.out.print("Enter maximum price to filter by: ");
                    int maxPrice = in.nextInt();
                    System.out.println("Printers with price less than or equal to " + maxPrice + ":");
                    showPrintersByPrice(maxPrice);
                    break;
                case 5:
                    System.out.print("Enter printer model to filter by: ");
                    String model = in.nextLine();
                    System.out.println("Printers of Model '" + model + "':");
                    showPrintersByModel(model);
                    break;
                case 6:
                    System.out.print("Enter printer ID to update: ");
                    int updateId = in.nextInt();
                    in.nextLine();  // Consume newline
                    System.out.print("Enter new printer name: ");
                    String newName = in.nextLine();
                    System.out.print("Enter new printer model: ");
                    String newModel = in.nextLine();
                    System.out.print("Enter new printer type: ");
                    String newType = in.nextLine();
                    System.out.print("Enter new printer resolution: ");
                    String newResolution = in.nextLine();
                    System.out.print("Enter new printer price: ");
                    int newPrice = in.nextInt();
                    updatePrinterById(updateId, newName, newModel, newType, newResolution, newPrice);
                    System.out.println("Printer with ID " + updateId + " has been updated.");
                    break;
                case 7:
                    System.out.print("Enter printer ID to delete: ");
                    int deleteId = in.nextInt();
                    deletePrinterById(deleteId);
                    System.out.println("Printer with ID " + deleteId + " has been deleted.");
                    break;
                case 8:
                    System.out.println("Thank you for using Printer Management!");
                    System.exit(0);  // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 8);
    }
}

