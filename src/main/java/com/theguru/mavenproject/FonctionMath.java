/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theguru.mavenproject;

/**
 *
 * @author theguru
 */
public class FonctionMath {
    public static int add(String valeur1, String valeur2) {
        int val1 = Integer.parseInt(valeur1);
        int val2 = Integer.parseInt(valeur2);
        
        return val1 + val2;     
    }
    
    
    //On mets une erreur volontaire dans val2;
        public static int minus(String valeur1, String valeur2) {
        int val1 = Integer.parseInt(valeur1);
        int val2 = Integer.parseInt(valeur2);
        
        return val1 - val2;
    }
        
     public static double divide(String valeur1, String valeur2) {
        int val1 = Integer.parseInt(valeur1);
        int val2 = Integer.parseInt(valeur2);
        
        return (double) val1 / (double) val2;
    }
}
