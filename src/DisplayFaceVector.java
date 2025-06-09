import java.util.Vector;

public class DisplayFaceVector extends MyFrame{
	public void run(){
		Vector<Car>cars=new Vector<Car>();
		
	for(int j=1;j<6;j++) {
		cars.add(new Car(50,100*j,10+j,5));
	}
		for (int i=0; i<30;i++) {
			clear();
			for(int j=0;j<cars.size();j++) {
			cars.get(j).draw(this);
			cars.get(j).move();
			}
			sleep(0.1);
		}
	}
}
