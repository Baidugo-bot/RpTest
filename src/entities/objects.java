package entities;

import java.util.Random;
import java.util.Scanner;

public class objects {
Random rand = new Random();
  private String player; //Nome
  private String Class; //Classe do jogador //vantagem em rolagem,dano, etc
  private String Power; //Poder(bonus) (vantagem em dado,dano, etc) (Ideia:dano padrao+bonus+classe)
  public String Skill; //SKill utilizada
  
 
  
  public objects(String player, String class1, String power) {
	super();
	this.player = player;
	this.Class = class1;
	this.Power = power;
}
  
  public objects(String class1, String power) {
	super();
	this.Class = class1;
	this.Power = power;
}

public void setSkill(String skill) {
	  this.Skill=skill;
  }

public void setName(String name) {
	  this.player=player;
}


public String getPlayer() {
	return player;
}

public String getPClass() {
	return Class;
}

public String getPower() {
	return Power;
}

public double D20Roll() {
	int Vant=(this.Power=="Precision")? 2:0;
	return rand.nextInt(20)+Vant;
	 
}
  
  public  void Skill() {
	  Scanner sc = new Scanner(System.in);
	  switch(this.Class.toLowerCase()) {
	  case "warrior": 
		  SkillLectureWarrior();
		  break;
	  case "archer": 
		  SkillLectureArcher();
		  break;
	  case "mage":
		  SkillLectureMage();
		  break;
	  default:
		  while (this.Class!="warrior" && this.Class!="archer" && this.Class!="mage" ) {
			  System.out.println("Invalid Class, choose a valid one:");
			  this.Class=sc.next();
		  }
		  Skill();
		  break;
	  }
	  
  }
  
  
  public void SkillLectureWarrior() {
	  switch (this.Skill) {
	  case "1":
		  
		  break;  
	  case "2":
		  
		  break;
	  case "3":
		  
		  break;
	  }
  }
  
  public void SkillLectureArcher() {
switch (this.Skill) {
      case "1":
    	  
	    break;  
      case "2":
    	  
	    break;
      case "3":
    	  
	    break;
	  }
  }
  
  public void SkillLectureMage() {
switch (this.Skill) {
    case "1":
    	
     break;  
    case "2":
    	
     break;
    case "3":
    	
     break;
	  }


  }
}
