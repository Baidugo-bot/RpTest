package entities;

public class MonsterInfo {
  private int Hp;
  private String name;
public MonsterInfo(int hp, String name) {
	Hp = hp;
	this.name = name;
}
public int getHp() {
	return Hp;
}
public String getName() {
	return name;
}
}
