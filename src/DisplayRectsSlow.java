
public class DisplayRectsSlow extends MyFrame{
	public void run(){
		int x = 30;
		setColor(0,128,0);
		
		while(x<=170) {
			clear();
			fillOval(x,40,30,30);
		x += 20;
		sleep(1);
		}
	}
}
