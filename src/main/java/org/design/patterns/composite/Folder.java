package org.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileStructure{
    private final String name;
    private final List<FileStructure> fileStructures;

    public Folder(String name) {
        this.name = name;
        fileStructures = new ArrayList<>();
    }

    /**
     *
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileStructure fs : fileStructures) {
            fs.display(indent + "    ");
        }
    }

    public void add(FileStructure fileStructure) {
        fileStructures.add(fileStructure);
    }

    public void remove(FileStructure fileStructure) {
        fileStructures.remove(fileStructure);
    }
}
