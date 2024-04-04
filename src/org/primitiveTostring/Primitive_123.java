package org.primitiveTostring;

public class Primitive_123 
{
  public static void main(String[] args) {
	  double d = Double.parseDouble("false");//nfe
	  System.out.println(d);
	int i = Integer.parseInt("123.67");//nfe
	System.out.println(i);
}
}
