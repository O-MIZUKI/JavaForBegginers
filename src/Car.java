
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x, y+20, 150, 35);
		frame.fillRect(x+25, y-5, 100, 40);
		frame.fillOval(x+100, y+53, 35, 35);
		frame.fillOval(x+15, y+53, 35, 35);
	}
	public void move() {
		x+=vx;
	}
 
}
