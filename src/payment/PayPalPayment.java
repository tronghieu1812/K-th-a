package payment;
public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " qua PayPal.");
    }
    @Override
    public String getPaymentType() { return PaymentMethod.PAYPAL.getType(); }
    @Override
    public String getPaymentName() { return PaymentMethod.PAYPAL.getName(); }
}
