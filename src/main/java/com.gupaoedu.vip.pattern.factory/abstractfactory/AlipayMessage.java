package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class AlipayMessage implements IMessage {
    public void sendMsg() {
        System.out.println("支付宝发送信息");
    }
}
