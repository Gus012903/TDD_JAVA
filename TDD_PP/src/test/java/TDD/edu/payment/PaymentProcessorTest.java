package TDD.edu.payment;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void give_payment_when_is_correct_then_ok() {

        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        PaymentProcessor processor = new PaymentProcessor(gateway);

        Mockito.when(gateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(processor.makePayment(100));
    }
}