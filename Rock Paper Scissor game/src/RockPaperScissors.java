import java.util.Random;  
import java.util.Scanner; 
public class RockPaperScissors {   
	public static void main(String[] args) {     
		Scanner scanner = new Scanner(System.in); 
		while (true) {       
			String[] rps = { "r", "p", "s" }; 
			String ComputerMove = rps[new Random().nextInt(rps.length)];        
			String PlayerMove;
			while (true) {   
				System.out.println(" please enter you'r option Rock , Paper or Scissors ");
				PlayerMove = scanner.nextLine();
				if (PlayerMove.equals("r") || PlayerMove.equals("p") || PlayerMove.equals("s")) {
					break;
				}  
				System.out.print(PlayerMove + " is Invalid Move ");
			}
			System.out.print(" ComputerMove is " + ComputerMove + " ");

			if (PlayerMove.equals(ComputerMove)) {
				System.out.print(" the match is tie ");
			} else if (PlayerMove.equals("r")) {
				if (ComputerMove.equals("p")) {
					System.out.print("you lose");
				} else if (ComputerMove.equals("s")) {
					System.out.print("you win");
				}
			} else if (PlayerMove.equals("p")) {
				if (ComputerMove.equals("s")) {
					System.out.print("you lose");
				} else if (ComputerMove.equals("r")) {
					System.out.print("you win");
				}
			} else if (PlayerMove.equals("s")) {
				if (ComputerMove.equals("r")) {
					System.out.print("you lose");
				} else if (ComputerMove.equals("p")) {
					System.out.print("you win");
				}

			}
			System.out.print("\n");
		}
	}

}
