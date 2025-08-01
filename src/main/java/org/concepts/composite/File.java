package org.concepts.composite;

public class File implements FileStructure {
    String name;

    public File(String name) {
        this.name = name;
    }

    /**
     *
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + this.name);
    }
}
