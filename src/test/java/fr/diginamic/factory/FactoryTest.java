package fr.diginamic.factory;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void doitCreerUnAdditif() {
        Element element = ElementFactory.createElement(TypeElement.ADDITIF, "E100", 0.5, Unite.MILLI_GRAMMES);
        assertTrue(element instanceof Additif);

    }

    private void assertTrue(boolean b) {

    }

    @Test
    public void doitCreerUnAllergene() {
        Element element = ElementFactory.createElement(TypeElement.ALLERGENE, "E100", 0.5, Unite.MICRO_GRAMMES);
        assertTrue(element instanceof Allergene);
    }
    @Test
    public void doitCreerUnIngredient() {
        Element element = ElementFactory.createElement(TypeElement.INGREDIENT, "E100", 0.5, Unite.MILLI_GRAMMES);
        assertTrue(element instanceof Ingredient);

    }

}
