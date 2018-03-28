package com.triangle.java;

import java.util.*;

public class Promotion {
	static Scanner sc = new Scanner(System.in);
	
	private String nom;
	private String annee;
	private static ArrayList<Etudiant> listEtudiants;

	public Promotion() {
		listEtudiants = new ArrayList<Etudiant>();
	}

	public void ajoutEtudiantDansPromotion(Etudiant etu) {
		listEtudiants.add(etu);
	}
	
	public Etudiant findEtudiant(Etudiant etudiantToFind) {
		for (Etudiant etudiant : listEtudiants) {
			if(etudiant.equals(etudiantToFind)) {
				return etudiant;
			}
			
		}
		return null;
	}

	public Etudiant getEtudiant(int index){
		return listEtudiants.get(index);
	}

	public int getTailleListe() {
		return listEtudiants.size();
	}

	public static void suppEtudiant(Etudiant etu) {
		if(etu  != null) {
			listEtudiants.remove(etu);
				System.out.println("Etudiant bien supprimé");
			}else {
				System.out.println("Etudiant pas trouvé");
			}
	}
}