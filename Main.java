public class Main {
    public static void main(String[] args) {
        Bank bankABC = new Bank();

        bankABC.addCustomer("Zaky", "Pratama");
        bankABC.addCustomer("Rizky", "Hisyam");

        Customer customerZaky = bankABC.getCustomer(0);
        System.out.println("Nasabah terdaftar: " + customerZaky.getFirstName() + " " + customerZaky.getLastName());

        Customer customerRizky = bankABC.getCustomer(1);
        System.out.println("Nasabah terdaftar: " + customerRizky.getFirstName() + " " + customerRizky.getLastName());

        Account zakyAccount = new Account(500000);
        customerZaky.setAccount(zakyAccount);

        Account rizkyAccount = new Account(1000000);
        customerRizky.setAccount(rizkyAccount);

        System.out.println("Saldo Awal: Rp " + customerZaky.getAccount(0).getBalance());
        System.out.println("Saldo Awal: Rp " + customerRizky.getAccount(0).getBalance());

        boolean isSuccess = customerZaky.getAccount(0).withdraw(150000);
        boolean isSuccessRizky = customerRizky.getAccount(0).withdraw(200000);

        
        if (isSuccess) {
            System.out.println("Tarik tunai berhasil.");
        } else {
            System.out.println("Tarik tunai gagal, saldo tidak cukup.");
        }

        if (isSuccessRizky) {
            System.out.println("Tarik tunai berhasil.");
        } else {
            System.out.println("Tarik tunai gagal, saldo tidak cukup.");
        }
        
        System.out.println("Saldo Akhir: Rp " + customerZaky.getAccount(0).getBalance());
        System.out.println("Saldo Akhir: Rp " + customerRizky.getAccount(0).getBalance());
    }
}