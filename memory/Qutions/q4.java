package Qutions;

import java.util.Scanner;

public class q4 
{
    public static void main(String[] args) 
    {
     try (Scanner aq = new Scanner(System.in)) {
      System.out.println("enter the firest no. a =");
        int a = aq.nextInt();
        System.out.println("enter the second no. b =");
        int b = aq.nextInt();
        if(a<b)
        {
          System.out.println("a is lesthan b");
        }  
        if(a==b)
        {
          System.out.println("a is equal than b");
        }
        if(a>b)
        {
          System.out.println("a is greater than b");
        }
    }
    }
}