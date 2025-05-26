
public class RectIf extends MyFrame{
	public void run(){
		setColor(0,128,0);
		int x = 30;
		int i;
		for(i = 0;i<10; i++) {
			
			fillRect(x,80,10,x+0);	
			
			x += 20;
		}
	}
}
