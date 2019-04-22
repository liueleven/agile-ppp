package com.agile.dev.code.chapter19.database;

import com.agile.dev.code.chapter19.add.Transaction;
import com.agile.dev.code.chapter19.dto.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 一定要写注释啊
 * @date: 2019-04-21 14:31
 * @author: 十一
 */
public class GpayrollDatabase {

    public static Map<Integer,Employee> itsMap = new HashMap<>();

    public static void addEmployee(int empId,Employee employee) {
        itsMap.put(empId,employee);
    }

    public  static Employee getEmployee(int empId) {
        return itsMap.get(empId);
    }


    public static void clear() {

    }


}
