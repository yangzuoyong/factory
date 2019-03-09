package com.gupaoedu.vip.pattern.factory;

public class WeChatPayment implements IPayment{
    public void paymentRecord() {
        System.out.println("微信支付记录");
    }
}
