package com.agile.dev.code.chapter19;



/**
 * @description: 协会服务费
 * @date: 2019-04-21 11:03
 * @author: 十一
 */
public class ServiceCharge {

    public void addServiceCharge(int empId, double amount) {
        System.out.println(String.format("登记销售凭条：empId: %s， amount: %s",empId,amount));
    }
}
