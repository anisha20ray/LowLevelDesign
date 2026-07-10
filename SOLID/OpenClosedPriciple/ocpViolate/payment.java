enum PaymentType {
    PAYPAL,
    PAYTM,
    GOOGLEPAY
}

public class Payment {

    public void pay(PaymentType paymentType) {

        if (paymentType == PaymentType.PAYPAL) {
            System.out.println("Paying through PayPal");

        } else if (paymentType == PaymentType.PAYTM) {
            System.out.println("Paying through Paytm");

        } else if (paymentType == PaymentType.GOOGLEPAY) {
            System.out.println("Paying through Google Pay");
        }
    }
}

//Why does this violate the Open/Closed Principle?
//The Payment class uses if-else statements to decide which payment method to use.
//If a new payment method such as PhonePe, Stripe, or Apple Pay is added, you must modify the existing Payment class by adding another else if block.
//Since the existing class must be changed whenever a new payment method is introduced, it is not closed for modification, violating OCP.