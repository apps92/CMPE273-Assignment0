package JavaRefresher.cmpe273;

import java.util.Scanner;
public class MyThreadImplementation {
		public static void main(String args[]){
				System.out.println("Welcome to San Jose Parking Garage North!");
				System.out.println("Each Driver should use the parking for 20 sec!");
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Parking Capacity of Lane1: ");
				int lane1 = sc.nextInt();
				
				System.out.println("Enter Parking Capacity of Lane2: ");
				int lane2 = sc.nextInt();
				
				System.out.println("Enter Parking Capacity of Lane3: ");
				int lane3 = sc.nextInt();
				
				System.out.println("Enter Parking Capacity of Lane4: ");
				int lane4 = sc.nextInt();
				
				MyThreadBean T1 = new MyThreadBean("Lane 1", lane1);
				MyThreadBean T2 = new MyThreadBean("Lane 2", lane2);
				MyThreadBean T3 = new MyThreadBean("Lane 3", lane3);
				MyThreadBean T4 = new MyThreadBean("Lane 4", lane4);
				
				
				T1.start();
				T2.start();
				try {
						System.out.println("Riders for Lane 3 and 4 Need to wait");
						T1.t.join();
						T2.t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Riders for 3 and 4 can now Park");
				T3.start();
				T4.start();
				sc.close();
}
}