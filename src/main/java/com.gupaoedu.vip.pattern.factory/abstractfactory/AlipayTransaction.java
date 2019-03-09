package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class AlipayTransaction implements ITransaction {
    public void record() {
        System.out.println("支付宝交易记录");
    }
}
