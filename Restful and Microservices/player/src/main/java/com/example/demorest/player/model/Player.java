package com.example.demorest.player.model;

public class Player {
	private int playerNumber;
	private String playerName;
	private String skills;
	private String country;
	public int getPlayerNumber() {
		return playerNumber;
	}
		
	public Player() {
		super();
	}

	public Player(int playerNumber, String playerName, String skills, String country) {
		super();
		this.playerNumber = playerNumber;
		this.playerName = playerName;
		this.skills = skills;
		this.country = country;
	}


	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerNumber=" + playerNumber + ", playerName=" + playerName + ", skills=" + skills
				+ ", country=" + country + "]";
	}
	
	
	
}
