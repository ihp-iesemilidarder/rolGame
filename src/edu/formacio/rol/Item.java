package edu.formacio.rol;

import java.util.Objects;

import edu.formacio.rol.type.typeItem;

public class Item {
	private int id;
	private String name;
	private Enum<typeItem> typeItem;
	private int stars;
	private Boolean active=false;
	
	public Item(int id, String name, Enum<typeItem> typeItem, int stars, Boolean active) {
		this.id = id;
		this.name = name;
		this.typeItem = typeItem;
		this.stars = stars;
		this.active = active;
	}
	
	public Item() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum<typeItem> getTypeItem() {
		return typeItem;
	}

	public void setTypeItem(Enum<typeItem> typeItem) {
		this.typeItem = typeItem;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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
		Item other = (Item) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", typeItem=" + typeItem + ", stars=" + stars + ", active="
				+ active + "]";
	}

	
}
