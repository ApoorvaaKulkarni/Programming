import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

public class ShoppingCart {
    private ArrayList<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        for (Item item : cartItems) {
            if (item.getName().equals(name)) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println(quantity + " " + name + "(s) added to cart");
                return;
            }
        }
        Item newItem = new Item(name, price, quantity);
        cartItems.add(newItem);
        System.out.println(quantity + " " + name + "(s) added to cart");
    }

    public void removeItem(String name, int quantity) {
        for (Item item : cartItems) {
            if (item.getName().equals(name)) {
                if (quantity >= item.getQuantity()) {
                    cartItems.remove(item);
                    System.out.println(item.getQuantity() + " " + name + "(s) removed");
                    return;
                } else {
                    item.setQuantity(item.getQuantity() - quantity);
                    System.out.println(quantity + " " + name + "(s) removed");
                    return;
                }
            }
        }
        System.out.println("Items not found in cart");
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : cartItems) {
            total += item.getTotal();
        }
        return total;
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your shopping cart is empty");
        } else {
            System.out.println("Items in your shopping cart:");
            for (Item item : cartItems) {
                System.out.println("- " + item.getName() + " | Quantity: " + item.getQuantity() + " | Price: $" + item.getTotal());
            }
            System.out.println("Total: $" + calculateTotal());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nShopping cart:");
            System.out.println("1. Add items to the cart");
            System.out.println("2. Remove items from the cart");
            System.out.println("3. Display items in the cart");
            System.out.println("4. Calculate total cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter item price: $");
                    double itemPrice = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int itemQuantity = sc.nextInt();
                    cart.addItem(itemName, itemPrice, itemQuantity);
                    System.out.println("Total bill: " + cart.calculateTotal());
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String itemNameToRemove = sc.nextLine();
                    System.out.print("Enter quantity to remove: ");
                    int quantityToRemove = sc.nextInt();
                    cart.removeItem(itemNameToRemove, quantityToRemove);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Total cost: $" + cart.calculateTotal());
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
