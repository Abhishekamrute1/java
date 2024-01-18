package Qutions;

import java.util.Scanner;

public class q5 
{
 public static void main(String[] args) 
 {
   try (Scanner aq = new Scanner(System.in)) {
    System.out.println("enter the no. a =");
     int a = aq.nextInt();
     System.out.println("enter the no. b =");
     int b = aq.nextInt();
     if(a==b)
     {
      System.out.println("Equal");
     }
     else if(a>b)
     {
       System.out.println("a is greater");
     }
     else
     {
      System.out.println("a is lesser");
     }
  }
 }   
}
