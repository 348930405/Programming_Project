# Online Shop Program
### Description
The OnlineShop program is a shopping application written in java. It allows users to browse products, add products to cart, view cart, and proceed to checkout. Users can also open Admin Menu to mark orders as shipped.

## Features
### Browse Products
- Explore 3 product categories.
- Add products to cart.
- Select number of products.
### View Cart
- View items with thier quantity and price.
- Delete items from cart.
### Checkout
- Review all items in the cart.
- Calculate total cost of items.
- Place an order.
### Admin Menu
- View all orders along with thier statuses.
- Mark orders as "Shipped"
### Exit
- Exit the application.

## Main Variables
- Category ArrayList: Hold the products for the category and display them.
- CategoryStock ArrayList: Hold the products' stocks for the category and display them.
- CategoryPrice ArrayList: Hold the products' prices for the category.
- Cart ArrayList: Hold all the items in cart.
- CartQuantities ArrayList: Hold the quantity of each product in the cart. 
- CartPrices ArrayList: Hold the price of each product in the cart and calculate the total price of the items.
- Orders ArrayList: Hold all items and quantities for every order.
- OrderStatus ArrayList: Display the status for each order.

## Structure
### Main Menu
The program is controlled by a loop that begins with a menu offering the user 5 options:
1. Browse Product Categories
2. View Cart
3. Checkout
4. Admin
5. Exit

### Browse Product Categories
1. The user selects a category.
2. The user selects what product they want to add to cart.
3. The user selects the amount they want.
4. Validation ensures the inputs are within range and allows the user to try again if they are not.
5. Items, quantities, and prices are added to the cart.

### View Cart
1. Displays all items in cart with quantities and prices.
2. User can chose what item to remove.
3. If cart is empty, the program returns to the main menu.

### Checkout
1. Displays all items in the cart and calculates total cost.
2. User can chose to proceed with purchase.
3. Updates stock quantities of purchased items.
4. Adds order to the orders ArrayList and clears the cart.

### Admin Menu
1. Displays all orders with thier status.
2. Allows user to mark orders as "Shipped".
3. User marks orders until inputs number corresponding to the "Back to Main Menu" option.

### Exit
Exits the program and sends a farewell message.
