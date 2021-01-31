//Muhammad Ali 21-11097
import java.util.*;
public class tictactoe {
	static String[] slots= {"0","1","2","3","4","5","6","7","8"};
	static Scanner turn= new Scanner(System.in);
	
	public static void main(String[] args) {
		gameon();
	  }
	
	public static void box() {
		String[] slots= {"0","1","2","3","4","5","6","7","8"};
	}
	public static void printBoard() {
		System.out.print("\n+-------------+\n");
		System.out.print(" | "+slots[0]+" | "+slots[1]+" | "+slots[2]+" |");
		System.out.print("\n+-------------+\n");
		System.out.print(" | "+slots[3]+" | "+slots[4]+" | "+slots[5]+" |");
		System.out.print("\n+------------+\n");
		System.out.print(" | "+slots[6]+" | "+slots[7]+" | "+slots[8]+" |");
		System.out.print("\n+-------------+\n");
		
	}
	
	public static void gameon() {
		printBoard();
		System.out.println("\nPlayer 1 turn(enter the number of slot where you want to mark): ");
		int player1=turn.nextInt();
		check1(player1);
		printBoard();
		System.out.println("\nPlayer 2 turn(enter the number of slot where you want to mark): ");
		int player2=turn.nextInt();
		check2(player2);
		printBoard();
		gameon();
		
	}
	
	public static void check1(int x) {
		String val=String.valueOf(x);
		if(slots[x].contains(val)) {
			slots[x]="x";
			checkWin("1");
		}
		else {
			System.out.print("Already marked, please try again");
			for(int v=0;v==slots.length;v++) {
				if(slots[v]!="1" && slots[v]!="2" && slots[v]!="3" && slots[v]!="4" && slots[v]!="5" && slots[v]!="6" && slots[v]!="7" && slots[v]!="8" && slots[v]!="0") {
					System.out.println("\nIt's a draw, good game\n");
					System.out.println("\npress 0 to exit or 1 to restart\n");
					int a=turn.nextInt();
					if(a==0) {
						System.exit(0);
					}
					box();
					gameon();
				}
				;
			}
			int player1=turn.nextInt();
			check1(player1);
		}
	}
	
	public static void check2(int x) {
		String val2=String.valueOf(x);
		if(slots[x].contains(val2)) {
			slots[x]="o";
			checkWin("2");
		}
		else {
			System.out.print("Already marked, please try again");
			for(int v=0;v==slots.length;v++) {
				if(slots[v]!="1" && slots[v]!="2" && slots[v]!="3" && slots[v]!="4" && slots[v]!="5" && slots[v]!="6" && slots[v]!="7" && slots[v]!="8" && slots[v]!="0") {
					System.out.println("\nIt's a draw, good game\n");
					System.out.println("\npress 0 to exit or 1 to restart\n");
					int a=turn.nextInt();
					if(a==0) {
						System.exit(0);
					}
					box();
					gameon();
				}
				;
			}
			int player2=turn.nextInt();
			check1(player2);
		}
	}
	
	public static void checkWin(String s) {
		if(slots[0]==slots[1] && slots[1]==slots[2]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[0]==slots[1] && slots[1]==slots[2]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[3]==slots[4] && slots[4]==slots[5]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[6]==slots[7] && slots[7]==slots[8]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[0]==slots[3] && slots[3]==slots[6]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[1]==slots[4] && slots[4]==slots[7]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[2]==slots[5] && slots[5]==slots[8]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[0]==slots[4] && slots[4]==slots[8]) {
			System.out.println("The winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else if(slots[2]==slots[4] && slots[4]==slots[6]) {
			System.out.println("\nThe winner is player "+s+"\n");
			System.out.println("press 0 to exits or 1 to play again: ");
			int b=turn.nextInt();
			if(b==0) {
				System.exit(0);
			}
			box();
			gameon();
		}
		else{
			System.out.println("\nNext player turn\n");
		}
	}
	
}
