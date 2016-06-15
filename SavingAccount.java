/**
 * Created by vishal on 2016-06-12.
 */
public class SavingAccount extends BankAccount {

    private String name;
    private static final double savingIntrest = 0.062;
    private SavingAccount(){
        super();
    }
    public SavingAccount(String name){

        super.setName(name);

    }
    public double getIntrest(){
         return savingIntrest;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void deposite(double amount){
       super.setBalance(amount+(amount * savingIntrest));
    }
    @Override
    public void withdraw(double amount){
        if(amount<= super.getBalance()) {
            super.setBalance(super.balance - (amount+(amount * 13)/100));
        }else{
            throw new IllegalArgumentException("Transction Cancelled because of Insuffcient Funds");
        }
    }
}
