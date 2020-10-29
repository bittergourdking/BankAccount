public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(12345, "testy mess");
    BankAccount b2 = new BankAccount(54321, "testy mess");
    b1.withdraw(5);
    b2.deposit(22);
    b2.withdraw(5);
    b2.setPassword("messy test");
    System.out.println(b2.getBalance());
    System.out.println(b2.getAccountID());
    System.out.println(b1.toString());
    System.out.println(b2.toString());
  }
}
