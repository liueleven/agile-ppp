package com.agile.dev.code.chapter19;

import com.agile.dev.code.CodeApplicationTests;
import com.agile.dev.code.chapter19.add.AddSalaryedEmpTransaction;
import com.agile.dev.code.chapter19.classifcation.PaymentClassifcation;
import com.agile.dev.code.chapter19.classifcation.Salariedclassification;
import com.agile.dev.code.chapter19.database.GpayrollDatabase;
import com.agile.dev.code.chapter19.dto.Employee;
import com.agile.dev.code.chapter19.payment.DirectMethod;
import com.agile.dev.code.chapter19.payment.HoldMethod;
import com.agile.dev.code.chapter19.payment.PayMentMethod;
import com.agile.dev.code.chapter19.schdule.Commissioncheduly;
import com.agile.dev.code.chapter19.schdule.MonthlyScheduly;
import com.agile.dev.code.chapter19.schdule.PaymentSchedule;
import org.junit.Assert;
import org.junit.Test;


/**
 * @description: 一定要写注释啊
 * @date: 2019-04-21 13:31
 * @author: 十一
 */
public class TestAddSalariedEmployee extends CodeApplicationTests {

    @Test
    public void payrollTest () {
        int empId = 1;
        AddSalaryedEmpTransaction aset = new AddSalaryedEmpTransaction(empId,"Bob",100.00);
        aset.execute();

        GpayrollDatabase gpayrollDatabase = new GpayrollDatabase();
        Employee employee = gpayrollDatabase.getEmployee(empId);
        Assert.assertEquals("Bob",employee.getName());


        PaymentClassifcation pc = employee.getPaymentClassifcation();
        Salariedclassification sc = (Salariedclassification) pc;
        Assert.assertNotNull(sc);
    }

    @Test
    public void payrollTest2 () {
        int empId = 1;
        AddSalaryedEmpTransaction aset = new AddSalaryedEmpTransaction(empId,"Bob",100.00);
        aset.execute();
        Employee employee = GpayrollDatabase.getEmployee(empId);
        Assert.assertEquals("Bob",employee.getName());
//
        Salariedclassification sc = (Salariedclassification) employee.getPaymentClassifcation();
        HoldMethod dm = ((HoldMethod) employee.getPayMentMethod());
        Commissioncheduly cs = (Commissioncheduly) employee.getPaymentSchedule();

//        PaymentSchedule ps = employee.getPaymentSchedule();
//        double salaryOfMonth = sc.getSalaryOfMonth();
//        String account = dm.getAccount();
//        String bank = dm.getBank();
//        double commissionSalary = cs.getCommissionSalary();

//        Assert.assertEquals(salaryOfMonth,aset.getTotalSalary());


    }
}
