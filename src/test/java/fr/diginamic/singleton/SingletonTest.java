package fr.diginamic.singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    @Test
    public void doitRetournerLeMemeInstance() {
        assertSame(instance1, instance2);
    }
    @Test
    public void doitRetournerUrlConfiguration() {
        Singleton singleton = Singleton.getInstance();

        String urlAttendue = "jdbc:mysql://localhost:3306/mydatabase";

        String urlObtenue = singleton.getValue("db.url");

        assertEquals(urlAttendue, urlObtenue);
    }

    private void assertEquals(String urlAttendue, String urlObtenue) {

    }

}
