package ObjectClass_toString_equals_hashCode;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Ranjith",100000);
		Employee e2=new Employee(102,"Priya",200000);
		Employee e6=e1;
		
		System.out.println(e1); 
		//BEFORE OVERRIDING toString()
		//PackageName.ClassName@HexaDecimal ---> Part3.To_String.Employee@76ed5528
		
		System.out.println(e1);
		//AFTER OVERRIDING toString() Since We're returning States
		//return id_number+"\t"+emp_name+"\t"+emp_salary; ---> 101	Ranjith	100000.0
		
		
		
		//BEFORE OVERRIDING equals(Object o) ---> Compares Object Reference
		System.out.println(e1.equals(e2)); //false
		System.out.println(e1.equals(e6)); //true
		
		//AFTER OVERRIDING equals(Object o) ---> Compares States
		System.out.println(e1.equals(e2)); //true
		System.out.println(e1.equals(e6)); //true
		
		
		
		//hash()--->Generate Unique Integer For Every New Object Created
		//BEFORE OVERRIDING hashcode() ---> Compares Unique Integer based on Object Reference
		System.out.println(e1.hashCode()==e2.hashCode());//false
		System.out.println(e1.hashCode()==e6.hashCode());//true
		
		//AFTER OVERRIDING hashcode() ---> Compares Unique Integer based on States
		System.out.println(e1.hashCode()==e2.hashCode());//true
		System.out.println(e1.hashCode()==e6.hashCode());//true
		
	}
}
