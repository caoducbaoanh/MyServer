package com.demo.etities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Thue")
public class User implements Serializable {
	@Id
	private String id;
	private String identityID;
	private String citizenName;
	private String password;
	private String phoneNumber;
	private String dateOfPayment;
	private String typeOfHouse;
	private double fee;
	private String amountToPay;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public String getTypeOfHouse() {
		return typeOfHouse;
	}
	public void setTypeOfHouse(String typeOfHouse) {
		this.typeOfHouse = typeOfHouse;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getAmountToPay() {
		return amountToPay;
	}
	public void setAmountToPay(String amountToPay) {
		this.amountToPay = amountToPay;
	}
	
	
}
