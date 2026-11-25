package com.example.pharmassist.entity;

import com.example.pharmassist.config.GenerateCustomId;

import jakarta.persistence.*;

@Entity
public class Admin {
	@Id
	@GenerateCustomId
	private String adminId;
	private String adminEmail;
	private String adminPhoneNumber;
	private String adminPassword;


	@OneToOne
	@JoinColumn(name = "pharmacy_id", unique = true)
	private Pharmacy pharmacy;

	@Version
	private Long version;

	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPhoneNumber() {
		return adminPhoneNumber;
	}
	public void setAdminPhoneNumber(String adminPhoneNumber) {
		this.adminPhoneNumber = adminPhoneNumber;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	

}
