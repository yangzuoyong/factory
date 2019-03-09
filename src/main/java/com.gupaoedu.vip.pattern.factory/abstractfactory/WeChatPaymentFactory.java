package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class WeChatPaymentFactory implements IPaymentFactory {
    public IMessage createMessage() {
        return new WeChatMessage();
    }

    public ITransaction createTransaction() {
        return new WeChatTransaction();
    }
}
