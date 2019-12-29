package com.example.hibernateExample;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	MainMenuRepository mainMenuRepository;
	
	@Autowired
	SubMenuRepository subMenuRepository;

	@Transactional
	public void addMenu(){
		// For User MainMenu
		 MainMenu menu1 = new MainMenu("User");
		 //Creating sub-menus for user
		 Set subMenu1 = new HashSet<SubMenu>();
		 subMenu1.add(new SubMenu("Manager", menu1));
		 subMenu1.add(new SubMenu("Administrator", menu1));
		 subMenu1.add(new SubMenu("Student", menu1));
		 menu1.setSubMenu(subMenu1);
		 
		// For Courses MainMenu
				 MainMenu menu2 = new MainMenu("Course");
				 //Creating sub-menus for user
				 Set subMenu2 = new HashSet<SubMenu>();
				 subMenu2.add(new SubMenu("B-Tech", menu2));
				 subMenu2.add(new SubMenu("BCA", menu2));
				 subMenu2.add(new SubMenu("MBA", menu2));
				 menu2.setSubMenu(subMenu2);
				 
		// For Department MainMenu
				 MainMenu menu3 = new MainMenu("Department");
				 //Creating sub-menus for user
				 Set subMenu3 = new HashSet<SubMenu>();
				 subMenu3.add(new SubMenu("Accounts", menu3));
				 subMenu3.add(new SubMenu("Information Technology", menu3));
				 subMenu3.add(new SubMenu("Sports", menu3));
				 menu3.setSubMenu(subMenu3);
		
	   //Save Menu & Sub Menu via Menu Entity
		 Set mainMenu = new HashSet<MainMenu>();
		 mainMenu.add(menu1);
		 mainMenu.add(menu2);
		 mainMenu.add(menu3);
	   mainMenuRepository.saveAll(mainMenu);
	      
	    	
	}


}
