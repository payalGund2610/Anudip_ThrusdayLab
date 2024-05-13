//WAP to enter any sentence and calculate the following:
//  a) Total number of digits present in it.
//  b) Total number of small letters and capital letters present in it.
//  c) Total number of alphabets used in it.
//  d) Total number of special character used in it.
//  e) Total number of vowels presents in it.
//  f) Total Number words present in that sentence.

package Thr_Lab_25;

import java.util.Scanner;

public class Sentence 
{
		Scanner input=new Scanner(System.in);
		String sentance;
		int i;
		int digitCount=0,wordCount=1,smallLetter=0,bigLatter=0,specialSymbol=0,vowelCount=0;
		char str;
		public Sentence()
		{
			System.out.print("Enter Sentance=");
			sentance=input.nextLine();
			for(i=0;i<sentance.length();i++)
			{
				str=sentance.charAt(i); //Separate each character from sentance
				
				if(str>=48 && str<=57)  // comapere the ASCII value of digit
					digitCount++;
				
				else if(str==32)		 // comapere the ASCII value of the sapce for word
					wordCount++;
				
				else if(str>=97 && str<=122)  // comapere the ASCII value of samll case character
				{
					smallLetter++;
					if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u') // Samll character vowels
						vowelCount++;
				}
					
				
				else if(str>=65 && str<=90) // comapare the ASCII value of big case character
				{
					bigLatter++;
					if(str=='A' || str=='E' || str=='I' || str=='O' || str=='U')
						vowelCount++;
				}
				else
					specialSymbol++; // Special symbol count
			}
			
			// Display all count 
			System.out.println("Total number of Digit="+digitCount);
			System.out.println("Total number of small letter="+smallLetter);
			System.out.println("Total number of big letter="+bigLatter);
			System.out.println("Total number of word="+wordCount);
			System.out.println("Total number of special symbol="+specialSymbol);
			System.out.println("Total number of vowels="+vowelCount);
			System.out.println("Total number of alphabet="+i);
		}
		public static void main(String[] args) 
		{
			new Sentence();
		}

}
