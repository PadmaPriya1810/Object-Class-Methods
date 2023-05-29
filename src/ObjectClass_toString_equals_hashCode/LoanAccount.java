package ObjectClass_toString_equals_hashCode;

import java.util.Objects;

public class LoanAccount extends Account
{
private double loan_amount;

public LoanAccount(int acc_no,String ifsc,double loan_amount)
{
	super(acc_no,ifsc);
	this.loan_amount = loan_amount;
}

public void LoanAccountDetails()
{
	System.out.println("Loan Amount: "+loan_amount);
}

public double getLoan_amount() 
{
	return loan_amount;
}

public void setLoan_amount(double loan_amount)
{
	this.loan_amount = loan_amount;
}

@Override //Overrides toString()
public String toString()
{
	return "Rs."+loan_amount;
}

@Override //Overrides equals(Object o)
public boolean equals(Object o) //UPCASTING - Already a Parent Type
{
	LoanAccount la=(LoanAccount)o; //DOWNCASTING - To Access Child Class Members
	if(this.loan_amount==la.loan_amount)
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
	int i=Objects.hash(loan_amount);//Generating Unique Integer for State loan_amount
	return i; 
}
}
