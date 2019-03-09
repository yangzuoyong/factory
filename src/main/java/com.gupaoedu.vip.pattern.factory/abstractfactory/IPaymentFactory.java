package com.gupaoedu.vip.pattern.factory.abstractfactory;

public interface IPaymentFactory {
    IMessage createMessage();
    ITransaction createTransaction();
}
