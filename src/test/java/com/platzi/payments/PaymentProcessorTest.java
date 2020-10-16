package com.platzi.payments;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.platzi.payments.PaymentResponse.PaymentStatus;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        boolean result = paymentProcessor.makePayment(1000);

        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.ERROR));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);
    }
}
