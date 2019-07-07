class BankAccount{
    private String Name;
    private int Balance;

    public BankAccount(String Name,int Balance) {
        this.Name = Name;
        this.Balance = Balance;
    }
    //开户
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
    public String getInfo() {
        return "账户余额："+this.Balance;
    }
}
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("AAA",20000);
        System.out.println(ba.getInfo());
    }
}
