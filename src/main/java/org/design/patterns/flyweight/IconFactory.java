package org.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private Map<String, Icon> icons = new HashMap<>();

    public Icon getIcon(String key) {
        Icon icon = icons.get(key);
        if (icon != null) {
            return icon;
        }

        if(key.equals("file")) {
            icon = new File("document", "document.png");
        } else if(key.equals("folder")) {
            icon = new Folder("folder.png", "yellow");
        }

        icons.put(key, icon);

        return icon;
    }

    public Image loadImage(String imageName) {
        return new Image(imageName);
    }

}
