//1.Create a class Bank with fields accountType and accountBalanc
public class Bank {
        // Fields
        String accountType;
        double accountBalance;

        // Constructor
        public Bank(String accountType, double accountBalance) {
            this.accountType = accountType;
            this.accountBalance = accountBalance;
        }

        // Getters
        public String getAccountType() {
            return accountType;
        }

        public double getAccountBalance() {
            return accountBalance;
        }

        // Setters
        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public void setAccountBalance(double accountBalance) {
            this.accountBalance = accountBalance;
        }

        //2.Create a method deposit that adds to the accountBalance and returns the value.
    // Method to deposit funds
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    //3.Create a method withdrawal that subtracts from the accountBalance and returns the value.
    // Method to withdraw funds
    public double withdrawal(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds");
            return accountBalance;
        } else {
            accountBalance -= amount;
            return accountBalance;
        }
    }

    //4. Create a parameterized constructor that sets the accountType and the accountBalance.
    // Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Getters
    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Setters
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    //5.Create a method display to print “The account type is (accountType) and the balance is
    //(accountBalance)”
    // Method to display account information
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
//6.Create a class Insurance that inherits from the Bank class.
    public class Insurance extends Bank {
        // Constructor
        public Insurance(String accountType, double accountBalance) {
            super(accountType, accountBalance);
        }

        // Additional methods or fields specific to Insurance class
    }

    //7.Create a method cover that prints “You are covered”.
    // Method to print coverage message
    public void cover() {
        System.out.println("You are covered");
    }

    /*8. In the main method create an instance of the Bank class. For the parameters use YOUR INITIALS
    as the accountType and YOUR REG NUMBER (without the characters) as the accountBalance.*/
    public class Main {
        public static void main(String[] args) {
            // Create an instance of the Bank class
            Bank bank = new Bank("MN", 230006);

            // Call the display method to print account information
            bank.display();

            // Deposit funds
            bank.deposit(1000.0);

            // Withdraw funds
            bank.withdrawal(500.0);

            //9.invoke display method.
            // Call the display method again to print updated account information
            bank.display();


            // Create an instance of the Insurance class
            Insurance insurance = new Insurance("MN", 5000.0);

            // Call the display method to print account information
            insurance.display();

            // Call the cover method to print coverage message
            insurance.cover();
        }

    }

}




