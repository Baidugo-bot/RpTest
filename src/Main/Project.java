package Main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import Monster.Monsters;
import entities.objects;

import java.util.Random;
public class Project {

	public static void main(String[] args) {
		objects Player; //nome da classe para atribuir variaveis de classe ao Player
		Random rand = new Random();
		String player = null;
		int a=rand.nextInt(2);
		System.out.println(a+" Player"); //Estado: arrumar informacoes,e formas de retirar hp em turnos
		Locale.setDefault(Locale.US);   //tem o DamageHp, mas como aplicar?
		Scanner sc = new Scanner(System.in);//nas skills colocar pra retirar
		Monsters Monster=new Monsters();   //DamageHp(dano da skill)
		Monster.Generate();
		System.out.println(Monster.showInfo());
		System.out.println("Hello Sumonner!");
		System.out.println("The game will begin, choose your class");
		
		System.out.println("Warrior-Melee|Physical|");
		
		System.out.println("Archer-Ranged|Physical|");
		
		System.out.println("Mage-Ranged|Magic|");
		
		String Class=sc.next();
		
		System.out.println("Set your power(Bonus): ");
		
		System.out.println("Gold- Every battle will reward at least 2 Gold");
		
		System.out.println("Exp- Each battle will reward base xp plus *");
		
		System.out.println("Defense- When in combat, you will ignore 2 damage for every enemy attack ");
		
		System.out.println("Precision- +2 To the precision Rolls");
		
		String Power=sc.next();
		
		Player= new objects(Class,Class,Power);
		
		System.out.println("Set your name(y/n)?:");
		char YoN=sc.next().charAt(0);
		if(YoN=='y') {
			while(player==null) {
				sc.nextLine();
				System.out.println("Enter your name:");
				player=sc.nextLine();
				Player.setName(player);
			}
		}
			else {
				System.out.println("Okay..default name will be "+Player.getPClass());
		}
		
		sc.close();
	}
	
	
	public static void reLecture(String Thing,String[] args) {
		while(1==1) {
			
		}
	}
}
	//lista com monstros e tipos de mosntros CHECK
     //magicos e de armadura, if magico girar um deles CHECK
	//magico leva +dano de fisical e vice versa
    //sobre a vantagem/poder D=padrao+bonus, arranjar um jeito de identificar o contexto de roll
   //e dps da batalha arranjar jeito de ir cidade/loja/nova batalha
   //matriz serviria pra arrumar nomes com hps?
  //Dar opcoes de pos batalha(Rp:dar opcoes de roll e a historia fica pelo mestre|Loja:Variedade de itens|Moonstros:gira novo monstro)