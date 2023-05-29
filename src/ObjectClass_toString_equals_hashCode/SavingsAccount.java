package ObjectClass_toString_equals_hashCode;

import java.util.Objects;

public class SavingsAccount extends Account{
	
private double balance;
private int pin_no;


SavingsAccount(int acc_no,String ifsc,double balance,int pin_no) 
{
	super(acc_no,ifsc);
	this.balance = balance;
	this.pin_no=pin_no;
}

public void SavingsAccountDetails()
{
	System.out.println("Balance: "+balance);
	System.out.println("Pin Number: "+pin_no);
}
public double getBalance(int pin_no)
{
	if(this.pin_no==pin_no)
	{
	return balance;
	}
	else 
		return 0.0;
}

public void setBalance(double balance,int pin_no) 
{
	if(this.pin_no==pin_no)
	{
	this.balance = balance;
	System.out.println("Balance Updated Successfully");
	}
	else
		System.out.println("Wrong Pin...");
}

@Override //Overrides toString()
public String toString()
{
	return "Rs."+balance;
}

@Override //Overrides equals(Object o)
public boolean equals(Object o) //UPCASTING - Already a Parent Type
{
	SavingsAccount sa=(SavingsAccount)o; //DOWNCASTING - To Access Child Class Members
	if(this.balance==sa.balance)
	{
		return true;
	}
	
		else 
		{
			return false;
		}
	}

@Override //Overrides hashCode()
public int hashCode()
{
	int i=Objects.hash(balance);
	return i; 
}
}
