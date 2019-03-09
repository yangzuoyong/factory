package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.AlipayPayment;
import com.gupaoedu.vip.pattern.factory.IPayment;

public class AlipayPaymentFactory implements IPaymentFactory {

    public IPayment create() {
        return new AlipayPayment();
    }
}
