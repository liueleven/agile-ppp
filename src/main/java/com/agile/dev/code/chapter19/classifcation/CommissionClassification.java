package com.agile.dev.code.chapter19.classifcation;

import com.agile.dev.code.chapter19.SalesReceipt;

/**
 * @description: 一定要写注释啊
 * @date: 2019-04-21 11:17
 * @author: 十一
 */
public class CommissionClassification extends PaymentClassifcation{

    private double salaryOfMonth;

    private double commission;

    private SalesReceipt salesReceipt;

    public CommissionClassification(double salaryOfMonth, double commission, SalesReceipt salesReceipt) {
        this.salaryOfMonth = salaryOfMonth;
        this.commission = commission;
        this.salesReceipt = salesReceipt;
    }
}
