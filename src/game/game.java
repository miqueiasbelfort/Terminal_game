package game;

import java.util.Scanner;
import java.io.PrintStream;
import java.util.Random;

public class game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrintStream show = System.out;
		
		show.println("Você quer jogar o jogo!");
		show.print("1 para Sim e 0 para Não: ");
		int userConfirmation = scan.nextInt();
		
		
		if (userConfirmation == 1) {
			
			startGame();
			
		} else {
			show.println("Que pega, se queser tentar o jogo é só rodar o código!");
		}
		
		scan.close();	
	}
	
	public static void startGame() {
		
		Scanner scan = new Scanner(System.in);
		PrintStream show = System.out;
		Random randomNum = new Random();
		
		int randomComputerChoiced = randomNum.nextInt(11);
		
		System.out.print("Escolha um número de 0 a 10: ");
		int userChoiced = scan.nextInt();
		
		if(userChoiced > 10 || userChoiced < 0) {
			show.println("Opá tente um número entre 0 e 10!");
			startGame();
		}else if(userChoiced == randomComputerChoiced) {
			show.println("PARABÉNS VOCÊ ACERTOU!!");
			show.println("O número do computar foi " + randomComputerChoiced + " o seu foi " + userChoiced);
		}
		
		do {
			
			randomComputerChoiced = randomNum.nextInt(11);
			show.print("Que pena número errado! tente novamente: ");
			userChoiced = scan.nextInt();
			
		
		} while (userChoiced != randomComputerChoiced);
		
		
		scan.close();
	}

}
