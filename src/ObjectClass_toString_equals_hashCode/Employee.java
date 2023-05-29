package ObjectClass_toString_equals_hashCode;

import java.util.Objects;//For hash()

public class Employee {

	private int id_number;
	private String emp_name;
	private double emp_salary;
	
	public Employee(int id_number, String emp_name, double emp_salary) 
	{
		super(); //Calling private No Arg Constructor()in Object Class -Singleton Class?
		this.id_number = id_number;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getId_number()
	{
		return id_number;
	}

	public void setId_number(int old_id_number,int new_id_number,String emp_name) 
	{
		if((this.id_number == old_id_number)&&this.emp_name.equals(emp_name))
		{
			this.id_number=new_id_number;
		}
	}

	public String getEmp_name()
	{
		return emp_name;
	}

	public void setEmp_name(String old_emp_name, String new_emp_name,int id_number)
	{
		if((this.id_number==id_number)&& (this.emp_name.equals(old_emp_name)))
				{
			this.emp_name=new_emp_name;
				}
	}

	public double getEmp_salary() 
	{
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary,int id_number,String emp_name)
	{
		if((this.emp_name.equals(emp_name)&&this.id_number==id_number))
		{
		this.emp_salary = emp_salary;
		}
	}
	public void detailsOfEmployee()
	{
		System.out.println("Employee ID: "+id_number );
		System.out.println("Employee Name: "+emp_name );
		System.out.println("Employee Salary: "+emp_salary );
	}
	@Override //Overrides toString()
	public String toString()
	{
		return id_number+"\t"+emp_name+"\t"+emp_salary;
	}
	
	@Override //Overrides equals(Object o)
	public boolean equals(Object o) //UPCASTING - Already a Parent Type
	{
		Employee e=(Employee)o; //DOWNCASTING - To Access Child Class Members
		if(this.id_number==e.id_number&&this.emp_name.equals(e.emp_name)&&this.emp_salary==e.emp_salary)
		{
			return true;
		}
		
			else 
				return false;
		}

	@Override //Overrides hashCode()
	public int hashCode()
	{
		int a=Objects.hash(id_number,emp_name,emp_salary);
		return a; 
	}
		
	}