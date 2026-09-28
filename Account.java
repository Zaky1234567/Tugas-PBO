public class Account {
    private double balance; 

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // Menambah saldo
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}