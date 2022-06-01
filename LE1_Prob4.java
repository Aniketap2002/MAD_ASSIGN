import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
	    int n=Integer.parseInt(args[0]);
	    for(int i=1;i<=10;i++)
	    {
	        System.out.print(n+"*"+i+"="+n*i);
		System.out.println();
	    }
	}
}