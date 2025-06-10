
public class Vehicle {
	int x,y,vx,vy;
	public Vehicle(int x,int y,int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame1) {
		
	}
	public void move() {
		x+=vx;
		y+=vy;
		if(x>300) {
			x-=300;
		}
		else if (x<0){
			x+=300;
		}
	}
}
