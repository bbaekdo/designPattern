package org.test;

import java.util.Scanner;

import org.game.CoinGame;

public class CoinGameTest {
	public static void main(String[] args) {
		CoinGame coinGame = new CoinGame("Paul", "123");
		
		String userAnswer;
		
		do {
			coinGame.startGame();
			System.out.println("Play again?");
			Scanner playAgain = new Scanner(System.in);
			userAnswer = playAgain.nextLine();
		}while(userAnswer.startsWith("Y") || userAnswer.startsWith("y"));
	}
}
