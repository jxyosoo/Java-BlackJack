package blackJack;

import java.util.*;
public class blackJack{
	public static void main(String[]args) {
		// int card = cardDraw();
		//System.out.println("Their card will be " + card);
		int playerPoints = 0;
		int dealerPoints = 0;
		try (Scanner ScannerName = new Scanner(System.in)) {
			boolean playerStand = false;
			boolean dealerStand = false;
			System.out.println("Players starting cards are: ");
			playerPoints += cardDraw();
			playerPoints += cardDraw();
			System.out.println("The Player has: " + playerPoints);
			System.out.println("Dealer starting cards are: ");
			dealerPoints += cardDraw();
			dealerPoints += cardDraw();
			System.out.println("The Dealer has: " + dealerPoints);
			while(playerStand == false && dealerStand == false) {
				if(playerStand == false) {
					
				
					System.out.println("Would you like to hit or stand? : ");
					String input = ScannerName.nextLine();
					if(input.equals("Hit")) {
						playerPoints += cardDraw();
						System.out.println(playerPoints);
						if(playerPoints >= 22) {
							System.out.println("The player has busts. The Dealer Wins.");
							playerStand = true;
							break;
						}

					}
					if(input.equals("Stand")) {
						playerStand = true;
					}
					if(input.equals("Quit")) {
						break;
					}
				} else {
					System.out.println("The player has stood.");
				}
				if(dealerStand == false) {
					if(dealerPoints <= 16) {
						dealerPoints += cardDraw();
						System.out.println(dealerPoints);
					}
					else if (dealerPoints >= 17){
						System.out.println("Dealer Stands");
						dealerStand = true;
					}
					if(dealerPoints >= 22) {
						System.out.println("The Dealer has busts. The player Wins.");
						playerStand = true;
					break;
					}	
					
				}
				System.out.println("The Player has: " + playerPoints);
				System.out.println("The Dealer has: " + dealerPoints);
				while(playerStand == true) {
				  if(playerPoints == 21 && dealerPoints == 21) {
					 System.out.println("The game has ended in a Tie. You may now Start a New Round");
					 break;
				 }
				 else if( dealerPoints > playerPoints) {
					System.out.println("The Dealer has won");
					break;
				}
				 else if(dealerPoints < playerPoints) {
					System.out.println("The Player has won");
					break;
				}
				 else {
					System.out.println("The game has ended in a Tie. You may Start a new Round");
					break;
				 	}
				}
				
			}
		}
		
	}
	public static int cardDraw() {
		Random rand = new Random();
		int a = rand.nextInt(12) + 2;
		if(a == 2) {
			System.out.println("A player pulls a 2");
		}
		if(a == 3) {
			System.out.println("A player pulls a 3");
		}
		if(a == 4) {
			System.out.println("A player pulls a 4");
		}
		if(a == 5) {
			System.out.println("A player pulls a 5");
		}
		if(a == 6) {
			System.out.println("A player pulls a 6");
		}
		if(a == 7) {
			System.out.println("A player pulls a 7");
		}
		if(a == 8) {
			System.out.println("A player pulls a 8");
		}
		if(a == 9) {
			System.out.println("A player pulls a 9");
		}
		if(a == 10) {
			System.out.println("A player pulls a 10");
		}
		if(a == 11) {
			System.out.println("A player pulls a Jack");
			a = 10;
		}
		if(a == 12) {
			System.out.println("A player pulls a Queen");
			a = 10;
		}
		if(a == 13) {
			System.out.println("A player pulls a King");
			a = 10;
		}
		if(a == 14) {
			System.out.println("A player pulls a Ace");
			a = 1;
		}
		return a;
		
		
		
	}
}