public class BankAccount {
  //instance variables
  private double balance;
  private int accountID;
  private String password;
  //constructor
  public BankAccount(int a, String b) {
    balance = 0;
    accountID = a;
    password = b;
  }
  //methods
  public String toString() {
    return (Integer.toString(accountID)
    + "\t" + Double.toString(balance));
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  public void setPassword(String newPass) {
    password = newPass;
  }
  public boolean deposit (double amount) {
    if (amount < 0) {
      return false;
    } else {
      balance += amount;
      return true;
    }
  }
  public boolean withdraw (double amount) {
    if (amount > balance || amount < 0) {
      return false;
    } else {
      balance -= amount;
      return true;
    }
  }
}
