package TDD.edu.payment;

public interface PaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
