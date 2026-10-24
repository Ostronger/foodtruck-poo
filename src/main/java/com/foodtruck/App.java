package com.foodtruck;

public class App {
    public static void main(String[] args) {
        Produit burger = new Produit ("Burger",10.0);

        System.out.println("Ce produit " + burger.getNom() + " vaut " + burger.getPrix());

       
        
        try {
            System.out.println("Tentative de création avec un nombre négatif");
            Produit coca = new Produit ("Coca", - 5.0);
            System.out.println("Prix :" + coca.getPrix());

        } catch (IllegalArgumentException e) {
            System.err.println("Erreur capturée :"  + e.getMessage());

        }
        System.out.println("Fin du programme");
          
    }
}
