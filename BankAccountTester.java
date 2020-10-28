public class BankAccountTester{

  public static void main(String[] args) {
    BankAccount A1 = new BankAccount(1001,"password1");
    System.out.println(A1.getBalance());
    System.out.println(A1.getAccountID());
    A1.setPassword("password2");

    depositTest(A1.deposit(-1000.), A1.getBalance());
    depositTest(A1.deposit(0.), A1.getBalance());
    depositTest(A1.deposit(1000.), A1.getBalance());


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

}
