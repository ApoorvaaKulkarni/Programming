import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    private static Map<String, String> phonebook = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove an existing contact");
            System.out.println("3. Update phone number");
            System.out.println("4. Search for a contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    removeContact(scanner);
                    break;
                case 3:
                    updatePhoneNumber(scanner);
                    break;
                case 4:
                    searchContact(scanner);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        System.out.println("Exiting Phonebook. Goodbye!");
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if(phoneNumber.length() > 10){
            System.out.println("Number must be only 10");
            return;
        }
        if(phoneNumber.length() == 10){
            phonebook.put(name, phoneNumber);
            System.out.println("Contact added successfully.");
        }
        else{
            System.out.println("phone number must not be less than 10");
        }
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }

    private static void removeContact(Scanner scanner) {
        System.out.print("Enter contact name to remove: ");
        String name = scanner.nextLine();
        if (phonebook.containsKey(name)) {
            phonebook.remove(name);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void updatePhoneNumber(Scanner scanner) {
        System.out.print("Enter contact name to update phone number: ");
        String name = scanner.nextLine();
        if (phonebook.containsKey(name)) {
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            phonebook.put(name, newPhoneNumber);
            System.out.println("Phone number updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter contact name to search: ");
        String name = scanner.nextLine();
        if (phonebook.containsKey(name)) {
            System.out.println("Phone number: " + phonebook.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
}
