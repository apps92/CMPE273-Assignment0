package JavaRefresher.cmpe273;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc = new Scanner(System.in);
	private static Scanner sc2 = new Scanner(System.in);
	private static int topicOfChoice;
	private static String mainchoice = new String();
    public static void main( String[] args )
    {
    	
    	do{
    	showWelcomeScreen();
        System.out.println("Waiting for input?");
        getChoice();
        System.out.println("continue?");
       mainchoice =  sc2.nextLine();
    	}
        	while(mainchoice.equalsIgnoreCase("yes"));
        	
       
    }
    
    static void getChoice(){
    	try{
    	
    		
    	topicOfChoice= sc.nextInt();
    	
    	switch (topicOfChoice) {
		case 1:
			System.out.println("You have chosen option" + topicOfChoice+ " Queue - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			confirmChoice();
			myQueueImplementation obj1 = new myQueueImplementation();
			break;
		case 2:
			System.out.println("You have chosen option" + topicOfChoice+ "Stack - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			
			System.out.println("You have been given a Card Deck case which can hold Pokemon cards. You can only access this deck from the Top as it is implemented in a stack LIFO!");
			confirmChoice();
			myStackImplementation obj2 = new myStackImplementation(3);
			
			break;
		case 3:
			System.out.println("You have chosen option" + topicOfChoice+ "Array - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			confirmChoice();
			MyArrayImplementation obj3 = new MyArrayImplementation();
			break;
		case 4:
			System.out.println("You have chosen option" + topicOfChoice+ "Interfaces - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			confirmChoice();
			MyInterfaceImplementation obj4 = new MyInterfaceImplementation(123, 706);
			break;
		case 5:
			System.out.println("You have chosen option" + topicOfChoice+ "Collections - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			confirmChoice();
			int p=0;
			String [] names = new String[5];
		    String [] positions= new String[5];
		    sc.nextLine();
			System.out.println("Enter 5 names");
			for(p =0;p<5;p++)
			{
			names[p]= 	sc.nextLine();
			}
			p=0;
			System.out.println("Enter the 5 positions");
			for( p=0;p<5;p++)
			{
				positions[p] = sc.nextLine();
			}
			
			for(p=0;p<5;p++)
			{
				System.out.println(names[p]+positions[p]);
			}
			
			MyCollectionsImplementation obj5 = new MyCollectionsImplementation(names, positions);
			break;
		case 6:
			System.out.println("You have chosen option" + topicOfChoice+ "Generics - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			confirmChoice();
			break;
		case 7:
			System.out.println("You have chosen option" + topicOfChoice+ "Multithreading - Please read the problem statement below and press Enter to e the program else press b to go back to the main menu");
			confirmChoice();
			break;
		default:
			break;
		}
    }
    catch (Exception e) {
		// TODO: handle exception
    	System.out.println(e);
	}
    }
    
   static void showWelcomeScreen()
    {
    	
    	System.out.println( "Welcome to the Maven Project for CMPE 273 Java!, choose one of the below numeric options to try out the Program for each topic:" );
        System.out.println("1. Queue - ");
        System.out.println("2.Stack - ");
        System.out.println("3.Array - ");
        System.out.println("4.Interfaces -");
        System.out.println("5.Collecions - ");
        System.out.println("6.Generics -");
        System.out.println("7.Multithreading - ");
    }
   static void confirmChoice()
   {
	   Scanner confirmation = new Scanner(System.in);
	   String answer = confirmation.next();
	  System.out.println(answer);
	  if(answer.equals("b"))
	  main(null);
	  else
		  System.out.println("Continuing with the chosen example");
	   
   }
    }

