package edu.formacio.rol;

import java.util.Objects;

public class Power {
	private int id;
	private String name;
	private int damagePoints;
	
	public Power(int id, String name, int damagePoints) {
		this.id = id;
		this.name = name;
		this.damagePoints = damagePoints;
	}
	
	public Power() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamagePoints() {
		return damagePoints;
	}

	public void setDamagePoints(int damagePoints) {
		this.damagePoints = damagePoints;
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
		Power other = (Power) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Power [id=" + id + ", name=" + name + ", damagePoints=" + damagePoints + "]";
	}
	
}
