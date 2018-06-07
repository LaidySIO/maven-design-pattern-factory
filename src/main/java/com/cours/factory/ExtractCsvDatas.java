/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.factory;

import com.cours.entities.Personne;

/**
 *
 * @author elhad
 */
public class ExtractCsvDatas extends AbstractExtractDatas {

    public ExtractCsvDatas() {
        extractDatas();
    }

    public Personne createPersonneWithObjectAttributes(String[] attributs) {
        String methodName = "createPersonneWithObjectAttributes";
        return null;
    }

    @Override
    public final void extractDatas() {
        String methodName = "extractDatas";
    }

}
