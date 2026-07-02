public class Main {
    public static void main(String[] args) {

        PaymentProcessor paypalPayment =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripePayment =
                new StripeAdapter(new StripeGateway());

        paypalPayment.processPayment(5000);
        stripePayment.processPayment(3000);
    }
}