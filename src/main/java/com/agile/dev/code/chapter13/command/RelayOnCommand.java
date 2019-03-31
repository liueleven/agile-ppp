package com.agile.dev.code.chapter13.command;


import com.agile.dev.code.chapter13.command.Command;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 11:23
 * @author: 十一
 */
public class RelayOnCommand implements Command {

    @Override
    public void todo() {
        System.out.println("call RelayOnCommand.tod() ...");
    }
}
