package com.ant.domain;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String username;
	private String password;
	private String species;
	private String name;
	private String sex;
	private String certificate;
	private String idNumber;
	private String birth;
	private String telephone;
	private String relevant;
	private String relPhone;
	private String illHistory;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRelevant() {
		return relevant;
	}
	public void setRelevant(String relevant) {
		this.relevant = relevant;
	}
	public String getRelPhone() {
		return relPhone;
	}
	public void setRelPhone(String relPhone) {
		this.relPhone = relPhone;
	}
	public String getIllHistory() {
		return illHistory;
	}
	public void setIllHistory(String illHistory) {
		this.illHistory = illHistory;
	}
	
	
}
