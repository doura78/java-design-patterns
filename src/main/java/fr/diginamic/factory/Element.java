package fr.diginamic.factory;

public class Element {

    private String nom;
    private Double valeur;
    private Unite unite;

    public Element(String nom, Double valeur, Unite unite) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public Double getValeur() {
        return valeur;
    }

    public Unite getUnite() {
        return unite;
    }
}