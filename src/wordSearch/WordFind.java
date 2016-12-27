package wordSearch;
import java.util.ArrayList;
import java.util.List;

public class WordFind {
	String[] board = {
			"ABCE",
			"SFCS",
			"ADEE"};	

	public static void main(String[] args) {
		WordFind ws = new WordFind();
		System.out.println(ws.find("ASADB"));
		System.out.println(ws.find("ABCCED"));
		System.out.println(ws.find("ABCF"));
	}
	private boolean find(String word){
		if(word != null){
			List<Position> ls = new ArrayList<Position>();
			for(int i = 0;i<word.length();i++){
				char cr = word.charAt(i);
				List<Position> lsNew = findPositions(cr);
				if(i==0){
					ls=lsNew;
				}else{
					List<Position> lsNewMatch = matchNext(ls,lsNew);
					if(lsNewMatch.size() > 0){
						ls = lsNewMatch;
					}else{
						return false;
					}
					
				}
			}
			
		}
		return true;
	}
	private List<Position> matchNext(List<Position> ls,List<Position> lsNew){
		List<Position> lsNewMatch = new ArrayList<Position>();
		if(ls.size() > 0 && lsNew.size() > 0){
			for (Position posNew : lsNew) {
				boolean isMatch = false;
				for (Position pos : ls) {
					if((pos.y==posNew.y && Math.abs(pos.x-posNew.x)==1) || (pos.x==posNew.x && Math.abs(posNew.y-pos.y)==1)){
						//return true;
						isMatch=true;
						break;
					}
				}
				if(isMatch==true){
					lsNewMatch.add(posNew);
				}
			}
		}
		//return false;
		return lsNewMatch;
	}
	private List<Position> findPositions(char cr){
		List<Position> ls = new ArrayList<Position>();
		Position p;
		for(int y= 0;y<board.length;y++){
			int x = board[y].indexOf(cr);
			if(x >= 0){
				  p = new Position(x, y);
				  ls.add(p);
			}
		}
		return ls;
	}
	static class Position {  
	    int x, y;  
	    public Position(int x, int y) {  
	        super();  
	        this.x = x;  
	        this.y = y;  
	    }  
	    public String toString() {  
	        return "[" + x + "," + y + "]";  
	    }  
	}
}
