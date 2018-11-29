public class CreditCard {



    private String ownerName;
    private int balance;
    private int limit;


    private CreditCard() {
        this.limit=100000;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public CreditCard(String ownerName, int balance, int limit) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.limit = limit;
    }

    public CreditCard(String ownerName, int balance) {
        this();
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public boolean drawMoney(int amount){
       if (amount<limit) {
           balance -= amount;
           System.out.println(1);
       }
       return amount<limit;
    }
}
