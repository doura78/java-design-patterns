package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class AppConfig {
    static void main() {

          Singleton singleton = Singleton.getInstance();

          String url = singleton.getValue("db.url");
          String user = singleton.getValue("db.user");
          int password = Integer.parseInt(singleton.getValue("db.password"));

          System.out.println(url);
          System.out.println(user);
          System.out.println(password);
    }
}
