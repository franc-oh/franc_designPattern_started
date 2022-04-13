package com.franc.design._02_structural._06_adapter._04_self;

import com.franc.design._02_structural._06_adapter._04_self.adaptee.PointService;
import com.franc.design._02_structural._06_adapter._04_self.adapter.ComplexPaymentService;
import com.franc.design._02_structural._06_adapter._04_self.target.PaymentService;
import com.franc.design._02_structural._06_adapter._04_self.target.sample.CommonPaymentService;

public class App {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CommonPaymentService());
        paymentService.payment("user2", 3000);

        PaymentService paymentService2 = new PaymentService(new ComplexPaymentService(new PointService()));
        paymentService2.payment("user1", 4000);
    }
}
