//Write a program in Java to enter a String/Sentence and display 
//the longest word and the length of the longest word present in the String.
//
//Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN” Sample
//Output: The longest word: FOOTBALL: The length of the word: 8
package Thr_Lab_25;

import java.util.Scanner;

public class Longest_Word 
{
		public void LongWord()
		{
			String Sentance,str1="",Longest="";
			int i,Count=0,max=1;
			char str;
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Your Sentence: ");
			Sentance=sc.nextLine();
			sc.close();
			
			for(i=0;i<Sentance.length();i++) 
			{
				str=Sentance.charAt(i);  // slipt the sentance into single character
				if(str==32 || str=='\0')
				{
					if(max<Count) // check the word count with max count
					{
						Longest="";
						max=Count;
						Longest=str1;
					}
					// make count and word empty
					str1="";
					Count=0;
				}
				else
				{
					// count the length and store the word
					Count++;
					str1+=str;
				}
			}
			System.out.println("Longest Word is: "+Longest);
			System.out.println("Lenght of longest word: "+max);
		}
		public static void main(String[] args) 
		{
			Longest_Word obj=new Longest_Word();
			obj.LongWord();
		}
}
