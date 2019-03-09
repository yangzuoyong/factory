package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AlipayPaymentFactory factory=new AlipayPaymentFactory();
        factory.createMessage().sendMsg();
        factory.createTransaction().record();
        WeChatPaymentFactory weChatPaymentFactory=new WeChatPaymentFactory();
        weChatPaymentFactory.createMessage().sendMsg();
        weChatPaymentFactory.createTransaction().record();
    }
}
