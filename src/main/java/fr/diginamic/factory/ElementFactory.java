package fr.diginamic.factory;

public class ElementFactory {

    public static Element createElement(TypeElement type, String nom, Double valeur, Unite unite) {
        switch (type) {
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            default:
             throw new IllegalArgumentException("Type d'élément inconnu : " + type);
        }

    }
}

