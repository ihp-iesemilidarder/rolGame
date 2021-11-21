package edu.formacio.rol;

import java.util.Objects;

import edu.formacio.rol.type.typeCharacter;

public class Character {
	private int id;
	private String name;
	private Enum<typeCharacter> type;
	private int lifePoints;
	
	public Character(int id, String name, Enum<typeCharacter> type, int lifePoints) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.lifePoints = lifePoints;
	}
	public Character() {
		
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enum<typeCharacter> getType() {
		return type;
	}
	public void setType(Enum<typeCharacter> type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + ", type=" + type + ", lifePoints=" + lifePoints + "]";
	}
	
	
}
