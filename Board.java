package idanTicTacToes;
import java.util.*;

public class Board {
	public String[][] board;
	public int size;
	public Board(int size){
		this.board = new String[size][size];
		this.size = size;
	}
	
	public void print(){
		for(int i = 0; i < size; i++){
			System.out.println(Arrays.toString(board[i]));
		}
		System.out.println();
	}
	
	public void create(){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				board[i][j] = "-";
			}
		}
	}

	public boolean checkFinish(){
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(board[i][j].equals("-")){return false;}
			}
		}
		return true;
	}


	public String checkWinHorizontal(){
		for(int i = 0; i < size; i++) {
			Set<String> tmp = new HashSet<>(Arrays.asList(board[i]));
			String[] reSized = tmp.toArray(new String[0]);
			if (reSized.length == 1 && !reSized[0].equals("-")){return reSized[0];}
		}
		return "false";
	}

	public String checkWinVertical(){
		String[] tmp = new String[size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				tmp[j] = board[j][i];
			}
			Set<String> check = new HashSet<>(Arrays.asList(tmp));
			String[] reSized = check.toArray(new String[0]);
			if (reSized.length == 1 && !reSized[0].equals("-")){return reSized[0];}
		}
		return "false";
	}

	public String checkWinDiagniol(){
		String[][] digis = new String[2][size];
		for(int i = 0; i < size; i++) {
			digis[0][i] = board[i][i];
			digis[1][i] = board[size - i - 1][i];
		}

		for (String[] digi : digis) {
			Set<String> tmp = new HashSet<>(Arrays.asList(digi));
			String[] reSized = tmp.toArray(new String[0]);
			if (reSized.length == 1 && !reSized[0].equals("-")) {return reSized[0];}
		}
		return "false";
	}

	public String checkWin(){
		if (checkWinVertical().equals("X") || checkWinHorizontal().equals("X") || checkWinDiagniol().equals("X")){return "X";}
		else if (checkWinVertical().equals("O") || checkWinHorizontal().equals("O") || checkWinDiagniol().equals("O")){return "O";}
		return "false";
	}
}
