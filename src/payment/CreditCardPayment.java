package payment;
public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng.");
    }
    @Override
    public String getPaymentType() { return PaymentMethod.CREDIT_CARD.getType(); }
    @Override
    public String getPaymentName() { return PaymentMethod.CREDIT_CARD.getName(); }
}
