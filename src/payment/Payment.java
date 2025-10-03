package payment;
public interface Payment {
    void pay(double amount, String customerName);
    String getPaymentType();
    String getPaymentName();
}
