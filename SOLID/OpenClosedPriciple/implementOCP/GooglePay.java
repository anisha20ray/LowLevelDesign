public class GooglePay implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying through Google Pay");
    }
}