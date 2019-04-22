package com.agile.dev.code.chapter19.payment;

/**
 * @description: 直接存入银行账户
 * @date: 2019-04-21 11:38
 * @author: 十一
 */
public class DirectMethod implements PayMentMethod{

    private String bank;

    private String account;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
