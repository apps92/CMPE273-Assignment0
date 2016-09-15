package JavaRefresher.cmpe273;

public class MyThreadBean extends Thread {
	Thread t;
	private String myParkingQueue;
	private int parkingCapacity;
	
	MyThreadBean(String myParkingQueue, int parkingCapacity){
		this.myParkingQueue = myParkingQueue;
		this.parkingCapacity = parkingCapacity;
		System.out.println("Creating " + myParkingQueue + "\n");
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= this.parkingCapacity; i++) {
			System.out.println("New Car Park Please " + myParkingQueue + "\n");
			System.out.println("Car " + i + " is using Lane in " + myParkingQueue + "\n");
			try{
				Thread.sleep(20000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(myParkingQueue + " is free to use \n");
		}
	}
	public void start(){
		System.out.println("Starting " + myParkingQueue + "\n");
		if(t == null){
			t = new Thread(this, myParkingQueue);
			t.start();
		}
	}
}
