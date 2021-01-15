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
		return parkID;
	}

	public void setParkID(int parkID) {
		this.parkID = parkID;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getMaxGuests() {
		return maxGuests;
	}

	public void setMaxGuests(int maxGuests) {
		this.maxGuests = maxGuests;
	}

	public Date getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(Date openingHours) {
		this.openingHours = openingHours;
	}

	public Date getClosingHours() {
		return closingHours;
	}

	public void setClosingHours(Date closingHours) {
		this.closingHours = closingHours;
	}

	public int getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Collection<Achterbahn> getAchterbahn() {
		return achterbahn;
	}

	public void setAchterbahn(Collection<Achterbahn> achterbahn) {
		this.achterbahn = achterbahn;
	}

	public Collection<Achterbahn> getCoasters() {
		return coasters;
	}

	public void setCoasters(Collection<Achterbahn> coasters) {
		this.coasters = coasters;
	}

	public ParkController getParkController() {
		return parkController;
	}

	public void setParkController(ParkController parkController) {
		this.parkController = parkController;
	}

	public ParkView getParkView() {
		return parkView;
	}

	public void setParkView(ParkView parkView) {
		this.parkView = parkView;
	}

	public Parkbewertung getParkbewertung() {
		return parkbewertung;
	}

	public void setParkbewertung(Parkbewertung parkbewertung) {
		this.parkbewertung = parkbewertung;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Parkbetreiber getOwner() {
		return owner;
	}

	public void setOwner(Parkbetreiber owner) {
		this.owner = owner;
	}

	public Park(int parkID, String name, String email, String address, String telephone, String fax, String image, int maxGuests,
				Date openingHours, Date closingHours, int surfaceArea, String description, String website, Collection<Achterbahn> achterbahn,
				Collection<Achterbahn> coasters,  Parkbewertung parkbewertung, Theme theme,
				Parkbetreiber owner) {
		this.parkID = parkID;
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
		this.fax = fax;
		this.image = image;
		this.maxGuests = maxGuests;
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		this.surfaceArea = surfaceArea;
		this.description = description;
		this.website = website;
		this.achterbahn = achterbahn;
		this.coasters = coasters;
		this.parkController = parkController;
		this.parkView = parkView;
		this.parkbewertung = parkbewertung;
		this.theme = theme;
		this.owner = owner;
	}
}
