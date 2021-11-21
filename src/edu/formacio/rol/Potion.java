package edu.formacio.rol;

import edu.formacio.rol.type.typeItem;

public class Potion extends Item{
	private int curativePoints;
	private int incrementAttackPoints;
	private int defenseAttackPoints;
	private int duration;
	
	public Potion(int id, String name, int stars, Boolean active,
			int curativePoints, int incrementAttackPoints, int defenseAttackPoints, int duration) {
		
		super(id,name,typeItem.ENHANCINGFORCE,stars,active);
		this.curativePoints = curativePoints;
		this.incrementAttackPoints = incrementAttackPoints;
		this.defenseAttackPoints = defenseAttackPoints;
		this.duration = duration;
	}
	
	public Potion(int id, String name, int stars, Boolean active) {
		super(id,name,typeItem.ENHANCINGFORCE,stars,active);
	}
	
	public Potion() {
		
	}

	public int getCurativePoints() {
		return curativePoints;
	}

	public void setCurativePoints(int curativePoints) {
		this.curativePoints = curativePoints;
	}

	public int getIncrementAttackPoints() {
		return incrementAttackPoints;
	}

	public void setIncrementAttackPoints(int incrementAttackPoints) {
		this.incrementAttackPoints = incrementAttackPoints;
	}

	public int getDefenseAttackPoints() {
		return defenseAttackPoints;
	}

	public void setDefenseAttackPoints(int defenseAttackPoints) {
		this.defenseAttackPoints = defenseAttackPoints;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Potion [curativePoints=" + curativePoints + ", incrementAttackPoints=" + incrementAttackPoints
				+ ", defenseAttackPoints=" + defenseAttackPoints + ", duration=" + duration + "]";
	}
	
}
