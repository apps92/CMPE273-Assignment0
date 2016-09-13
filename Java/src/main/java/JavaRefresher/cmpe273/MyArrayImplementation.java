package JavaRefresher.cmpe273;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayImplementation {

	private static Scanner sc = new Scanner(System.in);
	private static Scanner sc1 = new Scanner(System.in);
	
	public MyArrayImplementation() {
		
		System.out.println("Spartan Match Day Team Sheet!");
		System.out.println("Enter the total Players the team has: ");
		this.runMyArrayImplementation(sc.nextInt());
	}
	
	static void runMyArrayImplementation(Integer c){
	try{
	 sc.nextLine();
		int number, i;
		String [] myplayers;
		number = c;
		myplayers = new String[number];
		
	for (i=0;i<number;i++){
	System.out.println("Enter Player Name " + (i+1) + ": ");
	myplayers[i] = sc.nextLine();
	}
	String finalChoice;
	int choice;
	boolean sorted = false;
	do{
	System.out.println("Functions: ");
	System.out.println("1. Sort the players by their names");
	System.out.println("2. Search the players by Jersey Numbers");
	System.out.println("Enter your choice:");
	choice = sc.nextInt();
	sc.hasNextLine();
	switch(choice){
	case 1:
		myplayers = doSort(myplayers);
		System.out.println("Sorted.");
	sorted = true;
	for(String p: myplayers)
	System.out.println(p);
	break;
	case 2:
	if(sorted){
	System.out.println("Enter the Jersey number to search:");
	String key = sc1.nextLine();
	int index = Arrays.binarySearch(myplayers, key);
	if(index >= 0){
	System.out.println("Jersey: " +index + " Name: " + myplayers[index]);
	}
	else
	System.out.println(key + " not found! Sorry");
	}
	else
	System.out.println("The Player roster is not sorted, please sort it first");
	break;
	
	default:
	System.out.println("Wrong Choice!");
	}
	System.out.println("Do you wish to continue? Enter Yes or No");
	finalChoice = sc1.nextLine();
	}while(finalChoice.equalsIgnoreCase("yes"));
	//sc.close();
	//sc1.close();
	}
	catch(Exception e){
	e.printStackTrace();
	}
	}
	
	static String[] doSort(String [] unsortedArray)
	{
		{
		Arrays.sort(unsortedArray);
		return unsortedArray;
		}
			
	}
	
	
	
	
}
