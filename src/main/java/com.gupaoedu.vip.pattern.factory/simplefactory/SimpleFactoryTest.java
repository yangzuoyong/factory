package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.AlipayPayment;
import com.gupaoedu.vip.pattern.factory.IPayment;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        IPayment payment = factory.create(AlipayPayment.class);
        payment.paymentRecord();
    }
}
