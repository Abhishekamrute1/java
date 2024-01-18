package controle;

import java.util.Scanner;

// Write a program to input week number and print week day
public class Q12 {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the week number");
        int a = sc.nextInt();
        if(a<=7 && a>=1)
        {
            if(a==1)
            {
                System.out.println("monday");
            }
            else if(a==2)
            {
                System.out.println("tuesday");
            }
            else if(a==3)
            {
                System.out.println("wednesday");
            }
            else if(a==4)
            {
                System.out.println("thursday");
            }
            else if(a==5)
            {
                System.out.println("friday");
            }
            else if(a==6)
            {
                System.out.println("saturday");
            }
            else
            {
                System.out.println("sunday");
            }
        }
        else{
            System.out.println("enveled no.");
        }
   // String c= a<=7 && a>=1?a==1 ?"monday" :a==2 ?"tuesday" :a==3? "wednesday": a==4?"thursday" :a==5?"friday" :a==6? "saturday":"sunday" :"enveled no.";
   // System.out.println(c);
    }
   } 
}
