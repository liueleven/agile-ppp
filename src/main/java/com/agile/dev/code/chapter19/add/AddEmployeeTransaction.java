package com.agile.dev.code.chapter19.add;

import com.agile.dev.code.chapter19.classifcation.PaymentClassifcation;
import com.agile.dev.code.chapter19.database.GpayrollDatabase;
import com.agile.dev.code.chapter19.dto.Employee;
import com.agile.dev.code.chapter19.payment.PayMentMethod;
import com.agile.dev.code.chapter19.schdule.PaymentSchedule;

/**
 * @description: 一定要写注释啊
 * @date: 2019-04-21 10:49
 * @author: 十一
 */
public abstract class AddEmployeeTransaction extends Transaction {

    String name;
    int employeeId;
    String address;

    private PayMentMethod payMentMethod;
    private PaymentClassifcation paymentClassifcation;
    private PaymentSchedule paymentSchedule;


    public  void addEmp(int empId,String name,String address) {
        this.name = name;
        this.employeeId = empId;
        this.address = address;
    }

    public abstract PaymentClassifcation getClassification();
    public abstract PayMentMethod getPayMentMethod();

    public abstract PaymentSchedule getSchdule();
    public abstract double getTotalSalary ();

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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
