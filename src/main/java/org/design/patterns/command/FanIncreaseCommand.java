package org.design.patterns.command;

public class FanIncreaseCommand implements Command {
    private Fan fan;

    public FanIncreaseCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.increase();
    }

    @Override
    public void undo() {
        fan.decrease();
    }

}
