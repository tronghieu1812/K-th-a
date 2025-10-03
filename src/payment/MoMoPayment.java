package payment;
public class MoMoPayment implements Payment {
    @Override
    public void pay(double amount, String customerName) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " qua MoMo.");
    }
    @Override
    public String getPaymentType() {
        return "Không dùng tiền mặt";
    }
    @Override
    public String getPaymentName() {
        return "MoMo";
    }
}
