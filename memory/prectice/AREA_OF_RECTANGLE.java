package prectice;

import java.util.Scanner;

public class AREA_OF_RECTANGLE 
{
  static int lanth, brith;
   static void setdim()
  {
    int a ,b;
    try (Scanner aq = new Scanner(System.in)) 
    {
        System.out.println("enter the length = ");
         a =aq.nextInt();
         System.out.println("enter the breadth = ");
         b =aq.nextInt();
    }
    lanth = a;
    brith = b;
  }
  static void area()
  {
    int ans = lanth*brith;
    System.out.println("area of rectengle is = "+ans);
  }    
  public static void main(String[] args) 
  {
    setdim();
    area(); 
  }
   
}
