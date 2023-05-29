package ObjectClass_toString_equals_hashCode;

public class BookDriver {
	public static void main(String[] args) {
		Book b1=new Book(18,"Ravinder Singh",250.0);
		Book b2=new Book(18,"Ravinder Singh",250.0);
		Book b3=b1;
		
		System.out.println(b1); 
		//BEFORE OVERRIDING toString()
		//PackageName.ClassName@HexaDecimal ---> Part3.To_String.Book@76ed5528
		
		System.out.println(b1);
		//AFTER OVERRIDING toString() Since We're returning States
		//return book_id+"\t"+author+"\t"+price; ---> 18	Ravinder Singh	250.0
		
		
		
		//BEFORE OVERRIDING equals(Object o) ---> Compares Object Reference
		System.out.println(b1.equals(b2)); //false
		System.out.println(b1.equals(b3)); //true
		
		//AFTER OVERRIDING equals(Object o) ---> Compares States
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.equals(b3)); //true
		
		
		
		//hash()--->Generate Unique Integer For Every New Object Created
		//BEFORE OVERRIDING hashcode() ---> Compares Unique Integer based on Object Reference
		System.out.println(b1.hashCode()==b2.hashCode());//false
		System.out.println(b1.hashCode()==b3.hashCode());//true
		
		//AFTER OVERRIDING hashcode() ---> Compares Unique Integer based on States
		System.out.println(b1.hashCode()==b2.hashCode());//true
		System.out.println(b1.hashCode()==b3.hashCode());//true
		
	}

}
