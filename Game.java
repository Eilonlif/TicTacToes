package idanTicTacToes;

import java.util.*;
public class Game {
	public static Scanner in = new Scanner(System.in);
	public Board b = new Board();
	public Player p1 = new Player("O");
	public Player p2 = new Player("X");
	
	
	public void play(){
		b.create();
		int whoTurn = 1;  // 1: X, 0: O.
		Player[] playerAry = {this.p1, this.p2};
		for(int i = 0; i < b.width*b.height; i++){
			if(whoTurn == 1){ whoTurn = 0; }
			else{ whoTurn = 1; }

			b = playerAry[whoTurn].turn(b);
			b.print();

			if (b.checkWin().equals("X") || b.checkWin().equals("O")) {
				System.out.println("Player " + b.checkWin() + " Won! ");
				return;
			}
			if (b.checkFinish()){
				System.out.println("Board is full! ");
				return;
			}
		}
	}
}
