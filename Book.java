//Create a Book class to store Books information(bookid, title, author name, price).
//Create an object and assign values to Book variables and print them using a method.
//For printing use the bookid if the book is available so display the details and if book is not available show the msg by using exception
package Thr_Lab_25;

import java.io.IOException;

import java.util.*;

public class Book 
{	
		int bookNo,i,searchId;
		
		Scanner input=new Scanner(System.in);
		
		int[] ID;
		String[] name;
		String[] author;
		String[] title;
		double[] price;
		
		// accept the book details and search the book by 
		public void bookInfo() throws IOException
		{
			System.out.println("How many book you Want: ");
			bookNo=input.nextInt();
			int[] ID=new int[bookNo];
			String[] name=new String[bookNo];
			String[] author=new String[bookNo];
			String[] title=new String[bookNo];
			double[] price=new double[bookNo];
			// Enter book details and add into there array list
			for(i=0;i<bookNo;i++)
			{
				System.out.print("Enter book ID: ");
				ID[i]=input.nextInt();
				
				System.out.print("Enter book NAME: ");
				name[i]=input.next();
				
				System.out.print("Enter book AUTHOR: ");
				author[i]=input.next();
				
				System.out.print("Enter book TITLE: ");
				title[i]=input.next();
				
				System.out.print("Enter book PRICE: ");
				price[i]=input.nextDouble();
			}
			
			int flag=0;
			System.out.print("Enter book ID for search: ");
			searchId=input.nextInt();
			
			for(i=0;i<bookNo;i++)
			{
				if(searchId==ID[i])  // search book by ID
				{
					flag=1;
					System.out.println("Book Id="+ID[i]);
					System.out.println("Book name="+name[i]);
					System.out.println("Book title="+title[i]);
					System.out.println("Book author="+author[i]);
					System.out.println("Book price="+price[i]);
				}				
			}
			if(flag==0)
			{
				throw new IOException("Book not found");
			}		
		}
		public static void main(String[] args) throws IOException
		{
			Book obj=new Book();
			obj.bookInfo();
		}
}
