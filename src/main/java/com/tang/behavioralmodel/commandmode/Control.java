package com.tang.behavioralmodel.commandmode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weepppp 2022/7/16 8:23
 **/
public class Control {

    public List<Command> commands = new ArrayList<>();

    public Control(List<Command> commands) {
        this.commands.addAll(commands);
    }

    public  void  action(){
        commands.forEach(e -> e.execute());
    }
}
