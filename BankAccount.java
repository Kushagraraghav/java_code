class BankAccount {
    private double balance;

    BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    protected void withdraw(double amount) {
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.checkBalance();
        account.withdraw(200);
        account.checkBalance();
    }
}

