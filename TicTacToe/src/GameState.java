import java.util.Scanner;

public class GameState {

	boolean winningConditionPlayerX = false;
	boolean winningConditionPlayerO = false;
	boolean turnPlayerX = false;
	boolean turnPlayerO = false;

	Spielfeld playingField;

	public void startGame() {
		playingField = new Spielfeld();
		winningConditionPlayerX = false;
		winningConditionPlayerO = false;

		System.out.println("Welcher Spieler beginnt? Tippe X oder Tippe O:");
		Scanner scanner = new Scanner(System.in);

		while (turnPlayerX == false && turnPlayerO == false) {
			String s = scanner.next();
			setFirstTurn(s);
		}

		while (winningConditionPlayerX == false && winningConditionPlayerO == false) {
			if (turnPlayerX && !turnPlayerO) {
				playingField.printField();
				System.out.println("Spieler X, auf welchem Feld möchtest du dein X setzen?");
				String s = scanner.next();
				while (!playingField.setSpielfeldSpielerX(s)) {
					System.out.println("Spieler X, auf welchem Feld möchtest du dein X setzen?");
					playingField.printField();
					s = scanner.next();
				}
				turnPlayerX = !turnPlayerX;
				turnPlayerO = !turnPlayerO;
			} else {
				playingField.printField();
				System.out.println("Spieler O, auf welchem Feld möchtest du dein O setzen?");
				String s = scanner.next();
				while (!playingField.setSpielfeldSpielerO(s)) {
					System.out.println("Spieler O, auf welchem Feld möchtest du dein O setzen?");
					playingField.printField();
					s = scanner.next();
				}
				turnPlayerX = !turnPlayerX;
				turnPlayerO = !turnPlayerO;
			}
			checkWinningConditions(playingField);
			
		}
		if (winningConditionPlayerX)
		{
			playingField.printField();
			System.out.println("Game Over! Spieler X hat gewonnen!");
		}
		if (winningConditionPlayerO)
		{
			playingField.printField();
			System.out.println("Game Over! Spieler O hat gewonnen!");
		}
		scanner.close();
	}

	private void checkWinningConditions(Spielfeld playingField) {
		winningConditionPlayerX = checkWinningConditionX(playingField);
		winningConditionPlayerO = checkWinningConditionO(playingField);
	}

	private boolean checkWinningConditionO(Spielfeld playingField) {

		// Reihe 1
		if ((playingField.getSpielfeldAtPoint(1).equals("O")) && (playingField.getSpielfeldAtPoint(2).equals("O"))
				&& (playingField.getSpielfeldAtPoint(3).equals("O"))) {
			return true;
		}
		// Reihe 2
		if ((playingField.getSpielfeldAtPoint(4).equals("O")) && (playingField.getSpielfeldAtPoint(5).equals("O"))
				&& (playingField.getSpielfeldAtPoint(6).equals("O"))) {
			return true;
		}
		// Reihe 3
		if ((playingField.getSpielfeldAtPoint(7).equals("O")) && (playingField.getSpielfeldAtPoint(8).equals("O"))
				&& (playingField.getSpielfeldAtPoint(9).equals("O"))) {
			return true;
		}
		// Zeile 1
		if ((playingField.getSpielfeldAtPoint(1).equals("O")) && (playingField.getSpielfeldAtPoint(4).equals("O"))
				&& (playingField.getSpielfeldAtPoint(7).equals("O"))) {
			return true;
		}
		// Zeile 2
		if ((playingField.getSpielfeldAtPoint(2).equals("O")) && (playingField.getSpielfeldAtPoint(5).equals("O"))
				&& (playingField.getSpielfeldAtPoint(8).equals("O"))) {
			return true;
		}
		// Zeile 3
		if ((playingField.getSpielfeldAtPoint(3).equals("O")) && (playingField.getSpielfeldAtPoint(6).equals("O"))
				&& (playingField.getSpielfeldAtPoint(9).equals("O"))) {
			return true;
		}
		// Diagonal 1
		if ((playingField.getSpielfeldAtPoint(1).equals("O")) && (playingField.getSpielfeldAtPoint(5).equals("O"))
				&& (playingField.getSpielfeldAtPoint(9).equals("O"))) {
			return true;
		}
		// Diagonal 2
		if ((playingField.getSpielfeldAtPoint(3).equals("O")) && (playingField.getSpielfeldAtPoint(5).equals("O"))
				&& (playingField.getSpielfeldAtPoint(7).equals("O"))) {
			return true;
		}
		return false;
	}

	private boolean checkWinningConditionX(Spielfeld playingField) {
		// Reihe 1

		if ((playingField.getSpielfeldAtPoint(1).equals("X")) && (playingField.getSpielfeldAtPoint(2).equals("X"))
				&& (playingField.getSpielfeldAtPoint(3).equals("X"))) {
			return true;
		}
		// Reihe 2
		if ((playingField.getSpielfeldAtPoint(4).equals("X")) && (playingField.getSpielfeldAtPoint(5).equals("X"))
				&& (playingField.getSpielfeldAtPoint(6).equals("X"))) {
			return true;
		}
		// Reihe 3
		if ((playingField.getSpielfeldAtPoint(7).equals("X")) && (playingField.getSpielfeldAtPoint(8).equals("X"))
				&& (playingField.getSpielfeldAtPoint(9).equals("X"))) {
			return true;
		}
		// Zeile 1
		if ((playingField.getSpielfeldAtPoint(1).equals("X")) && (playingField.getSpielfeldAtPoint(4).equals("X"))
				&& (playingField.getSpielfeldAtPoint(7).equals("X"))) {
			return true;
		}
		// Zeile 2
		if ((playingField.getSpielfeldAtPoint(2).equals("X")) && (playingField.getSpielfeldAtPoint(5).equals("X"))
				&& (playingField.getSpielfeldAtPoint(8).equals("X"))) {
			return true;
		}
		// Zeile 3
		if ((playingField.getSpielfeldAtPoint(3).equals("X")) && (playingField.getSpielfeldAtPoint(6).equals("X"))
				&& (playingField.getSpielfeldAtPoint(9).equals("X"))) {
			return true;
		}
		// Diagonal 1
		if ((playingField.getSpielfeldAtPoint(1).equals("X")) && (playingField.getSpielfeldAtPoint(5).equals("X"))
				&& (playingField.getSpielfeldAtPoint(9).equals("X"))) {
			return true;
		}
		// Diagonal 2
		if ((playingField.getSpielfeldAtPoint(3).equals("X")) && (playingField.getSpielfeldAtPoint(5).equals("X"))
				&& (playingField.getSpielfeldAtPoint(7).equals("X"))) {
			return true;
		}
		return false;
	}

	public void setFirstTurn(String player) {
		if (player.equals("X") || player.equals("x")) {
			turnPlayerX = true;
			turnPlayerO = false;
		}
		if (player.equals("O") || player.equals("o")) {
			turnPlayerX = false;
			turnPlayerO = true;
		}
		if (!player.equals("O") && !player.equals("X") && !player.equals("x") && !player.equals("o")) {
			System.out.println("Hey! Es gibt nur die Wahl zwischen X und O!");
			System.out.println("Also Nochmal: Welcher Spieler beginnt? Tippe X oder Tippe O:");
		}
	}

}
