package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IPayment;
import com.gupaoedu.vip.pattern.factory.WeChatPayment;

public class WeChatPaymentFactory implements  IPaymentFactory {
    public IPayment create() {
        return new WeChatPayment();
    }
}
