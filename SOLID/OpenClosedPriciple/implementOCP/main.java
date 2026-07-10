public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        Payment paypal = new PayPal();
        Payment paytm = new Paytm();
        Payment googlePay = new GooglePay();

        paymentService.processPayment(paypal);
        paymentService.processPayment(paytm);
        paymentService.processPayment(googlePay);
    }
}

//for adding new payment method
/*public class PhonePe implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying through PhonePe");
    }
}*/

/*Payment phonePe = new PhonePe();
paymentService.processPayment(phonePe);*/