package com.platzi.payments;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.platzi.payments.PaymentResponse.PaymentStatus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @BeforeEach
    public void setup() {
        this.paymentGateway = Mockito.mock(PaymentGateway.class);
        this.paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test

    public void payment_is_correct() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.OK));

        boolean result = paymentProcessor.makePayment(1000);

        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);
    }
}
