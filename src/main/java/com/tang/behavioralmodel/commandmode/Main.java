package com.tang.behavioralmodel.commandmode;

/**
 * @author weepppp 2022/7/16 8:00
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * @功能: 命令模式
 * 命令是对命令的封装，每一个命令都是一个操作，请求方发出请求，接收方接收请求，并执行操作。命令模式解耦了请求方和接收方式
 */
public class Main {
    public static void main(String[] args) {
        Command openCommand = new OpenCommand();
        Command changeCommand = new ChangeCommand();
        List<Command> list = new ArrayList<>();
        list.add(changeCommand);
        list.add(openCommand);
        Control control = new Control(list);
        control.action();
    }
}
