package edu.gyte.bitirme.arendi.login;

import java.io.Serializable;

public class User implements Serializable{
	private int id ;
	private String name;
	private String email;
	private String password;
	private String telefon;
	private boolean juri ;
	private String firmaadi;
	private int firmaId;
	private String departmanadi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public boolean isJuri() {
		return juri;
	}
	public void setJuri(boolean juri) {
		this.juri = juri;
	}
	public String getFirmaadi() {
		return firmaadi;
	}
	public void setFirmaadi(String firmaadi) {
		this.firmaadi = firmaadi;
	}
	public String getDepartmanadi() {
		return departmanadi;
	}
	public void setDepartmanadi(String departmanadi) {
		this.departmanadi = departmanadi;
	}
	public int getFirmaId() {
		return firmaId;
	}
	public void setFirmaId(int firmaId) {
		this.firmaId = firmaId;
	}
	
	
}