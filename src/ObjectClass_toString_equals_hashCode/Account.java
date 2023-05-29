package ObjectClass_toString_equals_hashCode;

import java.util.Objects;

public class Account {
private int acc_no;
private String ifsc;

	Account()//For IS-A Purpose
	{
		System.out.println("Create An Account");
	}
	
	Account(int acc_no)
	{
		this.acc_no=acc_no;
	}
	
 Account(int acc_no, String ifsc) //CONSTRUCTOR
{
	super(); //Object Class Private No Arg Constructor()
	this.acc_no = acc_no;
	this.ifsc = ifsc;
}

 public void AccountDetails()
 {
	 System.out.println("Account Number: "+ acc_no);
	 System.out.println("IFSC Code: "+ ifsc);
 }

public int getAcc_no() 
{
	return acc_no;
}


public void setAcc_no(int old_acc_no,int new_acc_no) 
{
	if(this.acc_no == old_acc_no)
	{
		this.acc_no=new_acc_no;
		System.out.println("Account Number Changed Successfully");
	}
	else
		System.out.println("Invalid Account Number");
}


public String getIfsc() 
{
	return ifsc;
}


public void setIfsc(String ifsc,int acc_no) 
{
	if(this.acc_no==acc_no)
	{
		this.ifsc = ifsc;
		System.out.println("IFSC Code Changed Accordingly");
	}
	else
	{
		System.out.println("Invalid Account Number");
	}
}
	
@Override //Overrides toString()
public String toString()
{
	return acc_no+"\t"+ifsc;
}

@Override //Overrides equals(Object o)
public boolean equals(Object o) //UPCASTING - Already a Parent Type
{
	Account a=(Account)o; //DOWNCASTING - To Access Child Class Members
	if(this.acc_no==a.acc_no&&this.ifsc.equals(a.ifsc))
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
	int i=Objects.hash(acc_no,ifsc);
	return i; 
}
}
