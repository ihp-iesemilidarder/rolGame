package edu.formacio.rol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import edu.formacio.rol.type.StorageType;
import edu.formacio.rol.type.typeCharacter;
import edu.formacio.rol.type.typeItem;

public class Hero extends Character implements IMechanicPlayer{
	
	private List<Power> powers;
	private Map<StorageType,List<Item>> storage = new HashMap<StorageType,List<Item>>();
	
	public Hero(int id, String name, Enum<typeCharacter> type, int lifePoints,
			List<Power> powers, Map<StorageType,List<Item>> storage) {
		
		super(id,name,type,lifePoints);
		this.powers = powers;
		this.storage = storage;
	}
	
	public Hero(int id, String name, Enum<typeCharacter> type, int lifePoints) {
		super(id,name,type,lifePoints);
	}
	
	public Hero() {
		
	}

	public List<Power> getPowers() {
		return powers;
	}

	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}

	public Map<StorageType, List<Item>> getStorage() {
		return storage;
	}

	public void setStorage(Map<StorageType, List<Item>> storage) {
		this.storage = storage;
	}

	@Override
	public int calculateAttack(Power power) {
		// TODO Auto-generated method stub
		int total = 0;
		// 50 *
		total = (int) (power.getDamagePoints() * (Math.random()));
		return total;
	}

	@Override
	public int calculateAttack() {
		// TODO Auto-generated method stub
		int total = 0;
		
		for(Item item: this.storage.get(StorageType.WEAPONS)) {
			Weapon weapon = (Weapon) item;
			total+=weapon.getDamagePoints();
		}
		
		return total;
	}

	@Override
	public int calculateDefense() {
		// TODO Auto-generated method stub
		int total = 0;
		
		for(Item item: this.storage.get(StorageType.ARMOR)) {
			Armor armor = (Armor) item;
			total+=armor.getDefensePoints();
		}
		return total;
	}
	
	public String print() {
		return "Hero [\n\n powers = "+this.powers+",\n\n"
				+ " storage =\n\t "+this.storage+"]";
	}
	
}
