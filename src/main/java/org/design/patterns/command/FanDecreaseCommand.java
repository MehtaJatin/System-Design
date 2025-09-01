package org.design.patterns.command;

public class FanDecreaseCommand implements Command {
    private Fan fan;
    public FanDecreaseCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("Fan Decrease");
    }

    @Override
    public void undo() {
        System.out.println("Fan Increase");
    }
}
