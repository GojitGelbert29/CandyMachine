package machine;

import java.util.Scanner;

  public class CandyMachine {
	  static Scanner keyboard = new Scanner(System.in);
	  
	  //Method to Display Item Choices
	  public static double displayChoices(){
	  double cost = 0;
	  System.out.println("Processing...");
	  try {
		  Thread.sleep(7000);
		  	}
		     catch (InterruptedException ex)
		      {  
		       }
	  System.out.println("\nAvailable Products:"
			    + "\n"
	    		+ "\n1: Candies \t ₱10"
	    		+ "\n2: Chips \t ₱25"
	    		+ "\n3: Gums \t ₱15"
	    		+ "\n4: Cookies \t ₱30"
	  			+ "\n");
	  System.out.print("Please select your order:");
	    String choice = keyboard.next();
	    	if(choice.equals("1")){
	    	cost = 10;
	    	return 10;
	    	}
	    	else if(choice.equals("2")){
	    	cost = 25;
	    	return 25;
	    	}	
	    	else if(choice.equals("3")){
	    	cost = 15;
	    	return 15;
	    	}
	    	else if(choice.equals("4")){
	    	cost = 30;
	    	return 30;
	    }
	    else {
		  return cost;
	  }
}	    
	  //Method to Dispense Candy and Return Change
	  public static void dispense(double moneyInserted, double candyCost){
		  if (moneyInserted > candyCost) {
			  System.out.println("Processing....");
			  try {
				  Thread.sleep(5000);
				  	}
				     catch (InterruptedException ex)
				      {  
				       }
				          System.out.println("");			          
		  double change = moneyInserted - candyCost;
		  System.out.println("Here's your ₱" + change +" change"
				  + "\nPlease come back again. Thank you");
	  }
	  else{
		  System.out.println("Processing...");
		  try {
			  Thread.sleep(7000);
			  	}
			     catch (InterruptedException ex)
			      {  
			       }
		  System.out.println("\nInsufficient funds"
				  + "\nSorry we cannot process your order"
				  + "\nHere's your ₱" + moneyInserted +" change"
				  + "\nPlease come back again. Thank you");
	  }  
}	  
	  
	public static void main(String[] args){
		  	//Welcome Statement and Booting Statement to Candy Machine
		    System.out.println("Welcome to Gelbert's Candy Machine");
		    try {
				  Thread.sleep(4000);
				  	}
				     catch (InterruptedException ex)
				      {  
				       }
		    		System.out.println("Booting up... Please Wait");
					  try {
						  Thread.sleep(5700);
						  	}
						     catch (InterruptedException ex)
						      {  
						       }
						          System.out.println("");
			//Prompt & Store for User Information. 
		    System.out.print("Please enter the ammount of money?");

		    double moneyInserted = keyboard.nextDouble();
		    double candyCost = displayChoices();
		    
		    dispense(moneyInserted, candyCost);
	  }
  }