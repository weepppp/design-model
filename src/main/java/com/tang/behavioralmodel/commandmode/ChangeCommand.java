package com.tang.behavioralmodel.commandmode;

/**
 * @author weepppp 2022/7/16 8:14
 **/
public class ChangeCommand implements Command {
    private TV tv = new TV();

    public void execute() {
        tv.change();
    }
}
