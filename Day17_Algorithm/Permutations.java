/**
 * @author PRATHAMESH TIBILE
 * 24-6-21
 * static functions to return all permutation of a String using
 * iterative method and Recursion method
 */
package Day17_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {
	static String[] permutIteration(String s2)
	{
		ArrayList<String> arl = new ArrayList<>();
		for (int i = 0; i < s2.length(); i++) 
		{
			for (int j = 0; j < s2.length(); j++)
			{
				String s1 = s2;
				System.out.println(i + " " + j);
				System.out.println(swap(s1, i, j));
				// arl.add(swap(s1, i, j));
			}
		}
		return arl.toArray(new String[arl.size()]);
	}
	static String swap(String s1, int i, int j) {

		char[] ch = s1.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}	
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in);)
		{
			System.out.println("enter a string");
			String s1 = s.nextLine();
			permutIteration(s1);

		} catch (Exception e) 
		{
			System.out.println("enter correct input");
		}

	}
}
