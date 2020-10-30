public class BankAccountTester {

  public static void main(String[] args) {
    BankAccount A1 = new BankAccount(1001,"password1");
    System.out.println(A1.getBalance()); //0.0
    System.out.println(A1.getAccountID()); //1001
    A1.setPassword("password2");

    System.out.println();
    depositTest(A1.deposit(-1000.), A1.getBalance()); //fail, 0.0
    depositTest(A1.deposit(0.), A1.getBalance()); //fail, 0.0
    depositTest(A1.deposit(1000.), A1.getBalance()); //success, 1000.0

    System.out.println();
    withdrawTest(A1.withdraw(-1000.), A1.getBalance()); //fail, 1000.0
    withdrawTest(A1.withdraw(0.), A1.getBalance()); //fail, 1000.0
    withdrawTest(A1.withdraw(1000.), A1.getBalance()); //success, 0.0

    System.out.println();
    System.out.println(A1.toString());

    System.out.println();
    BankAccount A2 = new BankAccount(1002,"password3");
    A1.deposit(10000.);
    A1.transferTo(A2, 1000., "password1");
    System.out.println(A1);
    System.out.println(A2);
    A1.transferTo(A2, 1000., "password2");
    System.out.println(A1);
    System.out.println(A2);

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
