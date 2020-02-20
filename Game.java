
import java.util.*;

public class Game {

	public static Scanner in = new Scanner(System.in);
	public Board b = new Board();
	public Player p1 = new Player("O");
	public Player p2 = new Player("X");
	
	
	public void play(){
		b.create();
		for(int i = 0; i < b.width*b.height; i++){
			
			
			b = p1.turn(b);
			b.print();
			b = p2.turn(b);
			b.print();
		}
		
	}
	
}
