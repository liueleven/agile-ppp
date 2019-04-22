package com.agile.dev.code.chapter19;

import java.util.Date;

/**
 * @description: 时间卡
 * @date: 2019-04-21 11:00
 * @author: 十一
 */
public class TimeCard {

    public void addTimeCard(int empId, Date date,int hours) {
        System.out.println(String.format("登记时间卡：empId: %s，date: %s, hours: %s",empId,date,hours));
    }
}
