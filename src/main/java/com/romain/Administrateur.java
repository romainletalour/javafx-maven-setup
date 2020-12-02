package com.romain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * Classe Administrateur
 * Classe fille de Personnel
 * Sert a gérer la BDD ainsi que les comptes Utilisateur et Usager
 */

public class Administrateur extends Personnel {
    /**
     * Constructeur de la classe Administrateur
     */
    public Administrateur(String nom, String prenom, String typePersonnel) {
        m_nom = nom;
        m_prenom = prenom;
        m_typePersonnel = typePersonnel;
    }

    /**
     * Méthode vérifier s'il est possible de supprimer un usager de la liste des Abonnés
     * Communique avec la BDD
     */
    public void verifSuppUsager() { //TODO

    }

    /**
     * Méthode pour supprimer un Usager (abonné) de la BDD
     * Communique avec la BDD
     */
    public void suppUsager() { //TODO

    }

    /**
     * Méthode pour verifier média ? (à préciser)
     * type peut etre a modifier
    */
    public void verifMedia() { //TODO

    }

    /**
     * Méthode qui supprime un média de la BDD 
     * pour différentes raisons (perte, vol, casse etc..)
     * Communique avec la BDD
     */
    public void suppMedia() {

    }
}
