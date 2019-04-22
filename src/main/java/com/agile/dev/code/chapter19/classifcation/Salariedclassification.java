package com.agile.dev.code.chapter19.classifcation;

/**
 * @description: 一定要写注释啊
 * @date: 2019-04-21 11:17
 * @author: 十一
 */
public class Salariedclassification extends PaymentClassifcation{

    private double salaryOfMonth;

    public Salariedclassification(double salaryOfMonth) {
        this.salaryOfMonth = salaryOfMonth;
    }

    public double getSalaryOfMonth() {
        return salaryOfMonth;
    }

    public void setSalaryOfMonth(double salaryOfMonth) {
        this.salaryOfMonth = salaryOfMonth;
    }
}
