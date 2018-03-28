package com.triangle.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Etudiant {
	
		private String prenom;
		private String nom;
		private int age;
		private ArrayList<Float> note;
		static Scanner sc = new Scanner(System.in);

		
		
		public static Etudiant ajoutEtudiant(){
			System.out.println("nom");
			String nom = sc.nextLine();
			sc.nextLine();
			System.out.println("prenom");
			String prenom = sc.nextLine();
			System.out.println("age");
			int age = sc.nextInt();
			Etudiant etu = new Etudiant(nom, prenom, age);
			ArrayList<Float> note = new ArrayList<Float>();
			return etu;
		}
			
		public Etudiant(String nom, String prenom, int age)
		{
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;	
			note = new ArrayList<Float>();
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

		public float[] getNotes() {
			int i=0;
			float[] tabNote= {};
			while( i <= this.note.size()) {
				tabNote[i] = note.get(i);
				i++;
			}
			return tabNote;
		}
		
		public Float getNote(int index) {
			return note.get(index);
		}

		public float getMoyenne() {
			int i=0;
			float Note=0;
			while( i <= this.note.size()) {
				Note = Note + note.get(i);
				i++;
			}
			return (Note/this.note.size());
		}

		public void setNote(ArrayList<Float> listNotes) {
				note = listNotes;
		} 
		
		public int getTailleNotes() {
			return note.size();
		}
		
		public boolean equals(Etudiant etu) {
			return ( this.nom.equals(etu.getNom()) && this.prenom.equals(etu.prenom) && this.age == etu.age);
	}
}