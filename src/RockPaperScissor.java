import java.util.Scanner;

public class RockPaperScissor {
	static String playerName1; // made them static so multiple methods can use them.
	static String playerName2;
	static int counterPlayer1 = 0; // made them static so multiple methods can use them.
	static int counterPlayer2 = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // reads the input written in console.

		System.out.println("Time to play Rock Paper Scissors!"); // greeting and create names for the players
		System.out.println("Player 1 enter your Name. ");
		playerName1 = scan.nextLine().toUpperCase();
		System.out.println("Your name is: " + playerName1); // the chosen name for player1 is displayed in all caps

		System.out.println("Player 2 enter your Name. ");
		playerName2 = scan.nextLine().toUpperCase();
		System.out.println("Your name is: " + playerName2); // the chosen name for player2 is displayed in all caps

		while (counterPlayer1 < 3 && counterPlayer2 < 3) { // first to 3 wins

			System.out.println(playerName1 + " choose: 1 Rock, 2 Scissor or 3 Paper. ");
			String P1 = scan.nextLine().toLowerCase(); // Player1 weapon choice
			System.out.println(playerName2 + " choose: 1 Rock, 2 Scissor or 3 Paper. ");
			String P2 = scan.nextLine().toLowerCase(); // Player2 weapon choice
			ChooseWinner(P1, P2); // calling the method into the loop in Main()
		}
	}

	public static void ChooseWinner(String Player1, String Player2) {
		if (Player1.equals(Player2)) { // both players pick the same weapon = draw.
			System.out.println("Draw!");
			return; // if a draw happens the round will re-start.
		}
		switch (Player1) {
		case "1": // two cases to check if the input rock was selected for player 1
		case "rock": //
			if (Player2.equals("2") || Player2.equals("scissor")) { // player2 picks scissor against rock, player1 wins.
				counterPlayer1++; // counter for player1 +1.
				System.out.println(playerName1 + " wins");
			}

			else { // player2 picked 3,"paper" and wins.
				counterPlayer2++; // counter for player2 +1.
				System.out.println(playerName2 + " wins");
			}
			break;
		case "2": // two cases to check if the input scissor was selected for player 1
		case "scissor":
			if (Player2.equals("3") || Player2.equals("paper")) { // player2 picks paper against scissor, player1 wins
				// Player1 wins
				counterPlayer1++; // counter for player1 +1.
				System.out.println(playerName1 + " wins");
			}

			else {
				// player2 picked 1, "rock" and win
				counterPlayer2++; // counter for player2 +1.
				System.out.println(playerName2 + " wins");
			}
			break;
		case "3": // two cases to check if the input paper was selected for player 1
		case "paper":
			if (Player2.equals("1") || Player2.equals("rock")) { // player2 picks rock against paper, player1 wins
				// Player1 wins
				counterPlayer1++; // counter for player1 +1.
				System.out.println(playerName1 + " wins");
			}

			else {
				// player2 picked 2, "scissor" and win
				counterPlayer2++; // counter for player2 +1.
				System.out.println(playerName2 + " wins");
			}
			break;
		 default:
			 System.out.println("Please pick a real weapon.");
		}

	}
}
