package com.agile.dev.code.chapter19.add;


import com.agile.dev.code.chapter19.classifcation.CommissionClassification;
import com.agile.dev.code.chapter19.classifcation.PaymentClassifcation;
import com.agile.dev.code.chapter19.payment.HoldMethod;
import com.agile.dev.code.chapter19.payment.PayMentMethod;
import com.agile.dev.code.chapter19.schdule.Commissioncheduly;
import com.agile.dev.code.chapter19.schdule.PaymentSchedule;

/**
 * @description: 有提成
 * @date: 2019-04-21 10:50
 * @author: 十一
 */
public class AddCommissEmpTransaction extends AddEmployeeTransaction{

    private double salary;

    private double commissionRate;


    @Override
    public PaymentClassifcation getClassification() {
        return new CommissionClassification(salary,commissionRate,null);
    }

    @Override
    public PaymentSchedule getSchdule() {
        return new Commissioncheduly();
    }

    @Override
    public PayMentMethod getPayMentMethod() {
        return new HoldMethod();
    }

    @Override
    public double getTotalSalary() {
        return 0;
    }

    @Override
    public void execute() {

    }
}
