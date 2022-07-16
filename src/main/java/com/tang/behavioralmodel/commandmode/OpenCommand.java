package com.tang.behavioralmodel.commandmode;

/**
 * @author weepppp 2022/7/16 8:10
 **/

/**
 * 功能：打开电视机
 */
public class OpenCommand implements Command {
    private TV tv = new TV();

    public void execute() {
        tv.open();
    }
}
