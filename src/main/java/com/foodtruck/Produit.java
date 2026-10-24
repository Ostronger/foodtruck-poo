package com.foodtruck;

public class Produit {
    private String nom;
    private double prix;

    Produit (String nom, double prix){
        this.modifierNom(nom);
        this.modifierPrix(prix);
    }
    
     // méthode modifier nom
    public void modifierNom ( String nouveauNom) {
        String nomNettoye = (nouveauNom != null) ? nouveauNom.strip() : null;
        if (nomNettoye == null || nomNettoye.isBlank()) {
            throw new IllegalArgumentException ("Nom invalide");
        } else {
            this.nom = nomNettoye;
        }
    }

    public void modifierPrix(double nouveauPrix) {
        if (nouveauPrix < 0 || !Double.isFinite(nouveauPrix)) {
            throw new IllegalArgumentException ("Prix invalide");
        }  else {
            this.prix = nouveauPrix;
        }
    }

    // getters 
    public String getNom() {
        return this.nom;
    }

    public double getPrix() {
        return this.prix;
    }

}
