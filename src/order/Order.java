package order;
import payment.Payment;
public class Order {
    private String customerName;
    private double amount;
    private Payment paymentMethod;
    public Order(String customerName, double amount, Payment paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }
    public void checkout() {
        paymentMethod.pay(amount, customerName);
    }
}
