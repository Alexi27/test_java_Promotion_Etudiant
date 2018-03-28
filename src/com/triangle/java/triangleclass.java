package com.triangle.java;

import java.util.Scanner;
public class triangleclass {

	public static void main(String[] args) {

		Promotion promotion1 = new Promotion();
		Scanner sc = new Scanner(System.in);
		int modeEtudiant;
		do {
			System.out.println("Menu :");
			System.out.println("1- Creation Etudiant");
			System.out.println("2- Supprimer étudiant");
			System.out.println("3- Afficher Notes étudiants");
			System.out.println("4- Quitter");
			modeEtudiant = sc.nextInt();

			switch(modeEtudiant) {
			case 1:
				System.out.println("Création d'un etudiant !");
				Etudiant etu = Etudiant.ajoutEtudiant();
				promotion1.ajoutEtudiantDansPromotion(etu);
				System.out.println("Information enregistré !");	
				System.out.print(etu.getNom());	
				System.out.println(" \t");		
				System.out.print(etu.getPrenom());
				System.out.println(" \t");
				System.out.print(etu.getAge());	
				System.out.println(" ans");	
				break;
			case 2:
				System.out.println("information de l'etudiant !");
				etu = Etudiant.entrertEtudiant();
				Etudiant searchetu = promotion1.findEtudiant(etu);
				Promotion.suppEtudiant(searchetu);
				break;
			case 3:
				//etu.afficherNote(etu);
				break;
			}
		}while(modeEtudiant != 4);
	}
}
