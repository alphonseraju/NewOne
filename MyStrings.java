package com.controlstatements;

public class MyStrings {
public static void main(String[]args) {
	StringBuffer sb=new StringBuffer("java class");
	sb.delete(4, 11);
	System.out.println(sb);
    sb.insert(0, " hey ");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.append(" class");
    int ln=sb.length();
    sb.toString();
    StringBuilder sd=new StringBuilder("alpa");
    sd.append("raj");
    System.out.println(sb);
    System.out.println(sd);
    System.out.println(ln);
    
}
}