package Clases;

import java.util.ArrayList;

public class Usuario {
	int doc;
	String correo, nom, contr;
	public Usuario(int doc, String correo, String nom, String contr) {
		super();
		this.doc = doc;
		this.correo = correo;
		this.nom = nom;
		this.contr = contr;
	}
	public int getDoc() {
		return doc;
	}
	public void setDoc(int doc) {
		this.doc = doc;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getContr() {
		return contr;
	}
	public void setContr(String contr) {
		this.contr = contr;
	}
	

	}
	
