package com.exemple;

/**
 * Classe utilitaire simple pour démonstration.
 */
public class App {

    /**
     * Additionne deux nombres.
     * @param a Premier nombre.
     * @param b Deuxième nombre.
     * @return La somme de a et b.
     */
    public int additionner(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        int resultat = app.additionner(5, 3);
        System.out.println("Résultat : " + resultat);
    }
}