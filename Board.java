package idanTicTacToes;

import java.util.*;

public class Board {
	public int width = 3;
	public int height = 3;
	public String [] [] board = new String [width] [height];
	
	public void print(){
		for(int i = 0; i < board.length; i++){
			System.out.println(Arrays.toString(board[i]));
		}
		System.out.println();
	}
	
	public void create(){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board.length; j++){
				board[i][j] = "-";
			}
			
		}
	}

	public boolean checkFinish(){
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j].equals("-")){
					return false;
				}
			}
		}
		return true;
	}


	public String checkWinHorizontal(){
		for(int i = 0; i < board.length; i++) {
			Set<String> tmp = new HashSet<>(Arrays.asList(board[i]));
			String[] reSized = tmp.toArray(new String[0]);
			if (reSized.length == 1 && !reSized[0].equals("-")){
				return reSized[0];
			}
		}
		return "false";
	}

	public String checkWinVertical(){
		String[] tmp = new String[board.length];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				tmp[j] = board[j][i];
			}
			Set<String> check = new HashSet<>(Arrays.asList(tmp));
			String[] reSized = check.toArray(new String[0]);
			if (reSized.length == 1 && !reSized[0].equals("-")){
				return reSized[0];
			}
		}
		return "false";
	}

	public String checkWinDiagniol(){
		String[][] digis = new String[2][board.length];
		for(int i = 0; i < board.length; i++) {
			digis[0][i] = board[i][i];
			digis[1][i] = board[board.length - i - 1][i];
		}

		for (String[] digi : digis) {
			Set<String> tmp = new HashSet<>(Arrays.asList(digi));
			String[] reSized = tmp.toArray(new String[0]);
			if (reSized.length == 1 && !reSized[0].equals("-")) {
				return reSized[0];
			}
		}
		return "false";
	}

	public String checkWin(){
		if (checkWinVertical().equals("X") || checkWinHorizontal().equals("X") || checkWinDiagniol().equals("X")){
			return "X";
		}
		else if (checkWinVertical().equals("O") || checkWinHorizontal().equals("O") || checkWinDiagniol().equals("O")){
			return "O";
		}
		return "false";
	}
}
