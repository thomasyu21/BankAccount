public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    balance = 0.0;
    accountID = a;
    password = p;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
    //System.out.println("New password is " + s); //Testing purposes
  }

  public boolean deposit(double amount) {
    if (amount >= 0.0) {
      balance+=amount;
      return true;
    }else{
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (amount >= 0.0 && amount <= balance) {
      balance-=amount;
      return true;
    }else{
      return false;
    }
  }

  public String toString() {
    return ("#" + accountID + "\t$" + balance);
  }

  private boolean authenticate(String password) {
    return (password.equals(this.password));
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
     if (authenticate(password) && withdraw(amount)) {
       if(other.deposit(amount)){
         return true;
       }else{
         System.out.println("Transfer Failed");
       }
     }
     return false;
  }

}
