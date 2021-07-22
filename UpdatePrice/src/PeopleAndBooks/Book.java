package PeopleAndBooks;

public class Book {
	  double price = 25.0;
	  String name = "";
	  public Book(String name){
	  	this.name = name;
	  }
	  public double getPrice(){
	    return price;
	  }
	                           
	  public void setPrice(double newPrice){
	  	this.price = newPrice;
	  }
	  /*
	  	double percentagechange - will update the price to the the new passed in price and return 
	    the percentage change.  
	  */
	  public double newPricePercentageChange(double newPrice){
	  	double oldPrice = this.price;
	    this.setPrice(newPrice);
	    
	    //to calculate a change in price percentage you subtract the new price from the old and divide by two.
	    return ((this.price - oldPrice) / oldPrice);
	  }
}
