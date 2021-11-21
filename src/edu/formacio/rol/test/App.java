package edu.formacio.rol.test;
import java.util.*;
import edu.formacio.rol.*;
import edu.formacio.rol.type.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HERO
			Hero hero1 = new Hero(1,"Ivancito",typeCharacter.ELF,50);
		
			// Powers
				List<Power> listPowers = new ArrayList<Power>();
				
				Power poder1 = new Power(1,"power1",50);
				Power poder2 = new Power(2,"power2",76);
				Power poder3 = new Power(3,"power3",59);
				
				listPowers.add(poder1);
				listPowers.add(poder2);
				listPowers.add(poder3);
				
				hero1.setPowers(listPowers);
				
			// Items
				Map<StorageType,List<Item>> mapList = new HashMap<StorageType,List<Item>>();
				
				//Potions
					List<Item> listPotions = new ArrayList<Item>();
					
					Potion item1 = new Potion(1,"item1",5,true,40,70,10,4);
					Potion item2 = new Potion(1,"item2",5,true,50,80,22,5);
					Potion item3 = new Potion(1,"item3",5,true,60,90,30,4);
					
					listPotions.add(item3);
					listPotions.add(item2);
					listPotions.add(item3);
					
					mapList.put(StorageType.POTIONS,listPotions);
					
				//Weapons
					List<Item> listWeapons = new ArrayList<Item>();
					
					Weapon item4 = new Weapon(1,"item1",5,true,TypeWeapon.CROSSBOW,2,50);
					Weapon item5 = new Weapon(2,"item2",5,true,TypeWeapon.AX,2,50);
					Weapon item6 = new Weapon(3,"item3",5,true,TypeWeapon.SWORD,2,50);
					
					listWeapons.add(item4);
					listWeapons.add(item5);
					listWeapons.add(item6);
					
					mapList.put(StorageType.WEAPONS,listWeapons);
	
				//Armors
					List<Item> listArmors = new ArrayList<Item>();
					
					Armor item7 = new Armor(1,"item1",5,true,TypeArmor.CHESTARMOR,5);
					Armor item8 = new Armor(1,"item1",5,true,TypeArmor.GLOVE,5);
					Armor item9 = new Armor(1,"item1",5,true,TypeArmor.SHIELD,5);
					
					listArmors.add(item7);
					listArmors.add(item8);
					listArmors.add(item9);
					
					mapList.put(StorageType.ARMOR,listArmors);
					
					
				hero1.setStorage(mapList);
			
		// Enemy
			
			Enemy enemy1 = new Enemy(1,"Enemigo",typeCharacter.ELF,100);
			enemy1.setDefenseMax(10);
			enemy1.setDefenseMin(5);
			enemy1.setAttackMin(20);
			enemy1.setAttackMax(40);
			enemy1.setLifePoints(500);
			
		System.out.println(hero1.toString());
		System.out.println(hero1.print());
		
		System.out.println(enemy1.toString());
		System.out.println(enemy1.print());
		
		Game juego = new Game("jugador1");
		juego.fight(hero1, enemy1);
		
		
	}

}
