package ObjectClass_toString_equals_hashCode;

import java.util.Objects; //For hash()
public class Book {
	private int book_id;
	private String author;
	private double price;
	
	public Book(int book_id, String author, double price) 
	{
		super(); //Calling private No Arg Constructor()in Object Class -Singleton Class?
		this.book_id = book_id;
		this.author = author;
		this.price = price;
	}

	public int getBook_id()
	{
		return book_id;
	}

	public void setBook_id(int old_book_id,int new_book_id,String author) 
	{
		if((this.book_id == old_book_id)&&this.author.equals(author))
		{
			this.book_id=new_book_id;
		}
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String old_author, String new_author,int book_id)
	{
		if((this.book_id==book_id)&& (this.author.equals(old_author)))
				{
			this.author=new_author;
				}
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price,int book_id,String author)
	{
		if((this.author.equals(author)&&this.book_id==book_id))
		{
		this.price = price;
		}
	}
	public void DetailsOfBook()
	{
		System.out.println("Book ID: "+book_id);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+price);
	}
	@Override //Overrides toString()
	public String toString()
	{
		return book_id+"\t"+author+"\t"+price;
	}
	
	@Override //Overrides equals(Object o)
	public boolean equals(Object o) //UPCASTING - Already a Parent Type
	{
		Book b=(Book)o; //DOWNCASTING - To Access Child Class Members
		if(this.book_id==b.book_id&&this.author.equals(b.author)&&this.price==b.price)
		{
			return true;
		}
		
			else 
				return false;
		}

	@Override //Overrides hashCode()
	public int hashCode()
	{
		int a=Objects.hash(book_id,author,price);
		return a; 
	}
			

}
