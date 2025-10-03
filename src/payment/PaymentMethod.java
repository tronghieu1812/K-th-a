package payment;
public enum PaymentMethod {
    CREDIT_CARD("Không dùng tiền mặt", "CreditCard"),
    PAYPAL("Không dùng tiền mặt", "PayPal"),
    CASH("Trực tiếp", "Cash"),
    MOMO("Không dùng tiền mặt", "MoMo");
    private final String type;
    private final String name;
    PaymentMethod(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
