package com.triangle.java;

import java.util.ArrayList;

public class Etudiant{
	private String nom, prenom;
	private int age;
	private ArrayList notes;


	public Etudiant(String nom, String prenom, int age)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;	
		notes = new ArrayList();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Etudiant o) {
		return (o.getAge()== this.getAge() && o.getNom().equals(this.getNom()) && o.getPrenom().equals(this.getPrenom()));
	}

	public int [] getNotes() {
		int [] n = new int [notes.size()];
		for (int i = 0; i < notes.size(); i++) {
			Integer uneNote = (Integer) notes.get(i);
			n[i] = uneNote.intValue();
		}
		return n;
	}
	
	public float moyenne() {
		int [] n = getNotes();
		float cum = (float) 0.0;
		for (int i = 0; i < n.length; i++) {
			cum += n[i];
		}
		return  cum / (float) n.length;
	}
	
	public void ajouterNote(int _note) {
		notes.add(_note);
	}
}
/*
System.out.println("Création d'un etudiant !");
System.out.println("nom");
String nom = sc.nextLine();
System.out.println("prenom");
String prenom = sc.nextLine();
System.out.println("age");
int age = sc.nextInt();
System.out.println("sexe M ou F");
char sexe = sc.nextLine().charAt(0);
return */