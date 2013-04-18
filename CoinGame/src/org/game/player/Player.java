package org.game.player;

public class Player {

	private String name = "";
	private String coinOption = "";
	
	public String[] coinValue = {"Head", "Tail"};
	
	public Player(String playerName) {
		// TODO Auto-generated constructor stub
		name = playerName;
	}

	public String getRandCoinOption() {
		// TODO Auto-generated method stub
		int randNum = (Math.random() < 0.5)? 0: 1;
		
		coinOption = coinValue[randNum];
		
		return coinOption;
	}

	public void setCoinOption(String playerPick) {
		// TODO Auto-generated method stub
		coinOption = (playerPick == "Head")? "Tail": "Head";
		
	}

	public void didPlayerWin(String winning) {
		// TODO Auto-generated method stub
		if(coinOption == winning) {
			System.out.println(name + " won with" +coinOption);
		} else {
			System.out.println(name + " lost with" +coinOption);			
		}
	}

}
