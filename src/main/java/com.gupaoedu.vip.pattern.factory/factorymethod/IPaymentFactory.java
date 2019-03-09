package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IPayment;

/**
 * 工厂模型
 * Created by GP12713
 */
public interface IPaymentFactory {
    IPayment create();
}
