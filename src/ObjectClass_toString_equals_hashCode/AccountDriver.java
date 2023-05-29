package ObjectClass_toString_equals_hashCode;

public class AccountDriver {
public static void main(String[] args) {
	Account a1=new Account(12345,"HDFC00035");
	Account a2=new Account(67890,"SBI00065");
	Account a3=a1;
	
	SavingsAccount sa1=new SavingsAccount(12345,"HDFC00035",150000,1234);
	SavingsAccount sa2=new SavingsAccount(67890,"SBI00065",50000,121);
	SavingsAccount sa3=sa1;
	
	LoanAccount la1=new LoanAccount(12345,"HDFC00035",4500000);
	LoanAccount la2=new LoanAccount(67890,"SBI00065",50000000);
	LoanAccount la3=la1;
	
	//toString() --> returns States
	System.out.println(a1); 
	System.out.println(sa1);
	System.out.println(la1);
	
	
	// equals(Object o) ---> Compares States
	System.out.println(a1.equals(a2)); //false
	System.out.println(a1.equals(a3)); //true
	
	System.out.println(sa1.equals(sa2)); //false
	System.out.println(sa1.equals(sa3)); //true
	
	System.out.println(la1.equals(la2)); //false
	System.out.println(la1.equals(la3)); //true
	
	
	//hashcode() ---> Compares Unique Integer based on States
	System.out.println(a1.hashCode()==a2.hashCode());//false
	System.out.println(sa1.hashCode()==sa2.hashCode());//false
	System.out.println(la1.hashCode()==la2.hashCode());//false
	
}
}
