package com.triangle.java;

import java.util.Scanner;
public class triangleclass {

	public static void main(String[] args) {

		char reponse = ' ', carac = ' ';
		int mode, modeEtudiant;
		Scanner sc = new Scanner(System.in);
		do {//Boucle principale
			System.out.println("choisir un mode");
			System.out.println("1- Ajout etudiant");
			System.out.println("2- supprimer etudiant");
			System.out.println("3- Moyenne de la Promo");
			System.out.println("4- Quitter");
			mode = sc.nextInt();
			switch (mode) {
			case 1: // ajout etudiant
				do {
					System.out.println("sous menu");
					System.out.println("1- ajout etdudiant");
					System.out.println("2- editer etudiant");
					System.out.println("3- ajout note");
					System.out.println("4- Quitter");
					modeEtudiant = sc.nextInt();
					switch(modeEtudiant) {
					case 1: 
					{
						System.out.println("nom");
						sc.nextLine();
						String nom = sc.nextLine();
						System.out.println("prenom");
						String prenom = sc.nextLine();
						System.out.println("age");
						int age = sc.nextInt();
						Etudiant etu = new Etudiant(nom, prenom, age);
						System.out.println("Information enregistré !");	
						System.out.print(etu.getNom());	
						System.out.println(" \t");		
						System.out.print(etu.getPrenom());
						System.out.println(" \t");
						System.out.print(etu.getAge());	
						System.out.println(" ans");	
						Promotion promotion1 = new Promotion();
						promotion1.ajoutEtudiantDansPromotion(etu);
						break;
					} 
					case 2:{
						Promotion LPAII = new Promotion();
						System.out.println("nom de l'etudiant");	
						String searchNom = sc.nextLine();
						LPAII.findEtudiant(searchNom);
						/*Etudiant etu;
						System.out.println(etu.getNom());
						sc.nextLine();
						String nom = sc.nextLine();
						System.out.println(etu.getPrenom());
						String prenom = sc.nextLine();
						System.out.println(etu.getAge());
						int age = sc.nextInt();
						System.out.println(" ");	
						Etudiant etu = new Etudiant(nom, prenom, age);
						break;*/
					}
					}// 	
				}while (modeEtudiant != 4);//quit
			case 2: //supp etudiant

				break;
			case 3://afficher moyenne promo
				break;			
			}  

		}while (mode != 4);// different de quitter
		System.out.println("Au revoir !");
	}


}
