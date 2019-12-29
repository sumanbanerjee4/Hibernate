package com.example.hibernateExample;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "T_Submenu")
public class SubMenu implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SUBMENU_DESC", nullable=false, length=50)
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name ="FK_MainMenuId")
	private MainMenu mainMenu;
	
	public SubMenu() {
		
	}
	
	public SubMenu(String description, MainMenu mainMenu) {
		this.description = description;
		this.mainMenu = mainMenu;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MainMenu getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(MainMenu mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	
	
	

}
