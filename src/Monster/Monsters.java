package Monster;

import java.util.Random;

import entities.MonsterInfo;

public class Monsters {
	Random rand = new Random();
	
	
	private int Hp;
	private String name;
	
	MonsterInfo[] PhysicalMonsters=new MonsterInfo[] {
			new MonsterInfo(80,"Snake"),
			new MonsterInfo(90,"Snake"),
			new MonsterInfo(110,"Snake"),
			new MonsterInfo(120,"Snake"),
			new MonsterInfo(130,"Snake"),
			new MonsterInfo(140,"Snake"),
			new MonsterInfo(150,"Snake"),
			new MonsterInfo(160,"Snake"),
			new MonsterInfo(170,"Snake")
			};
		
	MonsterInfo[] MagicalMonsters=new MonsterInfo[] {
			new MonsterInfo(80,"Magician"),
			new MonsterInfo(90,"Magician"),
			new MonsterInfo(100,"Magician"),
			new MonsterInfo(110,"Magician"),
			new MonsterInfo(120,"Magician"),
			new MonsterInfo(130,"Magician"),
			new MonsterInfo(140,"Magician"),
			new MonsterInfo(150,"Magician"),
			new MonsterInfo(160,"Magician")
			};
	
	
	public void DamageHp(int hp) {
		Hp -= hp;
	}

	public void Generate() {
		int Number=rand.nextInt(9);
		int typeB=rand.nextInt(2);
		if (typeB==0) {
		 this.Hp= MagicalMonsters[Number].getHp();
		 this.name= MagicalMonsters[Number].getName();
		}
		else if (typeB==1) {		
		 this.Hp= PhysicalMonsters[Number].getHp();
		 this.name= PhysicalMonsters[Number].getName();
		}	
	}
	
	public String showInfo() {
		return String.format("Name:%s%nHp:%d%n",this.name,this.Hp);
	}



}
