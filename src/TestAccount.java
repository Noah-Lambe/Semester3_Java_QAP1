public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts with initial balances of 5000 and 4000
        Account Acc1 = new Account("123456", "John Doe", 5000);
        Account Acc2 = new Account("789012", "Jane Smith", 4000);

        System.out.println("Account 1:");
        System.out.println("Balance: " + Acc1.getBalance());

        System.out.println();

        System.out.println("Account 2:");
        System.out.println("Balance: " + Acc2.getBalance());

        System.out.println();
        Acc1.transferTo(Acc2, 1000);
        System.out.println("Transferred 1000 from Account 1 to Account 2");
        System.out.println();

        System.out.println("Account 1:");
        System.out.println("Balance: " + Acc1.getBalance());

        System.out.println();

        System.out.println("Account 2:");
        System.out.println("Balance: " + Acc2.getBalance());

    }
}
