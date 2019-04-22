package com.agile.dev.code.chapter19;

import java.util.Date;

/**
 * @description: 销售凭条
 * @date: 2019-04-21 11:03
 * @author: 十一
 */
public class SalesReceipt {

    public void addSalesReceipt(int empId, Date date, double amount) {
        System.out.println(String.format("登记销售凭条：empId: %s，date: %s, amount: %s",empId,date,amount));
    }
}
