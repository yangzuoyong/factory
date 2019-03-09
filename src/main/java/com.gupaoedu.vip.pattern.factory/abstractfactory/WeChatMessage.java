package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class WeChatMessage implements IMessage{
    public void sendMsg() {
        System.out.println("微信发送信息");
    }
}
