package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class WeChatTransaction implements ITransaction {
    public void record() {
        System.out.println("微信交易记录");
    }
}
