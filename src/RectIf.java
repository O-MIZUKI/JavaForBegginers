
public class RectIf extends MyFrame{
	public void run(){
		int x = 30;
		int y = 128;
		
		int i;
		for(i = 0;i<20; i++) {
			if(i>10) {
				setColor(0,y,0);
				fillRect(x,80,10,100);	
				
				y -= 20;
			}else {
			setColor(0,y,0);
			fillRect(x,80,10,100);	
			y += 20;
			}
			x += 20;
		    
		}
	}
}
