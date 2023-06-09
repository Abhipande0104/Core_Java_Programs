package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo 
{
	public static void main(String[] rags)
	{
		Pattern pat=Pattern.compile("W+");
		System.out.println(pat);
		Matcher mat=pat.matcher("W WW WWW WSWDW");
		while(mat.find())
			System.out.println("Match "+mat.group());
		
		String str="Jon Jonathan FrankJon Ken Todd";
		
		pat=Pattern.compile("Jon");
		mat=pat.matcher(str);
		
		System.out.println("Original sequence: "+str);
		
		str=mat.replaceAll("Eric");
		System.out.println("Modified sequence: "+str);
	}
}
