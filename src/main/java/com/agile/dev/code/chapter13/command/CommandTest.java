package com.agile.dev.code.chapter13.command;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 11:24
 * @author: 十一
 */
public class CommandTest {

    public static void main(String[] args) {
        CommandTest ct = new CommandTest();
        ct.work(new RelayOnCommand());
    }

    public void work(Command command) {
        command.todo();
    }
}
