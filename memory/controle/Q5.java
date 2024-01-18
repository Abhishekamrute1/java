package controle;

import java.util.Scanner;

// write a program to check wether a number is divisible by 5 and 11 or not
public class Q5 {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the number");
          int a =sc.nextInt();
         /*if(a%5==0 && a%11==0)
           {
              System.out.println("number is divisible by 5 and 11");
          }
          else if(a%5==0)
         {
          System.out.println("number is divisible by 5");
         }
         else if(a%11==0)
         {
          System.out.println("number is divisible by 11");
         }
         else
        {
          System.out.println("number is not divisible by 5 and 11");
        }*/
        String c = a%5==0 && a%11==0 ?"number is divisible by 5 and 11" :a%5==0 ? "number is divisible by 5":a%11==0 ?"number is divisible by 11" :"number is not divisible by 5 and 11";
   System.out.println(c);
      }
   }
}
