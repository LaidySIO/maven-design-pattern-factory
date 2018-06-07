/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.factory;

import com.cours.entities.Personne;
import org.json.simple.JSONObject;

/**
 *
 * @author elhad
 */
public class ExtractJsonDatas extends AbstractExtractDatas {

    public ExtractJsonDatas() {
        extractDatas();
    }

    @Override
    public final void extractDatas() {
        String methodName = "extractDatas";
    }

    public Personne createPersonneWithObjectAttributes(JSONObject jsonObjectPerson) {
        String methodName = "createPersonneWithObjectAttributes";

        return null;
    }
}
