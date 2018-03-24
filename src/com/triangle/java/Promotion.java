package com.triangle.java;

import java.util.ArrayList;

public class Promotion extends triangleclass {
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();

	public void ajoutEtudiant(String nom, String prenom, int age){
		System.out.println("Création d'un etudiant !");
		Etudiant etu = new Etudiant(nom, prenom, age);
//etudiants.get(0);
	}
	public void ajoutEtudiantDansPromotion(Etudiant etu) {
		etudiants.add(etu);
	}
	
	public Etudiant findEtudiant(Etudiant etudiantToFind) {
		for (Etudiant etudiant : etudiants) {
			if(etudiant.equals(etudiantToFind)) {
				return etudiant;
			}
		}
		return null;
	}
}

