public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new Customer[10]; 
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        this.customers[numberOfCustomers] = new Customer(f, l);
        this.numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customers[index]; //[cite: 9]
    }
}