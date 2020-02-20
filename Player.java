package idanTicTacToes;

import java.util.Scanner;

public class Player {
	public static Scanner in = new Scanner(System.in);
	
	public String sign;
	
	public Player(String s){
		this.sign = s;
	}
	
	public Board turn(Board b1){
		int x = (int)(Math.random()*b1.width);
		int y = (int)(Math.random()*b1.height);
		while(b1.board[y][x].equals("O") || b1.board[y][x].equals("X")){
			x = (int)(Math.random()*b1.width);
			y = (int)(Math.random()*b1.height);

		}
//		System.out.println("Y: ");
//		y = in.nextInt();
//
//		System.out.println("X: ");
//		x = in.nextInt();

		b1.board[y][x] = this.sign;
		System.out.println("X: " + x + ", Y: " + y +  ", who: " +  this.sign);
		return b1;
		
	}
}
