

/**
 * Created by vishal on 2016-06-12.
 */
public class SuperSavingAccount {
    private static double SuperSavingAccountIntrest = 0.11;
    private String name;
    private SuperSavingAccount(){

    }
    private SuperSavingAccount(String name){
        this.name = name;
    }

    public static double getSuperSavingAccountIntrest() {
        return SuperSavingAccountIntrest;
    }

    public String getName() {
        return name;
    }
}
