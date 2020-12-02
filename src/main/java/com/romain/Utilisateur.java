package com.romain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * Classe Utilisateur correspondant au bibliothécaires
 * Classe fille de la classe Personnel
 * Permet une gestion des abonnés ainsi que des médias dans la BDD
 */

public class Utilisateur extends Personnel {
    /**
     * Constructeur de la classe Utilisateur
     */
    public Utilisateur(String nom, String prenom, String typePersonnel) {
        m_nom = nom;
        m_prenom = prenom;
        m_typePersonnel = typePersonnel;
    }

    public void verifUsager() { //TODO

    }

    public void associeMediaUsager() {

    }
}
