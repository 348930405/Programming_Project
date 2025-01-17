// OUR ISU
import java.util.*;
public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<String> electronics = new ArrayList<>();
        ArrayList<String> clothing = new ArrayList<>();
        ArrayList<String> books = new ArrayList<>();
        ArrayList<Integer> electronicsStock = new ArrayList<>();
        ArrayList<Integer> clothingStock = new ArrayList<>();
        ArrayList<Integer> booksStock = new ArrayList<>();
        ArrayList<Integer> electronicsPrice = new ArrayList<>();
        ArrayList<Integer> clothingPrice = new ArrayList<>();
        ArrayList<Integer> booksPrice = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> cartQuantities = new ArrayList<>();
        ArrayList<Integer> cartPrices = new ArrayList<>();

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
        electronicsStock.add(8);
        electronicsStock.add(5);

        clothingStock.add(20);
        clothingStock.add(15);
        clothingStock.add(10);

        booksStock.add(30);
        booksStock.add(25);
        booksStock.add(15);

        electronicsPrice.add(800);
        electronicsPrice.add(650);
        electronicsPrice.add(60);

        clothingPrice.add(20);
        clothingPrice.add(25);
        clothingPrice.add(35);

        booksPrice.add(10);
        booksPrice.add(15);
        booksPrice.add(5);


        boolean loop = true;
        while (loop == true) {
            System.out.println("\n--- Main Menu ---\n1. Browse Product Categories\n2. View Cart\n3. Checkout\n4. Admin Login\n5. Exit\nSelect a category by number:");
            int total = 0;
            int useramount;
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                System.out.println("\n--- Product Categories ---\n1. Electronics\n2. Clothing\n3. Books\n4. Back to Main Menu\nSelect a category by number:");
                userInput = sc.nextInt();
                while (userInput < 1 || userInput > 4) {
                    System.out.println("Invalid input, try again:");
                    userInput = sc.nextInt();
                }    
                if (userInput == 1) {
                    System.out.println("\n--- Electronics ---");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + ". " + electronics.get(i) + " " + electronicsPrice.get(i) + "$ - " + electronicsStock.get(i) + " in stock");
                    }
                    System.out.println("Select a product by number:");
                    userInput = sc.nextInt();
                    while (userInput < 1 || userInput > 3 || electronicsStock.get(userInput - 1) < 1) {
                        if (userInput < 1 || userInput > 3) {
                        System.out.println("Invalid input, try again:");
                        }
                        else {
                            System.out.println("Out of stock, try again:");
                        }
                        userInput = sc.nextInt();
                    }
                    cart.add(electronics.get(userInput - 1));
                    cartPrices.add(electronicsPrice.get(userInput - 1));

                    System.out.println("Select the amount you would like to purchase:");
                    useramount = sc.nextInt();
                    while (electronicsStock.get(userInput - 1) - useramount < 0) {
                        System.out.println("Not enough in stock, try again:");
                        useramount = sc.nextInt();
                    }    
                    cartQuantities.add(useramount);
                    System.out.println(electronics.get(userInput - 1) + " has been added to cart.");

                }
                else if (userInput == 2) {
                    System.out.println("\n--- Clothing ---");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + ". " + clothing.get(i) + " " + clothingPrice.get(i) + "$ - " + clothingStock.get(i) + " in stock");
                    }
                    System.out.println("Select a product by number:");
                    userInput = sc.nextInt();
                    while (userInput < 1 || userInput > 3 || clothingStock.get(userInput - 1) < 1) {
                        if (userInput < 1 || userInput > 3) {
                        System.out.println("Invalid input, try again:");
                        }
                        else {
                            System.out.println("Out of stock, try again:");
                        }
                        userInput = sc.nextInt();
                    }
                    cart.add(clothing.get(userInput - 1));
                    cartPrices.add(clothingPrice.get(userInput - 1));

                    System.out.println("Select the amount you would like to purchase:");
                    useramount = sc.nextInt();
                    while (clothingStock.get(userInput - 1) - useramount < 0) {
                        System.out.println("Not enough in stock, try again:");
                        useramount = sc.nextInt();
                    }    
                    cartQuantities.add(useramount);
                    System.out.println(clothing.get(userInput - 1) + " has been added to cart.");

                }
                else if (userInput == 3) {
                    System.out.println("\n--- Books ---");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + ". " + books.get(i) + " " + booksPrice.get(i) + "$ - " + booksStock.get(i) + " in stock");
                    }
                    System.out.println("Select a product by number:");
                    userInput = sc.nextInt();
                    while (userInput < 1 || userInput > 3 || booksStock.get(userInput - 1) < 1) {
                        if (userInput < 1 || userInput > 3) {
                        System.out.println("Invalid input, try again:");
                        }
                        else {
                            System.out.println("Out of stock, try again:");
                        }
                        userInput = sc.nextInt();
                    }
                    cart.add(books.get(userInput - 1));
                    cartPrices.add(booksPrice.get(userInput - 1));

                    System.out.println("Select the amount you would like to purchase:");
                    useramount = sc.nextInt();
                    while (booksStock.get(userInput - 1) - useramount < 0) {
                        System.out.println("Not enough in stock, try again:");
                        useramount = sc.nextInt();
                    }    
                    cartQuantities.add(useramount);
                    System.out.println(books.get(userInput - 1) + " has been added to cart.");

                }
                else if (userInput == 4) {
                    System.out.println("Returning to main menu.");
                }
                break;

                case 2:
                System.out.println("\n--- Cart ---");
                if (cart.size() == 0) {
                    System.out.println("Your art is empty. Returning to menu.");
                }
                else {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println((i + 1) + ". " + cart.get(i) + " Quantity:" + cartQuantities.get(i) + " $" + cartPrices.get(i) + " each");
                    }
                    System.out.println((cart.size() + 1) + ". Back to Main Menu\nSelect a product that you would like to remove by number:");
                    userInput = sc.nextInt();
                    while (userInput < 1 || userInput > (cart.size() + 1)) {
                        System.out.println("Invalid input, try again:");
                        userInput = sc.nextInt();
                    }
                    if (userInput == (cart.size() + 1)) {
                        System.out.println("Returning to main menu.");
                    }
                    else {
                        System.out.println(cart.get(userInput - 1) + " has been removed.");
                        cart.remove(userInput - 1);
                        cartQuantities.remove(userInput - 1);
                        cartPrices.remove(userInput - 1);
                    }
                }
                break;

                case 3:
                if (cart.size() == 0) {
                    System.out.println("Your art is empty. Returning to menu.");
                }
                else {
                    System.out.println("\n--- Checkout ---\nItems:");
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println(cartQuantities.get(i) + " " + cart.get(i));
                    }
                    for (int i = 0; i < cart.size(); i++) {
                        total += cartQuantities.get(i) * cartPrices.get(i);
                    }
                    System.out.println("Total: " + total + "$");
                    System.out.println("\n1. Proceed with Purchace\n2. Back to Main Menu\nSelect an option by number:");
                    userInput = sc.nextInt();
                    while (userInput < 1 || userInput > 2) {
                        System.out.println("Invalid input, try again:");
                        userInput = sc.nextInt();
                    }
                    if (userInput == 2) {
                        System.out.println("Returning to main menu.");
                    }
                    else {
                        for (int i = 0; i < cart.size(); i ++) {
                            if (electronics.contains(cart.get(0))) {
                                int index = (electronics.indexOf(cart.get(0)));
                                electronicsStock.set(index, (electronicsStock.get(index) - cartQuantities.get(0)));
                            }
                            else if (clothing.contains(cart.get(0))) {
                                int index = (clothing.indexOf(cart.get(0)));
                                clothingStock.set(index, (clothingStock.get(index) - cartQuantities.get(0)));
                            }
                            else if (books.contains(cart.get(0))) {
                                int index = (books.indexOf(cart.get(0)));
                                booksStock.set(index, (booksStock.get(index) - cartQuantities.get(0)));
                            }
                        }
                        int length = cart.size();
                        for (int i = 0; i < length; length --) {
                            cart.remove(0);
                            cartQuantities.remove(0);
                            cartPrices.remove(0);
                        }
                        System.out.println("\nThank you for your purchase!");

                    }
                }
                break;
                
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