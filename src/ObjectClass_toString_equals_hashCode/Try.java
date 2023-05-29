package ObjectClass_toString_equals_hashCode;

import java.util.Objects;

public class Try {

	int ID;
	String Name;
	
	Try()
	{
		
	}
	
	Try(int id,String name)
	{
		this.ID=id;
		this.Name=name;
	}
	
	@Override
	public String toString()
	{
		return ID+ "\t " +Name;
	}
	
	@Override
	public int hashCode()
	{
		int h=Objects.hash(ID,Name);
		return h;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Try t=(Try)o;
		if(this.ID==t.ID && this.Name.equals(t.Name))
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Try t1=new Try(1,"Sai");
		Try t2=new Try(2,"Akshu");
		Try t3=t1;
		Try t4=new Try(2,"Akshu");
		
		//toString()- Returns Fake Address of Object Ref. -->PackageName.ClassName@HexaDecimal
		//If you try to print the Object Ref,the compiler will add toString() to give the Fake Address
		//@Override - Returns States
		//Any String Type Data(States,Methods with String returnType,Any String returnType)
		//COMPILER VIEW ---> sysout(t1.toString());
								//BEFORE						//AFTER
		System.out.println(t1);//Part3.To_String.Try@5a07e868	//1	 Sai
		System.out.println(t2);//Part3.To_String.Try@76ed5528	//2	 Akshu
		
		
		//hashcode()- Generates Unique Integer Number for Each new Object Ref.
		//@Override - Generates Unique Integer Based On the Data(States)
										  //BEFORE		//AFTER
		System.out.println(t1.hashCode());//1510467688	//83867
		System.out.println(t2.hashCode());//1995265320	//63331381
		System.out.println(t3.hashCode());//1510467688	//83867
		System.out.println(t4.hashCode());//746292446	//63331381
		
		//equals(Object o)- Compares Two Object References
		//@Override - Compares Two Data(States)
										  //BEFORE	//AFTER	
		System.out.println(t1.equals(t2));//false	//false
		System.out.println(t1.equals(t3));//true	//true
		System.out.println(t2.equals(t4));//false	//true
		
		//"==" Only Compares Object Ref.
		//Even if we Override toString() Object Ref. Won't Change
		//B'coz We're Overriding only toString() to return "String Type Data"
		System.out.println(t1==t2);//false i.e(Part3.To_String.Try@5a07e868==Part3.To_String.Try@76ed5528)
		System.out.println(t1==t3);//true i.e(Part3.To_String.Try@5a07e868==Part3.To_String.Try@5a07e868)
	}
}




