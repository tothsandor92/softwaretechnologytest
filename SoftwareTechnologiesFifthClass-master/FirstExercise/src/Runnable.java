public class Runnable {

    public static void main(String[] args) {

        CreditCard creditCard1= new CreditCard("Bogdándy Bence", 99999999, 50000);
        CreditCard creditCard2= new CreditCard("Kiss Pista", 250000);

        creditCard1.drawMoney(14000);
        System.out.println(creditCard1.drawMoney(100));
        System.out.println(creditCard1.getBalance());

        creditCard2.drawMoney(140000);
        System.out.println(creditCard2.getBalance());

    }

}
