package Qutions;

import java.util.Scanner;

public class q7 
{
 public static void main(String[] args) 
 {
  try (Scanner sc = new Scanner(System.in)) {
    int a = sc.nextInt();
 /* if(a<0)
     {
      System.out.println("it is a negetive no");
     }
     else if(a>0)
     {
      System.out.println("it is a posetive no");
     }
     else
     {
      System.out.println("it is zero");
     }*/
     String s = a<0?"it is a negetive no":a>0?"it is a posetive no" :"it is zero";
     System.out.println(s);
  }
 }   
}
