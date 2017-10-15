package bank;
//here we cretaed package as bank which that organizes a set of related classes and interfaces.
public class InsufficientBalanceException extends Exception {

	String message;//print the message
	//creating constructor
	public InsufficientBalanceException(){
		System.out.println("Exception constructor called");
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
	//prints the message
		}
	public InsufficientBalanceException(String message){
		this.message=message;
		System.out.println("Exception thrown with message"+getMessage());
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
		printStackTrace();
		//this is for printing the message
	}
	//printStackTrace-it prints a stack trace for this throwable object on the error output stream  that is value 
	//of the filed system
	}

