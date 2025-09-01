package org.design.patterns.flyweight;

public class Folder implements Icon {
    private String imageName;
    private String color;

    public Folder(String imageName, String color) {
        this.imageName = imageName;
        this.color = color;
    }
    /**
     * @param x
     * @param y
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing folder at " + x + ", " + y);
    }
}
