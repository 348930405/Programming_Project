// OUR ISU
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<String> electronics = new ArrayList<>();
        ArrayList<String> clothing = new ArrayList<>();
        ArrayList<String> books = new ArrayList<>();
        ArrayList<Integer> electronicsStock = new ArrayList<>();
        ArrayList<Integer> clothingStock = new ArrayList<>();
        ArrayList<Integer> booksStock = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> cartQuantities = new ArrayList<>();

        categories.add("Electronics");
        categories.add("Clothing");
        categories.add("Books");

        electronics.add("Laptop");
        electronics.add("Smartphone");
        electronics.add("Headphones");

        clothing.add("Shirt");
        clothing.add("Jeans");
        clothing.add("Jacket");

        books.add("Novel");
        books.add("Notebook");
        books.add("Magazine");

        electronicsStock.add(10);
        electronicsStock.add(5);
        electronicsStock.add(2);

        clothingStock.add(20);
        clothingStock.add(15);
        clothingStock.add(10);

        booksStock.add(30);
        booksStock.add(25);
        booksStock.add(15);

        boolean loop = true;
        while (loop == true) {
            System.out.println("\n--- Main Menu ---\n1. Browse Product Categories\n2. View Cart\n3. Checkout\n4. Admin Login\n5. Exit");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                System.out.println("\n--- Product Categories ---\n1. Electronics\n2. Clothing\n3. Books\n4. Back to Main Menu\nSelect a category by number:");
                userInput = sc.nextInt();
                if (userInput < 1 || userInput > 4) {
                    System.out.println("Invalid input, returning to main menu.");
                }
                else {
                    if (userInput == 1) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println((i + 1) + "." + electronics.get(i));
                        }
                    }
                    else if (userInput == 2) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println((i + 1) + "." + clothing.get(i));
                        }
                    }
                    else if (userInput == 3) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println((i + 1) + "." + books.get(i));
                        }
                    }
                    else if (userInput == 4) {
                        System.out.println("Returning to main menu.");
                    }
                }
                case 2:
                case 3:
                case 4:
                case 5:
                System.out.println("Thank you for visiting! Goodbye!");
                loop = false;
                break;
                default:
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}            