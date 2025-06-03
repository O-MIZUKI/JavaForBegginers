import java.util.Vector;

public class DisplayFaceVector extends MyFrame{
	public void run(){
		Vector<Car>cars=new Vector<Car>();
		cars.add(new Car(50,50,10,5));
		cars.add(new Car(50,150,11,5));
		cars.add(new Car(50,250,12,5));
		cars.add(new Car(50,350,13,5));
		cars.add(new Car(50,450,14,5));
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
