package com.example.coastecounter.badge;

import java.util.Collection;
import java.util.List;

public class Badgekategorie {

	private int categoryID;

	private String title;

	private String description;

	private Collection<Badge> badges;

	private BadgeKategorieController badgeKategorieController;

	public int getCategoryID() {
		return 0;
	}

	public String getTitle() {
		return null;
	}

	/**
	 *  
	 */
	public void setTitle(String title) {

	}

	public String getDescription() {
		return null;
	}

	/**
	 *  
	 */
	public void setDescription(String description) {

	}

	public List<Badge> getBadges() {
		return null;
	}

	public boolean addBadge(Badge badge) {
		return false;
	}

	public boolean deleteBadge(Badge badge) {
		return false;
	}

}
