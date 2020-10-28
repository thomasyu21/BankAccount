public class BankAccountTester{

  public static void main(String[] args) {
    BankAccount A1 = new BankAccount(1001,"password1");
    System.out.println(A1.getBalance()); //0.0
    System.out.println(A1.getAccountID()); //1001
    A1.setPassword("password2");

    depositTest(A1.deposit(-1000.), A1.getBalance()); //fail, 0.0
    depositTest(A1.deposit(0.), A1.getBalance()); //fail, 0.0
    depositTest(A1.deposit(1000.), A1.getBalance()); //success, 1000.0

    withdrawTest(A1.withdraw(-1000.), A1.getBalance()); //fail, 1000.0
    withdrawTest(A1.withdraw(0.), A1.getBalance()); //fail, 1000.0
    withdrawTest(A1.withdraw(1000.), A1.getBalance()); //success, 0.0

    System.out.println(A1.toString(A1.getAccountID(), A1.getBalance()));

  }

    //For Deposit Testing
    public static void depositTest(boolean a, double b) {
      if(a){
       System.out.println("Deposit Successful");
       System.out.println("Balance is " + b);
      }else{
       System.out.println("Deposit Failed");
       System.out.println("Balance is " + b);
      }
    }

    public static void withdrawTest(boolean a, double b) {
      if(a) {
        System.out.println("Withdrawl Successful");
        System.out.println("Balance is " + b);
      }else{
        System.out.println("Withdrawal Failed");
        System.out.println("Balance is " + b);
      }
    }

}
