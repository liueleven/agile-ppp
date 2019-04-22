package com.agile.dev.code.chapter19.add;


import com.agile.dev.code.chapter19.classifcation.PaymentClassifcation;
import com.agile.dev.code.chapter19.database.GpayrollDatabase;
import com.agile.dev.code.chapter19.dto.Employee;
import com.agile.dev.code.chapter19.payment.HoldMethod;
import com.agile.dev.code.chapter19.payment.PayMentMethod;
import com.agile.dev.code.chapter19.schdule.PaymentSchedule;

/**
 * @description: 日结
 * @date: 2019-04-21 10:50
 * @author: 十一
 */
public class AddHoulyEmpTransaction extends AddEmployeeTransaction{

    private double hourlyRate;


    @Override
    public PaymentClassifcation getClassification() {
        return null;
    }

    @Override
    public PaymentSchedule getSchdule() {
        return null;
    }

    @Override
    public double getTotalSalary() {
        return 0;
    }

    @Override
    public PayMentMethod getPayMentMethod() {
        return new HoldMethod();
    }

    @Override
    public void execute() {
        PaymentClassifcation pc = getClassification();
        PaymentSchedule ps = getSchdule();
        PayMentMethod pm = getPayMentMethod();
        Employee employee = new Employee(name, employeeId,address);
        employee.setPaymentClassifcation(pc);
        employee.setPaymentSchedule(ps);
        employee.setPayMentMethod(pm);
        GpayrollDatabase.addEmployee(employeeId,employee);
    }
}
