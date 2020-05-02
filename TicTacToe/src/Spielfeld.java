import java.util.Arrays;

public class Spielfeld {
	private String[][] spielfeld = new String[3][3];

	public Spielfeld() {
		spielfeld[0][0] = "1";
		spielfeld[0][1] = "2";
		spielfeld[0][2] = "3";
		spielfeld[1][0] = "4";
		spielfeld[1][1] = "5";
		spielfeld[1][2] = "6";
		spielfeld[2][0] = "7";
		spielfeld[2][1] = "8";
		spielfeld[2][2] = "9";
	}

	public String[][] getSpielfeld() {
		return spielfeld;
	}

	public void printField() {
		System.out.println(Arrays.deepToString(spielfeld[0]));
		System.out.println(Arrays.deepToString(spielfeld[1]));
		System.out.println(Arrays.deepToString(spielfeld[2]));
	}

	public String getSpielfeldAtPoint(int zahl) {
		switch (zahl) {
		case 1:
			if (this.spielfeld[0][0] == "X")
				return "X";
			if (this.spielfeld[0][0] == "O")
				return "O";
			if (!(this.spielfeld[0][0] == "O" && this.spielfeld[0][0] == "X"))
				return this.spielfeld[0][0];
			
		case 2:
			if (this.spielfeld[0][1] == "X")
				return "X";
			if (this.spielfeld[0][1] == "O")
				return "O";
			if (!(this.spielfeld[0][1] == "O" && this.spielfeld[0][1] == "X"))
				return this.spielfeld[0][1];
			
		case 3:
			if (this.spielfeld[0][2] == "X")
				return "X";
			if (this.spielfeld[0][2] == "O")
				return "O";
			if (!(this.spielfeld[0][2] == "O" && this.spielfeld[0][2] == "X"))
				return this.spielfeld[0][2];
			
		case 4:
			if (this.spielfeld[1][0] == "X")
				return "X";
			if (this.spielfeld[1][0] == "O")
				return "O";
			if (!(this.spielfeld[1][0] == "O" && this.spielfeld[1][0] == "X"))
				return this.spielfeld[1][0];
			
		case 5:
			if (this.spielfeld[1][1] == "X")
				return "X";
			if (this.spielfeld[1][1] == "O")
				return "O";
			if (!(this.spielfeld[1][1] == "O" && this.spielfeld[1][1] == "X"))
				return this.spielfeld[1][1];
			
		case 6:
			if (this.spielfeld[1][2] == "X")
				return "X";
			if (this.spielfeld[1][2] == "O")
				return "O";
			if (!(this.spielfeld[1][2] == "O" && this.spielfeld[1][2] == "X"))
				return this.spielfeld[1][2];
			
		case 7:
			if (this.spielfeld[2][0] == "X")
				return "X";
			if (this.spielfeld[2][0] == "O")
				return "O";
			if (!(this.spielfeld[2][0] == "O" && this.spielfeld[2][0] == "X"))
				return this.spielfeld[2][0];

		case 8:
			if (this.spielfeld[2][1] == "X")
				return "X";
			if (this.spielfeld[2][1] == "O")
				return "O";
			if (!(this.spielfeld[2][1] == "O" && this.spielfeld[2][1] == "X"))
				return this.spielfeld[2][1];
			
		case 9:
			if (this.spielfeld[2][2] == "X")
				return "X";
			if (this.spielfeld[2][2] == "O")
				return "O";
			if (!(this.spielfeld[2][2] == "O" && this.spielfeld[2][2] == "X"))
				return this.spielfeld[2][2];
		default:
			return null;
		}
	}

	public boolean setSpielfeldSpielerX(String feld) {
		try {
			Integer zahl = Integer.parseInt(feld);
			switch (zahl) {
			case 1:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[0][0] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 2:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[0][1] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 3:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[0][2] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 4:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[1][0] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 5:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[1][1] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 6:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[1][2] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 7:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[2][0] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 8:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[2][1] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 9:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[2][2] = "X";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			default:
				System.out.println("Hey! Wähle ein Feld von 1 bis 9!");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Die Zahl ist zu groß!");
			return false;
		}
	}

	public boolean setSpielfeldSpielerO(String feld) {
		try {
			Integer zahl = Integer.parseInt(feld);

			switch (zahl) {
			case 1:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[0][0] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 2:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[0][1] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 3:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[0][2] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 4:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[1][0] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 5:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[1][1] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 6:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[1][2] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 7:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[2][0] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 8:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[2][1] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			case 9:
				if ((this.getSpielfeldAtPoint(zahl) != "X" && (this.getSpielfeldAtPoint(zahl) != "O"))) {
					this.spielfeld[2][2] = "O";
					return true;
				} else {
					System.out.println("Hey! Wähle ein freies Feld auf dem Spielfeld!");
					return false;
				}
			default:
				System.out.println("Hey! Wähle ein Feld von 1 bis 9!");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Die Zahl ist zu groß!");
			return false;
		}
	}
}
