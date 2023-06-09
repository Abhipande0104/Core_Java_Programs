package day4;

import java.util.StringTokenizer;

public class DemoToken 
{
	public static void main(String[] args)
	{
		StringTokenizer st= new StringTokenizer("mumbai jalgaon nagpur pune nashik ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
