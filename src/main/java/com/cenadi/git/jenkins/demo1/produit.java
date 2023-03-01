/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cenadi.git.jenkins.demo1;

/**
 *
 * @author Moussa Housseini
 */
public class produit {

   private String intitule ;
   private String quantite;
   private String description ;

    public produit() {
    }

    public produit(String intitule, String quantite, String description) {
        this.intitule = intitule;
        this.quantite = quantite;
        this.description = description;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getQuantite() {
        return quantite;
    }

    public String getDescription() {
        return description;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
}
