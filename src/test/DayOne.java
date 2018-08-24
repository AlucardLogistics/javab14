package test;

public class DayOne {
	
	     public static void main(String []args){
	         
	        System.out.println("Hello World");
	        
	        //widening
	        int e = 10;
	        float d = e;
	        System.out.println(e);
	        System.out.println(d);
	        System.out.println("widening");
	        
	        //narrowing - type cast
	        float a = 2.5f;
	        int b = (int)a;
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println("narrowing");
	        
	        //overflow
	        int f = 180;
	        byte g = (byte)f;
	        System.out.println(f);
	        System.out.println(g);
	        System.out.println("overflow");
	        
	        //arithmetic operations
	        int h = 5;
	        int j = 8;
	        System.out.println(h+j);
	        System.out.println(h-j);
	        System.out.println(h*j);
	        System.out.println(h/j);
	        System.out.println(h%j);
	        
	        //unary operators
	        int o = 5;
	        boolean val = true;
	        System.out.println(o++); //5
	        System.out.println(++o); //7
	        System.out.println(o--); //7
	        System.out.println(--o); //5
	        
	        System.out.println(~o);
	        System.out.println(!val);
	        
	        //logical operators
	        int m = 4;
	        int n = 7;
	        int p = 11;
	        System.out.println(m<n); //true
	        System.out.println(m<=n); // true
	        System.out.println(m<n&&n>p); //true&&false => false
	        System.out.println(m<n||n>p); //true||false => true	     
	     }

}
