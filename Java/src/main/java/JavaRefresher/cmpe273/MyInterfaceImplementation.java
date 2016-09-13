package JavaRefresher.cmpe273;

public class MyInterfaceImplementation implements SJMLKCard {
	
	
	
	public MyInterfaceImplementation(int bookid,int roomnumber){
		
		this.issueBook(bookid);
		this.reserveStudyRoom(roomnumber);
		this.returnBook(bookid);
	}

	public void issueBook(int bookid) {
		// TODO Auto-generated method stub

		System.out.println("You have been issued the book with bookid:"+bookid);
	}

	public void returnBook(int bookid) {
		// TODO Auto-generated method stub
System.out.println("Thank you for returning the book "+bookid);
	}

	public void reserveStudyRoom(int roomnumber) {
		// TODO Auto-generated method stub

		System.out.println("Thank you! Room "+roomnumber+" has been booked");
	}

}
