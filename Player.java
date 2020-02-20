
import java.util.*;

public class Player {

	
	public String sign;
	
	public Player(String s){
		this.sign = s;
	}
	
	public Board turn(Board b1){
		int x = (int)(Math.random()*b1.width);
		int y = (int)(Math.random()*b1.height);
		while(b1.board[y][x] == "-"){
			 b1.board[y][x] = this.sign;
			 System.out.println(x + "    " + y + this.sign);
		}
		return b1;
		
	}
}
