package edu.formacio.rol;

import edu.formacio.rol.type.TypeWeapon;
import edu.formacio.rol.type.typeItem;

public class Weapon extends Item{
	private Enum<TypeWeapon> type;
	private int velocity=1;
	private int damagePoints;
	
	public Weapon(int id, String name, int stars, Boolean active,Enum<TypeWeapon> type, int velocity, int damagePoints) {
		super(id,name,typeItem.ATTACK,stars,active);
		this.type = type;
		this.velocity = velocity;
		this.damagePoints = damagePoints;
	}
	
	public Weapon(int id, String name, int stars, Boolean active) {
		super(id,name,typeItem.ATTACK,stars,active);
	}
	
	public Weapon() {
		
	}

	public Enum<TypeWeapon> getType() {
		return type;
	}

	public void setType(Enum<TypeWeapon> type) {
		this.type = type;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int getDamagePoints() {
		return damagePoints;
	}

	public void setDamagePoints(int damagePoints) {
		this.damagePoints = damagePoints;
	}

	@Override
	public String toString() {
		return "Weapon [type=" + type + ", velocity=" + velocity + ", damagePoints=" + damagePoints + "]";
	}
	
}
