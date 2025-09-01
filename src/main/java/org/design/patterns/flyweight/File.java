package org.design.patterns.flyweight;

public class File implements Icon {
    String type;
    String image;

    public File(String type, String image) {
        this.type = type;
        this.image = image;
    }

    /**
     * @param x
     * @param y
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing file at " + x + ", " + y);
    }
}
