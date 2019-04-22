package com.agile.dev.code.chapter19.add;


import com.agile.dev.code.chapter19.classifcation.PaymentClassifcation;
import com.agile.dev.code.chapter19.classifcation.Salariedclassification;
import com.agile.dev.code.chapter19.database.GpayrollDatabase;
import com.agile.dev.code.chapter19.dto.Employee;
import com.agile.dev.code.chapter19.payment.HoldMethod;
import com.agile.dev.code.chapter19.payment.PayMentMethod;
import com.agile.dev.code.chapter19.schdule.MonthlyScheduly;
import com.agile.dev.code.chapter19.schdule.PaymentSchedule;

/**
 * @description: 月结
 * @date: 2019-04-21 10:50
 * @author: 十一
 */
public class AddSalaryedEmpTransaction extends AddEmployeeTransaction{

    private double salary;


    public AddSalaryedEmpTransaction(int empId, String name, double salary) {
        this.salary  = salary;
        super.employeeId = empId;
        super.name = name;

    }


    @Override
    public PaymentClassifcation getClassification() {
        return new Salariedclassification(salary);
    }

    @Override
    public PayMentMethod getPayMentMethod() {
        return new HoldMethod();
    }

    @Override
    public PaymentSchedule getSchdule() {
        return new MonthlyScheduly();
    }

    @Override
    public double getTotalSalary() {

        return salary;
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

    @Override
    public String toString() {
        return "AddSalaryedEmpTransaction{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", address='" + address + '\'' +
                '}';
    }
}
