
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

	
}
