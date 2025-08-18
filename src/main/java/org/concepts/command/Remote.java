package org.concepts.command;

import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Remote {
    @Setter
    private Map<Integer, Command> slots = new HashMap<>();
    private final Stack<Command> history = new Stack<>();

    public void setCommand(int slot, Command command) { slots.put(slot, command); }
    public void press(int slot) {
        Command cmd = slots.get(slot);
        if(cmd != null) { cmd.execute(); history.push(cmd); }
    }
    public void undo() {
        if(!history.isEmpty()) history.pop().undo();
    }
}
