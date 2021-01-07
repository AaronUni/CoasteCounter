package com.example.coastecounter.park;

import com.example.coastecounter.main.Theme;
import com.example.coastecounter.achterbahn.Achterbahn;
import com.example.coastecounter.benutzer.Parkbetreiber;
import com.example.coastecounter.bewertung.Parkbewertung;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Park {

	private int parkID;

	private String name;

	private String email;

	private String address;

	private String telephone;

	private String fax;

	private String image;

	private int maxGuests;

	private Date openingHours;

	private Date closingHours;

	private int surfaceArea;

	private String description;

	private String website;

	private Collection<Achterbahn> achterbahn;

	private Collection<Achterbahn> coasters;

	private ParkController parkController;

	private ParkView parkView;

	private Parkbewertung parkbewertung;

	private Theme theme;

	private Parkbetreiber owner;

	public int getParkID() {
		return 0;
	}

	public String getName() {
		return null;
	}

	/**
	 *  
	 */
	public void setName(String name) {

	}

	public String getEmail() {
		return null;
	}

	/**
	 *  
	 */
	public void setEmail(String email) {

	}

	public String getAddress() {
		return null;
	}

	/**
	 *  
	 */
	public void setAddress(String address) {

	}

	public String getTelephone() {
		return null;
	}

	/**
	 *  
	 */
	public void setTelephone(String telephone) {

	}

	public String getFax() {
		return null;
	}

	/**
	 *  
	 */
	public void setFax(String fax) {

	}

	/**
	 *  
	 */
	public String getImage() {
		return null;
	}

	/**
	 *  
	 */
	public void setImage(String image) {

	}

	public Theme getTheme() {
		return null;
	}

	/**
	 *  
	 */
	public void setTheme(Theme theme) {

	}

	public int getMaxGuests() {
		return 0;
	}

	/**
	 *  
	 */
	public void setMaxGuests(int maxGuests) {

	}

	public Date getOpeningHours() {
		return null;
	}

	/**
	 *  
	 */
	public void setOpeningHours(Date openingHours) {

	}

	public Date getClosingHours() {
		return null;
	}

	/**
	 *  
	 */
	public void setClosingHours(Date closingHours) {

	}

	public int getSurfaceArea() {
		return 0;
	}

	/**
	 *  
	 */
	public void setSurfaceArea(int surfaceArea) {

	}

	public String getDescription() {
		return null;
	}

	/**
	 *  
	 */
	public void setDescription(String description) {

	}

	public List<Achterbahn> getAchterbahnen() {
		return null;
	}

	public Parkbetreiber getOwner() {
		return null;
	}

	public void setOwner(Parkbetreiber owner) {

	}

	public String getWebsite() {
		return null;
	}

	public void setWebsite(String website) {

	}

}
