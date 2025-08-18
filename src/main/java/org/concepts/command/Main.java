package org.concepts.command;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        remote.setCommand(0, lightOn);
        remote.press(0);
        remote.undo();
    }
}
