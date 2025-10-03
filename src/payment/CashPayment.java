package payment;
public class CashPayment implements Payment {
    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " bằng tiền mặt.");
    }
    @Override
    public String getPaymentType() { return PaymentMethod.CASH.getType(); }
    @Override
    public String getPaymentName() { return PaymentMethod.CASH.getName(); }
}
