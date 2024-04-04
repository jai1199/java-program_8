package org.primitiveTostring;

public class Primitive 
{
   public static void main(String[] args) 
   {
	 int a = 10;
	 String str = Integer.toString(a);
	 System.out.println(str);
	 double d=1.2;
	 String s= Double.toString(d);
	 System.out.println(s);
	 long l = Long.parseLong("123465l");
	 int it1 = Integer.parseInt("345");
	// int it = Integer.parseInt("hello");//numberformateException
	 
	 //String sr = Long.toString(l);
	 String sr = l+"";	
	System.out.println(sr);
	boolean br = true;
	String s2 = Boolean.toString(br);
	System.out.println(s2);
	System.out.println("--------------------");
	String s1 = "123";
	int i = Integer.parseInt(s1);
	System.out.println(i);
	boolean d1 = Boolean.parseBoolean("jhygf");
	System.out.println(d1);
   }
}
