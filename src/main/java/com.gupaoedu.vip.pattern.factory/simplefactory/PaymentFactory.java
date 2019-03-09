package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.IPayment;

public class PaymentFactory {
    public IPayment create(Class<? extends IPayment> clazz){
        try{
            if(null!=clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


        return null;
    }
}
