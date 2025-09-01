package org.design.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Folder fileStructure = new Folder("abc");
        fileStructure.add(new File("def"));
        fileStructure.add(new File("ghi"));

        Folder folder = new Folder("jkl");
        folder.add(new File("mno"));
        folder.add(new File("pqr"));

        fileStructure.add(folder);

        fileStructure.display("");
    }
}
