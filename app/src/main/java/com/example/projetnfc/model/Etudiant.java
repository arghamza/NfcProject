package com.example.projetnfc.model;

import androidx.annotation.NonNull;

public class Etudiant {

    private String id;
    private String nom;
    private String prenom;
    private String groupe;
    public Etudiant(String id, String nom, String prenom, String groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }
    public Etudiant() {
    }

    @NonNull
    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", groupe='" + groupe + '\'' +
                "} ";
    }
}
