public class BankAccountTester{

  public static void main(String[] args) {
    BankAccount A1 = new BankAccount(1001,"password1");
    System.out.println(A1.getBalance());
    System.out.println(A1.getAccountID());
  }
}
