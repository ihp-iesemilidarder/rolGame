package edu.formacio.rol;

import edu.formacio.rol.type.TypeArmor;
import edu.formacio.rol.type.typeItem;

public class Armor extends Item{
	private Enum<TypeArmor> typeArmor;
	private int defensePoints;
	
	public Armor(int id, String name, int stars, Boolean active,Enum<TypeArmor> typeArmor, int defensePoints) {
		super(id,name,typeItem.DEFENSE,stars,active);
		this.typeArmor = typeArmor;
		this.defensePoints = defensePoints;
	}
	
	public Armor(int id, String name, int stars, Boolean active) {
		super(id,name,typeItem.DEFENSE,stars,active);
	}
	
	public Armor() {
		
	}

	public Enum<TypeArmor> getTypeArmor() {
		return typeArmor;
	}

	public void setTypeArmor(Enum<TypeArmor> typeArmor) {
		this.typeArmor = typeArmor;
	}

	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	@Override
	public String toString() {
		return "Armor [typeArmor=" + typeArmor + ", defensePoints=" + defensePoints + "]";
	}
	
	
}
