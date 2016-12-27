package oneking;
import java.util.Scanner;

public class Bombs {

	public static void main(String[] args) {
		Scanner cin = new Scanner(    
				Bombs.class.getResourceAsStream("Line.txt"));   
        int t,n;
        t = cin.nextInt();//1
        int count = 0;
        while(t-->0){  
            n = cin.nextInt();  //3
            //System.out.println(n);
            Section[] section = new Section[n];   
            for(int i = 0;i<section.length;i++){  
                int x = cin.nextInt();  
                int y = cin.nextInt();  
                section[i] = new Section(x,y);  
            }  
            Bombs bom = new Bombs(); 
            bom.mergeSec(section);
            for(int i = 0;i<section.length;i++){  
            	Section secTmp = section[i];
            	System.out.println(secTmp.toString());
            	if(secTmp.x>0){
            		count++;
            	}
            }  
        }
        cin.close();
        System.out.println(count);
	}
	/** 
	 * 实体类 
	 * x表示ai 
	 * y表示bi 
	 * @author Administrator 
	 * 
	 */  
	static class Section {  
	    int x, y;  
	    public Section(int x, int y) {  
	        super();  
	        this.x = x;  
	        this.y = y;  
	    }  
	    public String toString() {  
	        return "[" + x + "," + y + "]";  
	    }  
	}
	
	//对数组取交集 ,如果当前区间和前面的区间有交际,则改变改变前面的区间,置空当前区间
	private void mergeSec(Section[] secs){   
		for(int i = 1; i < secs.length; i++){ 
			Section theSec = secs[i];
			for(int j=0;j<i;j++){
				if(theSec.x<=secs[j].y && secs[j].y > 0){
					secs[j].x = Math.min(secs[j].x, theSec.x);
					secs[j].y = Math.max(secs[j].y, theSec.y);
					secs[i].x=-1;
					secs[i].y=-1;
					break;
				}
			}
		}
	}

}
