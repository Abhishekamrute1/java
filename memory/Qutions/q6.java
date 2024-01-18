package Qutions;

import java.util.Scanner;

public class q6 
{
 public static void main(String[] args)
 {
   try (Scanner sc = new Scanner(System.in)) {
      int year = sc.nextInt();
        if(year%4==0)
            if(year%4==0)
         {
           if(year%100!=0)
           {
              System.out.println("it is a leap year");
           }
           else if(year%400==0)
           {
              System.out.println("it is a leap year");
           }
           else
           {
            System.out.println("it is not a leap year");
           }
         }
           else
           {
              System.out.println("it is not a leap year");
           }
   }
    
   // String c = year%4 == 0 ?year%100 !=0?"it is leap year":year%400==0?"it is leap year" :"it is not a leap year"  :"it is not a leap year";  
   // System.out.println(c);
 }   
}
