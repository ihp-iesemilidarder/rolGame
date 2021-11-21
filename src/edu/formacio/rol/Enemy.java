package edu.formacio.rol;

import edu.formacio.rol.type.typeCharacter;

public class Enemy extends Character implements IMechanicPlayer{

	private int attackMin;
	private int attackMax;
	private int DefenseMin;
	private int DefenseMax;
	
	public Enemy(int id, String name, Enum<typeCharacter> type, int lifePoints,
			int attackMin, int attackMax, int DefenseMin, int DefenseMax) {
		super(id,name,type,lifePoints);
		this.attackMin = attackMin;
		this.attackMax = attackMax;
		this.DefenseMax = DefenseMax;
		this.DefenseMin = DefenseMin;
		
	}
	
	public Enemy(int id, String name, Enum<typeCharacter> type, int lifePoints) {
		super(id,name,type,lifePoints);
	}
	
	public Enemy() {
		
	}
	
	public String print() {
		return "Enemy [attackMin=" + this.attackMin + ", attackMax=" + this.attackMax + ", DefenseMin=" + this.DefenseMin
				+ ", DefenseMax=" + this.DefenseMax + "]";
	}

	public int getAttackMin() {
		return attackMin;
	}

	public void setAttackMin(int attackMin) {
		this.attackMin = attackMin;
	}

	public int getAttackMax() {
		return attackMax;
	}

	public void setAttackMax(int attackMax) {
		this.attackMax = attackMax;
	}

	public int getDefenseMin() {
		return DefenseMin;
	}

	public void setDefenseMin(int defenseMin) {
		DefenseMin = defenseMin;
	}

	public int getDefenseMax() {
		return DefenseMax;
	}

	public void setDefenseMax(int defenseMax) {
		DefenseMax = defenseMax;
	}

	@Override
	public int calculateAttack(Power power) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int calculateAttack() {
		// TODO Auto-generated method stub
		int total = 0;
		total = (int) (Math.random() * this.attackMax);
		if(total<this.attackMin) {
			total = 0;
		}
		return total;
	}

	@Override
	public int calculateDefense() {
		// TODO Auto-generated method stub
		int total = 0;
		total = (int) (Math.random() * this.DefenseMax);
		if(total<this.DefenseMin) {
			total = 0;
		}
		return total;
	}
	
}
