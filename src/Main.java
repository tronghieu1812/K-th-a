import order.Order;
import payment.*;
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("An", 200000, new CreditCardPayment());
        order1.checkout();
        Order order2 = new Order("Bình", 150000, new PayPalPayment());
        order2.checkout();
        Order order3 = new Order("Chi", 100000, new CashPayment());
        order3.checkout();
        Order order4 = new Order("Dũng", 300000, new MoMoPayment());
        order4.checkout();
    }
}


