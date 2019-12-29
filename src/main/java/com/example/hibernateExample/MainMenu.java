package com.example.hibernateExample;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_Menu")
public class MainMenu implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String description;
	
	@OneToMany(mappedBy="mainMenu", cascade = CascadeType.ALL)
	Set<SubMenu> subMenu = new HashSet<SubMenu>();

	public MainMenu() {
		
	}
	
	public MainMenu(String description) {
		this.description = description;
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

	public Set<SubMenu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(Set<SubMenu> subMenu) {
		this.subMenu = subMenu;
	}
	
	
	

}
