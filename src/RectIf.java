
public class RectIf extends MyFrame{
	public void run(){
		setColor(0,128,0);
		int x = 30;
		int i;
		for(i = 0;i<10; i++) {
			
			fillRect(x,x+50,10,100);	
			
			x += 20;
		}
	}
}
