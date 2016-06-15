import java.util.UUID;

/**
 * Created by vishal on 2016-06-12.
 */
public abstract class  BankAccount {
    /**
     * Declaration of variables
     */
    protected double balance;
    public abstract double getIntrest();
    private String name;
    private static int NumOfAcc = 0;
    public UUID a = null;

    /**
     * Private Constructor
     *
     * @return balance = 0.00
     */
    public BankAccount() {
        balance = 0.00;
        NumOfAcc++;
        a = UUID.randomUUID();
    }


    /**
     * This is constructor which takes name as parameter
     * @param name
     */
    public BankAccount(String name){
        this.name = name;
    }

    /**
     * This is the method which add the amount which you desire to add in your  balance
     * @param amount
     */

    public void deposite(double amount){
        balance += amount;
    }

    /**
     * This method is used to withdraw the amount you want to withdraw form your account
     * @param amount
     */

    public void withdraw(double amount){
        if(amount <= (balance+((balance*13)/100))){
            balance -= amount;
        }else{
            throw new IllegalArgumentException("Transction cancelled because of insuffcient funds");
        }
    }

    /**
     * This method is use to intially set the balance
     * @param balance
     */

    public void setBalance(double balance) {

        this.balance = balance;
    }

    /**
     * This method is used to set the name of account
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     * This method is used to get the current balance
     * @return The current balance
     */

    public double getBalance() {

        return balance;
    }

    /**
     * This method is used to name of account
     * @return name of account
     */

    public String getName() {

        return name;
    }

    /**
     * This is the method to override the toStirng method to return the string which is desired this time
     * @return toString
     */


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * This  method is an overridden equals method to check the objects wheather they are equal or not
     * @param o
     * @return boolean
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount that = (BankAccount) o;

        if (Double.compare(that.balance, balance) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    /**
     * This method is used to assign an unique id to account
     * @return
     */

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
