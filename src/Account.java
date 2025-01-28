public class Account {
    // Fields to store the account's ID, owner's name, and current balance
    private String id;  // Unique identifier for the account
    private String name; // Name of the account holder
    private int balance = 0; // Account balance, initialized to 0 by default

    // Constructor to initialize the account with ID and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overloaded constructor to initialize the account with ID, name, and initial balance
    public Account(String id, String name, int balance) {
        this(id, name); // Call the other constructor to set ID and name
        this.balance = balance; // Set the initial balance
    }

    // Getter for account ID
    public String getID() {
        return id;
    }

    // Getter for account holder's name
    public String getName() {
        return name;
    }

    // Getter for account balance
    public int getBalance() {
        return balance;
    }

    // Method to credit (add) an amount to the account balance
    public int credit(int amount) {
        balance += amount; // Increase the balance by the specified amount
        return balance; // Return the updated balance
    }

    // Method to debit (withdraw) an amount from the account balance
    public int debit(int amount) {
        // Check if there are sufficient funds to withdraw
        if (balance >= amount) {
            balance -= amount; // Decrease the balance by the specified amount
            return balance; // Return the updated balance
        } else {
            // If insufficient funds, print a message and leave the balance unchanged
            System.out.println("Amount exceeded balance");
            return balance; // Return the current balance
        }
    }

    // Method to transfer an amount from this account to another account
    public int transferTo(Account another, int amount) {
        // Check if the transfer amount is positive and if there are sufficient funds
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount; // Decrease the balance of the current account
            another.balance += amount; // Increase the balance of the target account
            return this.balance; // Return the updated balance of the current account
        } else {
            // If the transfer fails (e.g., insufficient funds), return -1 as an error code
            return -1;
        }
    }

    // Override the toString method to provide a string representation of the account
    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
