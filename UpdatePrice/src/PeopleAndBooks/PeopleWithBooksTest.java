package PeopleAndBooks;

public class PeopleWithBooksTest {
	public static void main(String[] args) {
		Person alice = new Person("Alice");
		Person bob = new Person("Bob");
		
		Book gusToTheWorld = new Book("Gus to the World!");
		
		//inital price of a book is 25.0.   If the change in price is greater then 10% alice gives bob $10.
		System.out.println("Before Price Change Alice's Bank = " + alice.getBank());
		System.out.println("Before Price Change Bob's Bank = " + bob.getBank());
		if(gusToTheWorld.newPricePercentageChange(28.0) > .1) {
			if (alice.getBank() >= 10.0 ) {
				alice.setBank(-10.0);
				bob.setBank(10.0);				
			}else {
				System.out.println("Insufficient Funds!");
			}
						
		}
		System.out.println("After Price Change Alice's Bank = " + alice.getBank());
		System.out.println("After Price Change Bob's Bank = " + bob.getBank());
	}
}
