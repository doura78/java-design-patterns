package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {

    private static Singleton instance = new Singleton();
    private ResourceBundle configuration;

    private Singleton() {
        this.configuration = ResourceBundle.getBundle("configuration");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getValue(String key) {
        return configuration.getString(key);
    }
}
