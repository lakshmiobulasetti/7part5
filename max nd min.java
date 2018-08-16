import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a[]=new int[]{3,28,46,87,21};
	int min=a[0];
	int max=a[0];
	for(int i=0;i< a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
		System.out.println("highest number in the given array:"+max);
		System.out.println("lowest number in the given array:"+min);
	}
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
