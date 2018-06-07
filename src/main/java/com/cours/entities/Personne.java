package com.cours.entities;

import java.text.DecimalFormat;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ElHadji
 */
public class Personne implements Comparable {

    protected int idPersonne;
    protected String prenom;
    protected String nom;
    protected double poids;
    protected double taille;
    protected String rue;
    protected String ville;
    protected String codePostal;
    protected final DecimalFormat df = new DecimalFormat("#.#"); // Arrondir à 1 chriffre apres la virgule

    public Personne(int idPersonne, String prenom, String nom, double poids, double taille, String rue, String ville, String codePostal) {
        this.idPersonne = idPersonne;
        this.prenom = prenom;
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public double getImc() {
        double imc = 0;

        imc = this.poids / (Math.pow(this.taille, 2));

        return imc;
    }

    public boolean isMaigre() {
        double imc = 0;
        boolean isMaigre = false;

        imc = this.getImc();
        if (imc >= 16.5 && imc <= 18.5) {
            isMaigre = true;
        }

        return isMaigre;
    }

    public boolean isSurPoid() {
        double imc = 0;
        boolean isSurPoid = false;

        imc = this.getImc();
        if (imc >= 25 && imc <= 30) {
            isSurPoid = true;
        }

        return isSurPoid;
    }

    public boolean isObese() {
        double imc = 0;
        boolean isObese = false;

        imc = this.getImc();
        if (imc > 30 && imc <= 35) {
            isObese = true;
        }

        return isObese;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Personne{" + "idPersonne=" + idPersonne + ", prenom=" + prenom + ", nom=" + nom + ", poids=" + df.format(poids) + ", taille=" + taille + ", rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + '}';
    }
    
    // Comparation des ID
    @Override
    public int compareTo(Object o) {
        if (this.idPersonne == ((Personne) o).idPersonne) {
            return 0;
        } else if (this.idPersonne < ((Personne) o).idPersonne) {
            return 1;
        } else {
            return -1;
        }
    }

    public static Comparator<Personne> SortByFirstNameAsc = new Comparator<Personne>() {

        @Override
        public int compare(Personne p1, Personne p2) {
            return p1.prenom.compareTo(p2.prenom);
        }
    };
    
    public static Comparator<Personne> SortByFirstNameDesc = new Comparator<Personne>() {

        @Override
        public int compare(Personne p1, Personne p2) {
            return p2.prenom.compareTo(p1.prenom);
        }
    };
    
    public static Comparator<Personne> SortByLastNameAsc = new Comparator<Personne>() {

        @Override
        public int compare(Personne p1, Personne p2) {
            return p1.nom.compareTo(p2.nom);
        }
    };
    
    public static Comparator<Personne> SortByLastNameDesc = new Comparator<Personne>() {

        @Override
        public int compare(Personne p1, Personne p2) {
            return p2.nom.compareTo(p1.nom);
        }
    };
    
    
}
