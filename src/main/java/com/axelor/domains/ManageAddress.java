package com.axelor.domains;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ManageAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Aid;
	private String Address;
	
	@ManyToOne
	private ContactDetails cd;
	
	public ContactDetails getCd() {
		return cd;
	}
	public void setCd(ContactDetails cd) {
		this.cd = cd;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	
	
	}
	
}
