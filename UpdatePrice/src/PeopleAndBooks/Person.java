package PeopleAndBooks;

public class Person {
	  String name = "";
	  double bank = 100.0;
	  public Person(String name){
	    this.name = name;
	  }
	  
	  public double getBank(){
	  	return this.bank;
		}
	  public void setBank(double bankAddition){
	    this.bank += bankAddition;
	  }
}
