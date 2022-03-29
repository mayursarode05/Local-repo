package Self_evolution_lab1;

import java.util.Scanner;

public class Fibonnaci {
    Scanner s=new Scanner(System.in);
	int a,b,temp;
	void show()
    {
    	System.out.println("Enter number for Fibonnaci series :-");
    	a=s.nextInt();
    	System.out.println("Enter number for Fibonnaci series :-");
    	b=s.nextInt();
    	for(int i=0;i<=10;i++)
    	{
    		System.out.println(a);
    	    temp=a+b;
    	    a=b;
    	    b=temp;
        }
   
    }
	public static void main(String[] args) 
	{
     Fibonnaci f=new Fibonnaci();
     f.show();
	}

}
