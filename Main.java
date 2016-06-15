import java.util.UUID;

/**
 * Created by vishal on 2016-06-12.
 */
public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new SavingAccount("Vishal Malik");
        b1.deposite(1000);
        b1.withdraw(200);
        System.out.println(b1);

    }
}
