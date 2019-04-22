package com.agile.dev.code.chapter19.dto;

import com.agile.dev.code.chapter19.classifcation.PaymentClassifcation;
import com.agile.dev.code.chapter19.payment.PayMentMethod;
import com.agile.dev.code.chapter19.schdule.PaymentSchedule;

/**
 * @description: 一定要写注释啊
 * @date: 2019-04-21 10:56
 * @author: 十一
 */
public class Employee {

    private PayMentMethod payMentMethod;
    private PaymentClassifcation paymentClassifcation;
    private PaymentSchedule paymentSchedule;

    protected String name;
    protected int EmployeeId;
    protected String address;


    public Employee(String name, int employeeId, String address) {
        this.name = name;
        EmployeeId = employeeId;
        this.address = address;
    }

    public PaymentClassifcation getPaymentClassifcation() {
        return paymentClassifcation;
    }

    public void setPaymentClassifcation(PaymentClassifcation paymentClassifcation) {
        this.paymentClassifcation = paymentClassifcation;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }


    public PayMentMethod getPayMentMethod() {
        return payMentMethod;
    }

    public void setPayMentMethod(PayMentMethod payMentMethod) {
        this.payMentMethod = payMentMethod;
    }

    public PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }
}
