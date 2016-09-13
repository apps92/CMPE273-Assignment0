package JavaRefresher.cmpe273;

import java.util.Scanner;

public class myQueueImplementation {
	
	private String[] fanQueue; // Let's Define an array of String objects to store the Fan's Names
	private int fanQueuehead, fanQueueTail, currentFansinQueue;
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	public myQueueImplementation() {
		// TODO Auto-generated constructor stub
		
		
		Scanner oaseats = new Scanner(System.in);
		int seatCapacity;
		System.out.println("Welcome to Oakland Baseball Stadium. Please follow the Queue procedure to buy the tickets,on the Match day, please be on time and Enjoy the game!");
		System.out.print("Please enter the capacity of the stadium zone for which you want to buy the ticket");
		seatCapacity = oaseats.nextInt();
		this.runQueueImplementation(seatCapacity);
		
		oaseats.close();
	}
	
	public void runQueueImplementation(int seatCapacity){
	fanQueue = new String[seatCapacity];
	fanQueuehead = 0; //Initially, the queue will begin at ticket number #1
	fanQueueTail = 0; //Similary, the first slot is also the last slot, unless someone comes in the queue to buy a ticket
	currentFansinQueue = 0;
	
	String name, finalChoice;
	int choice;
	//boolean status = false;
	
	do{
		System.out.println("Ticket Booking Options: ");
		System.out.println("1. Enter in queue to buy a new ticket");
		System.out.println("2. Already have a ticket? - request a seat reservation");
		System.out.println("3. Just arrived and in Parking? View Full Queue to see your chances of getting a new ticket");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		switch(choice){
			case 1:
			System.out.println("Please enter your name: ");
			name = sc1.nextLine();
			this.enqueue(name);
		//	status = true;
			break;
			case 2:
			this.dequeue();
			break;
			case 3:
			this.show();
			break;
			default:
				System.out.println("Wrong Choice!");
		}
		
		System.out.println("Do you wish to continue? Enter Yes or No");
		finalChoice = sc1.nextLine();
		}while(finalChoice.equalsIgnoreCase("yes"));
	
	sc.close();
	sc1.close();
	
	
	System.out.println("Thank you!");
	
  
	
	}
	
	public void enqueue(String str){
		if(! isFull()){
			fanQueueTail = fanQueueTail % fanQueue.length;
			fanQueue[fanQueueTail++] = str;
			currentFansinQueue++;
			System.out.println("Thank you. You will be called when your turn comes up!");
		}
		else
			System.out.println("Uh Oh! The Queue is full! Please wait for few more mins!");
		}
	
	public void dequeue(){
		if(! isEmpty()){
			String item = fanQueue[fanQueuehead];
			fanQueue[fanQueuehead++] = null;
			currentFansinQueue--;
			fanQueuehead = fanQueuehead % fanQueue.length;
			System.out.println("Mr./Mrs. " + item + ". It's your turn to get  a reserved seated next! Please keep moving so all fans can enjoy the game");
		}
		else
			System.out.println("It seems the stand is currently empty, please be choose at your convinience");
		}
	
	public void show(){
		if(! isEmpty()){
			int temp = fanQueuehead;
			while(temp != (fanQueueTail))
			System.out.println(fanQueue[temp++]);
		}
		else
			System.out.println("No one in Queue!");
		}
	
	public boolean isEmpty(){
		return ((currentFansinQueue == 0));
		}
	
	public boolean isFull(){
	return (fanQueue.length == currentFansinQueue);
	}
}
