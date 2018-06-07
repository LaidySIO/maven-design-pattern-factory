/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.main;

import com.cours.entities.Personne;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author elhad
 */
public class MainFactory {

    private static final Log log = LogFactory.getLog(MainFactory.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("\n\n personnes : " + FactoryExtract.getDatas(1).getPersonnes());
        //System.out.println("\n\n personnes : " + FactoryExtract.getDatas(1).getPersonnes());
        //System.out.println("\n\n personnes : " + FactoryExtract.getDatas(1).getPersonnes());
        //System.out.println("\n\n personnes : " + FactoryExtract.getDatas(1).getPersonnes());
        
        for (Personne p : initPersonnes()) {
            System.out.println(p.toString());
        }
        
        List<Personne> l = initPersonnes();
        
        sortByFirstNameAsc(l);
        System.err.println("sortByFirstNameAsc");
        for (Personne p : l) {
            System.out.println(p.toString());
        }
        
        sortByFirstNameDesc(l);
        System.err.println("sortByFirstNameDesc");
        for (Personne p : l) {
            System.out.println(p.toString());
        }
        
        sortByLastNameAsc(l);
        System.err.println("sortByLastNameAsc");
        for (Personne p : l) {
            System.out.println(p.toString());
        }
        sortByLastNameDesc(l);
        System.err.println("sortByLastNameDesc");
        for (Personne p : l) {
            System.out.println(p.toString());
        }
        
        
    }
    
    // Fonction qui parse une ligne de fichier text en Personne 
    public static Personne lineToPersonne(String line) {
            String personneAttr[] = null;
            Personne personne = null;
            line = line.replaceAll(", ", ","); //ON supperime les espaces après les virgules
            personneAttr = line.split(",");
            personne = new Personne(Integer.parseInt(personneAttr[0]), 
                                personneAttr[1],
                                personneAttr[2],
                                Double.parseDouble(personneAttr[3]),
                                Double.parseDouble(personneAttr[4]),
                                personneAttr[5],
                                personneAttr[6],
                                personneAttr[7]);

            return personne;
        }
    /**
     * Méthode qui init 20 personnes
     *
     * @return Une liste de 20 personnes
     */
    public static List<Personne> initPersonnes() {
        List<Personne> personnes = null;
        BufferedReader br = null;
        String ligne = null;

        // try/catch du clear de la liste des personnes
        try {
            personnes.clear();
        } catch (Exception e) {
            System.out.println("1 ère initilaisation des personnes");
        }
        // try/catch de la lecture du fichier personnes.txt          
        try {
            File file = new File("personnes.txt");
            br = new BufferedReader(new FileReader(file));
            personnes = new ArrayList<>();
            while ((ligne = br.readLine()) != null) {
                personnes.add(lineToPersonne(ligne)); // 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return personnes;
    }

    /**
     * Méthode qui trie une liste de personnes par prénom croissant
     *
     * @param liste La liste à trier
     * @return La liste triée par prénom croissant
     */
    public static List<Personne> sortByFirstNameAsc(List<Personne> liste) {
        List<Personne> sortedList = liste;
        
        Collections.sort(sortedList, Personne.SortByFirstNameAsc);
        return sortedList;
    }

    /**
     * Méthode qui trie une liste de personnes par prénom décroissant
     *
     * @param liste La liste à trier
     * @return La liste triée par prénom décroissant
     */
    public static List<Personne> sortByFirstNameDesc(List<Personne> liste) {
        List<Personne> sortedList = liste;
        
        Collections.sort(sortedList, Personne.SortByFirstNameDesc);
        return sortedList;
    }

    /**
     * Méthode qui trie une liste de personnes par nom croissant
     *
     * @param liste La liste à trier
     * @return La liste triée par nom croissant
     */
    public static  List<Personne> sortByLastNameAsc(List<Personne> liste) {
        List<Personne> sortedList = liste;
        
        Collections.sort(sortedList, Personne.SortByLastNameAsc);
        return sortedList;
    }

    /**
     * Méthode qui trie une liste de personnes par nom décroissant
     *
     * @param liste La liste à trier
     * @return La liste triée par nom décroissant
     */
    public static  List<Personne> sortByLastNameDesc(List<Personne> liste) {
        List<Personne> sortedList = liste;
        
        Collections.sort(sortedList, Personne.SortByLastNameDesc);
        return sortedList;
    }
}

