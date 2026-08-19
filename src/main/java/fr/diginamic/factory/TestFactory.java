package fr.diginamic.factory;

public class TestFactory {
    static void main() {


        Element ingredient = ElementFactory.createElement(TypeElement.INGREDIENT, "Sucre", 100.0, Unite.MILLI_GRAMMES);
        Element additif = ElementFactory.createElement(TypeElement.ADDITIF, "E330", 50.0, Unite.MILLI_GRAMMES);
        Element allergene = ElementFactory.createElement(TypeElement.ALLERGENE, "Gluten", 10.0, Unite.MICRO_GRAMMES);

        System.out.println(ingredient.getClass().getSimpleName() + ": " + ingredient.getNom() + ", " + ingredient.getValeur() + " " + ingredient.getUnite());
        System.out.println(additif.getClass().getSimpleName() + ": " + additif.getNom() + ", " + additif.getValeur() + " " + additif.getUnite());
        System.out.println(allergene.getClass().getSimpleName() + ": " + allergene.getNom() + ", " + allergene.getValeur() + " " + allergene.getUnite());
    }
}
