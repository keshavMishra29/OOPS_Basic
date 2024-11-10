import java.util.ArrayList;

public class Bank {
    ArrayList<String> accountHolder = new ArrayList<>();
    int totalCash = 0;
    String branchId; //Instance variable
    // Local Variable

    //Constructor is something that has exactly same name as class name
    //It can be parametrize and unparametrize
    public Bank(){
        //Unparametrized constructor
        //Constructor are the methods that automatically got invoked when we are trying to create object
        System.out.println("Unparametrize constructor get invoked automatically");
    }

    public Bank(String bankBranchId){
        //Parametrize constructor
        //We can use constructor to initilize properties inside the class
        //System.out.println("Parametrize constructor get called");
        this.branchId = bankBranchId;
    }

    public void createAccount(String accountName){
        accountHolder.add(accountName);
    }
    public void depositeAmount(int amount){
        totalCash += amount;
    }
    public int getTotalCash(){
        return totalCash;
    }
    public String getBranchId(){
        return this.branchId;
    }
    public ArrayList<String> getListAccountHolders(){
        return accountHolder;
    }
}
