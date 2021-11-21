package edu.formacio.rol;

import java.util.Objects;

public class Game {
	private String namePlayer;
	
	public Game(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	public String getNamePlayer() {
		return namePlayer;
	}

	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(namePlayer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(namePlayer, other.namePlayer);
	}

	@Override
	public String toString() {
		return "Game [namePlayer=" + namePlayer + "]";
	}

	public static int attack( Hero attacker, Enemy opponent) {
		int opponentLife = (int) opponent.getLifePoints();
		int attackPoints = attacker.calculateAttack();
		int opponentDefense = opponent.calculateDefense();
		if (opponentLife < 0) {
			return 0;
		}
		System.out.println("\t========== Hero ==========");
		System.out.println("\tEnemy Life: "+opponentLife);
		System.out.println("\tHero tattackPoints: "+attackPoints);
		System.out.println("\tEnemy opponentDefense: "+opponentDefense);
		
		opponentLife+=opponentDefense;
		opponent.setLifePoints(opponentLife-attackPoints);
		return opponentLife;
	}
	public static int attack( Enemy attacker, Hero opponent) {
		int opponentLife = (int) opponent.getLifePoints();
		int attackPoints = attacker.calculateAttack();
		int opponentDefense = opponent.calculateDefense();
		
		if (opponentLife <=0) {
			return 0;
		}
		System.out.println("\t========== Enemy ==========");
		System.out.println("\tHero Life: "+opponentLife);
		System.out.println("\tEnemy tattackPoints: "+attackPoints);
		System.out.println("\tHero opponentDefense: "+opponentDefense);
		
		opponentLife+=opponentDefense;
		opponent.setLifePoints(opponentLife-attackPoints);
		if (opponentLife < 0) {
			opponentLife = 0;
		}
		return opponentLife;
	}
	
	public void fight(Hero hero, Enemy enemy) {
		int heroLifePoints = (int) hero.getLifePoints();
		int enemyLifePoints = (int) enemy.getLifePoints();
		int count = 0;
		while (heroLifePoints != 0 && enemyLifePoints != 0) {
			System.out.println("HERO LIFE: "+heroLifePoints);
			System.out.println("ENEMY LIFE: "+enemyLifePoints);
			System.out.println("=============== Turno "+(count+=1)+" ===============");
			enemyLifePoints = attack(hero,enemy);
			heroLifePoints = attack(enemy,hero);
			System.out.println("Points enemy: "+enemyLifePoints);
			System.out.println("Points hero: "+heroLifePoints);
		}
		if (heroLifePoints<=0) {
			System.out.println("El heroe ha muerto");
		}else if(enemyLifePoints<=0) {
			System.out.println("El enemigo ha muerto");
		}
	}
	
}
