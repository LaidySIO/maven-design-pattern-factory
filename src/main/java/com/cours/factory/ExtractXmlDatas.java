/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.factory;

import com.cours.entities.Personne;
import org.w3c.dom.Element;

/**
 *
 * @author elhad
 */
public class ExtractXmlDatas extends AbstractExtractDatas {

    public ExtractXmlDatas() {
        extractDatas();
    }

    @Override
    public final void extractDatas() {
        String methodName = "extractDatas";
    }

    public Personne createPersonneWithObjectAttributes(Element elementPersonne) {
        String methodName = "createPersonneWithObjectAttributes";

        return null;
    }
}
