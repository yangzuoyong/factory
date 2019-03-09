package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IPayment;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IPaymentFactory factory = new AlipayPaymentFactory();
        IPayment payment = factory.create();
        payment.paymentRecord();

        factory = new WeChatPaymentFactory();
        payment = factory.create();
        payment.paymentRecord();
    }
}
