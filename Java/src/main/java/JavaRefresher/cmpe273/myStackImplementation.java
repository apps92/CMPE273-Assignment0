package JavaRefresher.cmpe273;

import java.util.Scanner;

public class myStackImplementation {
	
	private int TopOfStack;
	private String[] stack;
    private int size=0, choice=0;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
	public myStackImplementation(int size){
		
			stack = new String[size];
			this.size = size;
			String name, finalChoice;
			System.out.println("Welcome to PokeMon Card Deck. Remember to put your favourite pokemon at the top so you can access it!");
			System.out.println("This deck supports : "+size+" cards.");
			
			do{
				System.out.println("Enter 1 to put in a new card!");
				System.out.println("Enter 2 to Pop out the top card and play with it!");
				System.out.println("Enter 3 to show all cards");
				System.out.println("Enter 4 to take a peek at the next card");
				choice=	sc.nextInt();
				
				switch(choice){
				
				case 1:
					System.out.println("Enter the PokeMon Name:");
					name = sc1.nextLine();
					System.out.println(this.Push(name));
				  break;
				 
				case 2:
					System.out.println("Popping out the top card");
					System.out.println(this.pop());
					break;
				case 3:
					System.out.println("Printing all cards");
					this.show();
					break;
				case 4:
					System.out.println("Taking a Peek at the next card:");
					this.peek();
					break;
				default:
				System.out.println("Please enter valid choice");
				
				}
				System.out.println("Do you wish to continue");
				finalChoice = sc1.nextLine();
			}while(finalChoice.equalsIgnoreCase("yes"));
				
			
			}

	public String Push(String card){
	//	System.out.println("Inside Push currently TOS is " +TopOfStack+"Now checkign if full");
		if(!this.StackisFull())
		{
			//System.out.println("Stack not full if");
			stack[TopOfStack++]=card;
		//	System.out.println("After adding new TOS at :"+TopOfStack);
			return "Another Card added to your collection!";
		}
		else
		{
		//	System.out.println("Inside else");
			System.out.println();
			return "It seems the card deck is full, please get a new container for your ever growing collection";
		}
	}
	
	private boolean StackisFull() {
		// TODO Auto-generated method stub
		//System.out.println("Inside full check TOS is at:"+TopOfStack+ "and size is :"+this.size+" so it will return :"+(TopOfStack==this.size));
		return (TopOfStack==this.size);
	}
	public String pop(){
		
		if(!StackisEmpty()){
		String popping = stack[--TopOfStack];
		stack[TopOfStack] = null;
		return popping;
		}
		else
			{
			return "It seems you have ran out of your PokeMon Flash cards!";}
		}


	private boolean StackisEmpty() {
		// TODO Auto-generated method stub
		return (TopOfStack==0);
	}
	public void peek(){
		if(TopOfStack != 0){
		System.out.println(stack[TopOfStack-1]);
		}
		else
		System.out.println("No Cards in your collection!");
		}
	
	public void show(){
		if(! StackisEmpty()){
		int temp = TopOfStack;
		while(temp != 0)
		System.out.println(stack[--temp]);
		}
		else
		System.out.println("No cards to show!");
		}
}
