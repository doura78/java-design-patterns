package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

public class Ingredient extends Element {
    public Ingredient(String nom, Double valeur, Unite unite) {
        super(nom, valeur, unite);
    }
}
