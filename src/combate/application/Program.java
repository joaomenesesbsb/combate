package combate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import combate.entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite os dados do primeiro campeão: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Vida inicial: ");
			int life =sc.nextInt();
			System.out.print("Ataque: ");
			int attack = sc.nextInt();
			System.out.print("Armadura: ");
			int armor = sc.nextInt();
			System.out.println();
			
			Champion championA = new Champion(name, life, attack, armor);
			
			System.out.println("Digite os dados do segundo campeão: ");
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Vida inicial: ");
			life =sc.nextInt();
			System.out.print("Ataque: ");
			attack = sc.nextInt();
			System.out.print("Armadura: ");
			armor = sc.nextInt();
			System.out.println();
			
			Champion championB = new Champion(name, life, attack, armor);
			
			
		
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n ; i++ ) {
			System.out.println("Resultado do turno " + i + ": ");
			championA.takeDamage(championB);
			championB.takeDamage(championA);
			System.out.println(championA.status());
			System.out.println(championB.status());
			System.out.println();
			if (championA.getLife() == 0 || championB.getLife() == 0) {
				i = n;
			}
			}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}

}
