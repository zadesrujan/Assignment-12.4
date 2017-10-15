package bank;
//here we cretaed package as bank which that organizes a set of related classes and interfaces.
public class Batm {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		BankATM A=new BankATM(10000,1,"Vidu","HYD",25000);
		//creating objects which show details
		BankATM B=new BankATM(10000,2,"Srujan","HYD",50000);
		BankATM C=new BankATM(20000,3,"Chintu","HYD",100000);
		
		A.deposit(10000);
		//depositing the amount in priya's account 
		try
		{
	//here the withdrawal throws an Exception with try catch showing withdrawal account
			A.withdraw(5000);
			B.withdraw(1000);
			C.withdraw(7000);
		}
		catch(InsufficientBalanceException e)
		//error occurs in output and shows insufficient balance
		/*the code is prone to exceptions is placed in the try block
		 *when exception occurs that exception occurred is handled by the 
		 *catch block associated with it
		 */
		{
			System.out.println("insufficent balance:");
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
					
		}
	}
	
	}


