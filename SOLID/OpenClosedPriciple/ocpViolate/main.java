public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.pay(PaymentType.PAYPAL);
        payment.pay(PaymentType.PAYTM);
        payment.pay(PaymentType.GOOGLEPAY);
    }
}