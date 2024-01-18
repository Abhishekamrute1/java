package Qutions;

import java.util.Scanner;

public class q1 
    {
     public static void main(String[] args) 
     {
       try (Scanner sc = new Scanner(System.in)) {
        int age =sc.nextInt();
        if(age>100)
        {
            System.out.println("enwelwd age");
        }
        else if(age>=18)
        {
           
            System.out.println("eligible for vote");
              if(age>50)
            {
                System.out.println(" senior citizen");
            }
        }
        else
        {
            if(age<10)
            {
                System.out.println("child");
            }
            System.out.println("not eligible for vote");
        }
    }
    }
     }   
