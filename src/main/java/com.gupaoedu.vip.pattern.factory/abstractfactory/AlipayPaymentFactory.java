package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class AlipayPaymentFactory implements IPaymentFactory {
    public IMessage createMessage() {
        return new AlipayMessage();
    }

    public ITransaction createTransaction() {
        return new AlipayTransaction();
    }
}
