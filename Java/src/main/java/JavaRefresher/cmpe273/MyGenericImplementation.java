package JavaRefresher.cmpe273;

import java.util.Scanner;

public class MyGenericImplementation {
	
	public MyGenericImplementation()
	{
	
	}

	public static void main (String args[]){
		System.out.println("Welcome SJ sharks Cafe!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your order:");
		System.out.println("1. Express Meal");
		System.out.println("2. Drive-In order");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		
		case 1: 
			System.out.println("Enter the Combo Meal Name to go!");
			String myCombo = sc.nextLine();
			
			MyGenericBean<String, String> myComboMeal = new MyGenericBean<String, String>("Combo Mean To-Go", myCombo);
			System.out.println("Your Quick Combo Meal is ready : "+ myComboMeal.getObject1());
			System.out.println(myComboMeal.getObject2());
			break;
		
		case 2:
			System.out.println("Welcome to the Automated Drive-in Kiosk");
			System.out.println("Please enter your Token number to collect the Packet");
			
			int tokenNumber = Integer.parseInt(sc.nextLine());
			
			MyGenericBean<String, Integer> myDriveInMeal = new MyGenericBean<String,Integer>("Drive-In collection", tokenNumber);
			
			System.out.println("Here is your Drive-in Order: "+ myDriveInMeal.getObject1());
			System.out.println("Meal:"+myDriveInMeal.getObject2());
			
			break;
			
			default:
				System.out.println("Please enter correct input:");
		}
	}
}
