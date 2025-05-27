
public class RectIf extends MyFrame{
	public void run() {
		int x = 30;
		int y = 0;
		
		int i;
		for(i = 0;i<20; i++) {
			if(i>10) {
				setColor(y,y,y);
				fillRect(x,80,10,100);	
				
				y -= 20;
			}else {
			setColor(y,y,y);
			fillRect(x,80,10,100);	
			y += 20;
			}
			x += 20;
		    
		}
	}
}
