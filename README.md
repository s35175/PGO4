\# PGO4 - Cafe Console Application



A simple Java console application designed to manage cafe operations, register menu items, store customer data, and process individual orders. 



This project was built to demonstrate core Object-Oriented Programming (OOP) concepts such as class associations, data encapsulation, static context, dynamic data structures (`ArrayList`), and method overriding.



\## 🚀 Features \& Technical Highlights



\* \*\*Static Variable Tracking:\*\*

&#x20; \* Uses a static variable (`productCount`) in the `MenuItem` class to keep track of the total number of products created globally.

&#x20; \* Uses a static variable (`nextOrderNumber`) initialized at `1000` in the `Order` class to automatically generate sequential, unique order IDs for every new order.

\* \*\*Dynamic Collections:\*\* \* Utilizes an `ArrayList<MenuItem>` inside the `Order` class to dynamically store and manage multiple products for a single customer.

\* \*\*Custom Object Comparison (`equals()` overrides):\*\*

&#x20; \* `MenuItem`: Two products are considered equal if they share the same unique `code` (e.g., "C-01"), regardless of their name or price.

&#x20; \* `CafeCustomer`: Two customers are considered identical if they have either the same `customerId` OR the same `email` address.

\* \*\*Calculations \& State Management:\*\*

&#x20; \* `Order` class includes a `calculateTotal()` method that iterates through the `ArrayList` to sum the prices of all added items.

&#x20; \* Includes state tracking for orders (e.g., `isPaid` boolean flag updated via `markAsPaid()` method).



\## 📂 Class List \& Responsibilities



\* \*\*`MenuItem`\*\*: Represents a single product sold in the cafe. Stores product code, name, price, and category. Tracks the total number of created items statically.

\* \*\*`CafeCustomer`\*\*: Represents a customer. Stores personal details like ID, first name, last name, and email. Includes a helper method to return the full name.

\* \*\*`Order`\*\*: Represents a single transaction. Links a `CafeCustomer` to a list of `MenuItem` objects. Handles adding items, counting items, calculating the total price, and managing the payment status.

\* \*\*`Main`\*\*: The execution point of the application. Contains a robust test scenario that:

&#x20; 1. Instantiates multiple menu items and a customer.

&#x20; 2. Creates an order and populates it with items.

&#x20; 3. Prints detailed summaries using overridden `toString()` methods.

&#x20; 4. Demonstrates custom `equals()` logic by comparing a duplicate item.

&#x20; 5. Tests the payment state update (`markAsPaid()`).



\## 🛠️ How to Run

To test the application, simply compile and run the `Main.java` file. The console will output the creation of items, the combined order summary with calculated totals, the result of the `equals()` comparisons, and the final state of the order after payment.

