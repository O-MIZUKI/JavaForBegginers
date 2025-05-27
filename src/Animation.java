
public class Animation extends MyFrame{
	public void run(){
		int x = 30;
		int y =100;
		setColor(0,128,0);
		while(true) {
			while(y>=50) {
				clear();
				fillOval(x,y,40,40);
		
				y -= 5;
				sleep(0.1);
			} 
			while(x<=170) {
				clear();
				fillOval(x,y,40,40);
		
				x += 5;
				sleep(0.1);
			} 
		}
	}
}
